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