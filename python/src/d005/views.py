from django.shortcuts import render


# Create your views here.
def one(request):
    """
    :endpoint: /D005/01
    :method: GET
    :params: a
    :template: d005/five.html
    :description: endpoint with one parameter from one wrapper method
    """
    a = _one_lone(request)
    return render(request, 'd005/five.html', {'a': a})


def two(request):
    """
    :endpoint: /D005/02
    :method: GET
    :params: b, c
    :template: d005/five.html
    :description: endpoint with two parameters from one wrapper method
    """
    b, c = _two_lone(request)
    return render(request, 'd005/five.html', {'b': b, 'c': c})


def three(request):
    """
    :endpoint: /D005/03
    :method: GET
    :params: d
    :template: d005/five.html
    :description: endpoint with one parameter from two wrapper methods
    """
    d = _three_ltwo(request)
    return render(request, 'd005/five.html', {'d': d})


def four(request):
    """
    :endpoint: /D005/04
    :method: GET
    :params: e, f
    :template: d005/five.html
    :description: endpoint with two parameters from two wrapper methods
    """
    e, f = _four_ltwo(request)
    return render(request, 'd005/five.html', {'e': e, 'f': f})


def five(request):
    """
    :endpoint: /D005/05
    :method: GET
    :params: g, h
    :template: d005/five.html
    :description: endpoint with two parameters from two different wrapper methods
    """
    g, h = _five_ltwo(request)
    return render(request, 'd005/five.html', {'g': g, 'h': h})


def _one_lone(request):
    return request.GET.get('a')


def _two_lone(request):
    return request.GET.get('b'), request.GET.get('c')


def _three_ltwo(request):
    return _three_lone(request)


def _three_lone(request):
    return request.GET.get('d')


def _four_ltwo(request):
    return _four_lone(request)


def _four_lone(request):
    return request.GET.get('e'), request.GET.get('f')


def _five_ltwo(request):
    return request.GET.get('g'), _five_lone(request)


def _five_lone(request):
    return request.GET.get('h')
