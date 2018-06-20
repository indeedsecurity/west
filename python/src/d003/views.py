from django.shortcuts import render
from django.template import loader
from django.http import HttpResponse


# Create your views here.
def one(request):
    """
    :endpoint: /D003/01
    :template: d003/three.html
    :description: endpoint with template as Literal
    """
    return render(request, 'd003/three.html', None)


def two(request):
    """
    :endpoint: /D003/02
    :template: d003/three.html
    :description: endpoint with template as Member Reference
    """
    template = 'd003/three.html'
    return render(request, template, None)


def three(request):
    """
    :endpoint: /D003/03
    :template: d003/three.html
    :description: endpoint with template as Member Reference with Binary Operation
    """
    directory = 'd003'
    file = 'three.html'
    template = directory + '/' + file
    return render(request, template, None)


def four(request):
    """
    :endpoint: /D003/04
    :template: d003/three.html
    :description: endpoint with template using loader()
    """
    template = loader.get_template('d003/three.html')
    return HttpResponse(template.render(None, request))
