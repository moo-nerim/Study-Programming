# 06.29 📝
### class 접근 지정자
* internal -> class가 포함된 namespace만 사용 가능
* public -> 외부에서도 접근해서 사용 가능
### 생성자
* 접근 지정자 public
* return 타입 X
### this 키워드
* this.변수 
↳ this : 현재 인스턴스를 가리킴
### 인스턴스 생성
* Cat myCat = new Cat();
### Timer
* Enabled = true -> 컴파일 시에 타이머 시작
* Interval = 5000/ms -> 타이머 간격 설정 (초 단위)
* Event Tick -> Interval 만큼 Tick() 호출