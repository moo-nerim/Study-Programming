from django.contrib import admin
from .models import Question

# Register your models here.

admin.site.register(Question) # 관리자 페이지에서 Question 모델 확인가능