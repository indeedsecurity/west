from django.shortcuts import render


# Create your views here.
def one(request, a):
    """
    :endpoint: /D004/01/(?P<a>[a-zA-Z]+)
    :template: d004/four.html
    :description: endpoint with one URL named capture
    """
    return render(request, 'd004/four.html', {'a': a})


def two(request, b, c):
    """
    :endpoint: /D004/02/(?P<b>[a-zA-Z]+)/(?P<c>[0-9]+)
    :template: d004/four.html
    :description: endpoint with two URL named captures
    """
    return render(request, 'd004/four.html', {'b': b, 'c': c})


def three(request, d):
    """
    :endpoint: /D004/03/(?P<d>[a-zA-Z0-9_-]{5})
    :template: d004/four.html
    :description: endpoint with one URL named capture
    """
    return render(request, 'd004/four.html', {'d': d})


def four(request, e, f):
    """
    :endpoint: /D004/04/(?P<e>[a-zA-Z]+)-(?P<f>[0-9]+)
    :template: d004/four.html
    :description: endpoint with two URL named captures in same path element
    """
    return render(request, 'd004/four.html', {'e': e})
