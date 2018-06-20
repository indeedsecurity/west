from django.shortcuts import render
from django.http import HttpResponse
from django.views.decorators.csrf import csrf_exempt


# Create your views here.
def one(request):
    """
    :endpoint: /D001/01
    :description: basic endpoint
    """
    return HttpResponse('D001-01')


def two(request):
    """
    :endpoint: /D001/02
    :description: basic endpoint with HTML response
    """
    response = '''<html>
    <head><title>D001-02</title></head>
    <body><p>D001-02 Test for Django</p></body>
</html>
'''
    return HttpResponse(response)


def three(request):
    """
    :endpoint: /D001/03
    :template: d001/three.html
    :description: basic endpoint with HTML template
    """
    return render(request, 'd001/three.html', None)


def four(request):
    """
    :endpoint: /D001/04
    :method: GET
    :params: a
    :template: d001/four.html
    :description: basic endpoint with one GET parameter
    """
    a = request.GET.get('a')
    return render(request, 'd001/four.html', {'p': a})


@csrf_exempt
def five(request):
    """
    :endpoint: /D001/05
    :method: POST
    :params: b
    :template: d001/four.html
    :description: basic endpoint with one POST parameter
    """
    b = request.POST.get('b')
    return render(request, 'd001/five.html', {'p': b})


def six(request, c):
    """
    :endpoint: /D001/06/(?P<c>[a-zA-Z]+)
    :method: POST
    :params: b
    :template: d001/four.html
    :description: basic endpoint with one path parameter
    """
    return render(request, 'd001/six.html', {'p': c})
