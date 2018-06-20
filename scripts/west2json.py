import sys
import getopt
import os
import json
import errno


ENDPOINT_KEY = "endpoint:"
METHOD_KEY = "method:"
PARAMS_KEY = "params:"
TEMPLATE_KEY = "template:"
DESCRIPTION_KEY = "description:"

JAVA_PREFIX_KEY = "@"
JAVA_COMMENT_START = "/**"
JAVA_COMMENT_END = "*/"
JAVA_SOURCE_CONTEXT = "java/src/main/java"
JAVA_WEB_CONTEXT = "java/src/main/webapp"

PYTHON_PREFIX_KEY = ":"
PYTHON_COMMENT = '"""'
PYTHON_SOURCE_CONTEXT = "python/src"
PYTHON_TEMPLATES_CONTEXT = "/templates/"


def usage():
    print("west2json -h [directory]")
    print("          -h help")


def _get_attrs(key, line):
    i = line.find(key)
    a = line[i+len(key):].strip()
    return [v.strip() for v in a.split(",")]


def _get_attr(key, line):
    i = line.find(key)
    return line[i+len(key):].strip()


def add_context(entry, filepath, source_context, web_context):
    if source_context in filepath:
        i = filepath.find(source_context)
        entry["filepath"] = filepath[i:]
    if "templates" in entry:
        entry["templates"] = [web_context + j for j in entry["templates"]]
    return entry


def parse_west_file(west_file, prefix, comment_start, comment_end):
    # Create tags from prefix
    endpoint_tag = prefix + ENDPOINT_KEY
    method_tag = prefix + METHOD_KEY
    params_tag = prefix + PARAMS_KEY
    template_tag = prefix + TEMPLATE_KEY
    description_tag = prefix + DESCRIPTION_KEY

    endpoints = []
    entry = {"endpoints": [], "methods": [], "params": [], "templates": []}
    switch = False
    for line in open(west_file):

        # Parse each of the comments blocks
        if not switch:
            if comment_start in line:
                switch = True
        else:
            if endpoint_tag in line:
                a = _get_attrs(endpoint_tag, line)
                entry["endpoints"].extend(a)
            elif method_tag in line:
                a = _get_attrs(method_tag, line)
                entry["methods"].extend(a)
            elif params_tag in line:
                a = _get_attrs(params_tag, line)
                entry["params"].extend(a)
            elif template_tag in line:
                a = _get_attrs(template_tag, line)
                entry["templates"].extend(a)
            elif description_tag in line:
                a = _get_attr(description_tag, line)
                entry["description"] = a
            elif comment_end in line:
                switch = False
                if entry["endpoints"] or entry["methods"] or entry["params"] or entry["templates"]:
                    endpoints.append(entry)
                    entry = {"endpoints": [], "methods": [], "params": [], "templates": []}
    return endpoints


def main(west):
    # Check if WEST is valid
    if not os.path.isdir(west):
        raise FileNotFoundError(errno.ENOENT, os.strerror(errno.ENOENT), west)

    endpoints = []
    javadir = west.rstrip("/") + "/java"
    pythondir = west.rstrip("/") + "/python"

    # Walk Java
    if os.path.isdir(javadir):
        for path, dirs, files in os.walk(javadir):
            for f in files:
                if f.endswith(".java"):
                    java = os.path.join(path, f)
                    for e in parse_west_file(java, JAVA_PREFIX_KEY, JAVA_COMMENT_START, JAVA_COMMENT_END):
                        e = add_context(e, java, JAVA_SOURCE_CONTEXT, JAVA_WEB_CONTEXT)
                        endpoints.append(e)

    # Walk Python
    if os.path.isdir(pythondir):
        for path, dirs, files in os.walk(pythondir):
            for f in files:
                if f == "views.py":
                    python = os.path.join(path, f)
                    for e in parse_west_file(python, PYTHON_PREFIX_KEY, PYTHON_COMMENT, PYTHON_COMMENT):
                        i = path.find(PYTHON_SOURCE_CONTEXT)
                        web_context = path[i:] + PYTHON_TEMPLATES_CONTEXT
                        e = add_context(e, python, PYTHON_SOURCE_CONTEXT, web_context)
                        endpoints.append(e)

    return endpoints

if __name__ == "__main__":
    try:
        opts, args = getopt.getopt(sys.argv[1:], "h")
    except getopt.GetoptError as e:
        print(str(e))
        usage()
        sys.exit(1)

    west = None
    for o, a in opts:
        if o == "-h":
            usage()
            sys.exit(0)

    if len(args) < 1:
        print("WEST directory is required!")
        usage()
        sys.exit(1)

    endpoints = main(args[0])
    print(json.dumps(endpoints, indent=1))
    sys.exit(0)
