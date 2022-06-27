# 06.26 📝
### console 창에 출력
* Console.WriteLine("Hello C#"); -> 한 줄씩 출력
* Console.Write("Hello C#"); -> 이어서 출력

### Textbox 사용
* HelloLabel.Text = "";

### int -> string
* int변수.ToString();

### string -> int
* int num1 = Convert.ToInt32(sum1.Text);

### 사용자에게 알림창 띄우기
* MessageBox.Show("숫자를 입력해주세요.");

### 입력칸에 포커스(사용자 배려)
* sum1.SelectAll();
sum1.Focus();

### 문자열에 null 또는 공백 확인
* string.IsNullOrWhiteSpace(sum1.Text);

### 문자열을 int로 바꿀 수 있는지 확인
* if (int.TryParse(sum1.Text, out num1) == false )
* sum1.Text를 int형으로 바꿔서 out 타입의 num1에 저장

# 06.27 📝
### enum class (열거형 클래스)
* 형태 -> public enum Operators { Add, Sub, Multi, Div }
* 정수형 상수에 이름을 붙여서 코드를 이해하기 쉽게 해줌
### object sender
* 이벤트 발생 객체
↳ 사용법 : 
Button numButton = (Button)sender;
SetNum(numButton.Text);
### string -> int 형변환
* int num = int.Parse(NumScreen.Text);
* int num = Convert.ToInt32(NumScreen.Text);