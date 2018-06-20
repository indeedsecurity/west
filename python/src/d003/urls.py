from django.conf.urls import url

from . import views

urlpatterns = [
    url(r'^01$', views.one, name='one'),
    url(r'^02$', views.two, name='two'),
    url(r'^03$', views.three, name='three'),
    url(r'^04$', views.four, name='four')
]
