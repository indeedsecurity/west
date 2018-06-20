from django.conf.urls import url

from . import views

urlpatterns = [
    url(r'^01/(?P<a>[a-zA-Z]+)$', views.one, name='one'),
    url(r'^02/(?P<b>[a-zA-Z]+)/(?P<c>[0-9]+)$', views.two, name='two'),
    url(r'^03/(?P<d>[a-zA-Z0-9_-]{5})$', views.three, name='three'),
    url(r'^04/(?P<e>[a-zA-Z]+)-(?P<f>[0-9]+)$', views.four, name='four')
]
