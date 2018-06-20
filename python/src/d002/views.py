from django.shortcuts import render
from django.views.decorators.csrf import csrf_exempt


# Create your views here.
def one(request):
    """
    :endpoint: /D002/01
    :method: GET
    :params: a, b
    :template: d002/one.html
    :description: endpoint with two GET parameters
    """
    a = request.GET.get('a')
    b = request.GET.get('b')
    return render(request, 'd002/one.html', {'a': a, 'b': b})


@csrf_exempt
def two(request):
    """
    :endpoint: /D002/02
    :method: POST
    :params: c, d
    :template: d002/two.html
    :description: endpoint with two POST parameters
    """
    c = request.POST.get('c')
    d = request.POST.get('d')
    return render(request, 'd002/two.html', {'c': c, 'd': d})


def three(request):
    """
    :endpoint: /D002/03
    :method: GET
    :params: e
    :template: d002/three.html
    :description: endpoint with one GET parameter using GET[]
    """
    e = request.GET['e']
    return render(request, 'd002/three.html', {'e': e})


@csrf_exempt
def four(request):
    """
    :endpoint: /D002/04
    :method: POST
    :params: f
    :template: d002/four.html
    :description: endpoint with one POST parameter using POST[]
    """
    f = request.POST['f']
    return render(request, 'd002/four.html', {'f': f})


def five(request):
    """
    :endpoint: /D002/05
    :method: GET
    :params: g
    :template: d002/five.html
    :description: endpoint with one GET parameter from template
    """
    return render(request, 'd002/five.html', None)


@csrf_exempt
def six(request):
    """
    :endpoint: /D002/06
    :method: POST
    :params: h
    :template: d002/six.html
    :description: endpoint with one POST parameter from template
    """
    return render(request, 'd002/six.html', None)


def seven(request):
    """
    :endpoint: /D002/07
    :method: GET
    :params: i, j
    :template: d002/seven.html
    :description: endpoint with one GET parameter from view and one GET parameter from template
    """
    i = request.GET.get('i')
    return render(request, 'd002/seven.html', {'i': i})
