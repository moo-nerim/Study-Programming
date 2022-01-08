from django.urls import path

from . import views

urlpatterns = [
     path('', views.index, name='index'), # views 파일의 index로 연결
]
