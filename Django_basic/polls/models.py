import datetime

from django.db import models
from django.utils import timezone

# database 모델
# Create your models here.
class Question(models.Model):
    question_text = models.CharField(max_length=200) # 데이터 타입 -> char
    pub_date = models.DateTimeField('date published') # 데이터 타입 -> 시간
    
    def __str__(self):
        return self.question_text
    
    def was_published_recently(self):
        return self.pub_date >= timezone.now() - datetime.timedelta(days=1)
    
class Choice(models.Model):
    question = models.ForeignKey(Question, on_delete=models.CASCADE) 
    # Question model을 참조/ question은 Question model을 가리킴
    # 하나의 Question은 여러개의 Choice를 가짐 => 1:다
    
    choice_text = models.CharField(max_length=200)
    votes = models.IntegerField(default=0)

    def __str__(self):
        return self.choice_text