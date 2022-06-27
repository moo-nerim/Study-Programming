using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloCSharpWin
{
    public enum Operators { Add, Sub, Multi, Div } // 열거형 데이터 타입

    public partial class Calculator : Form
    {
        public int Result = 0;
        public bool isNewNum = true;
        public Operators op = Operators.Add;

        public Calculator()
        {
            InitializeComponent();
        }

        public int Add(int num1, int num2)
        {
            return num1 + num2;
        }
        
        // 오버로딩
        public float Add(float num1, float num2)
        {
            return num1 + num2;
        }

        public int Sub(int num1, int num2)
        {
            return num1 - num2;
        }

        private void NumButton1_Click(object sender, EventArgs e) // sender -> 이벤트 발생 객체
        {
            Button numButton = (Button)sender;
            SetNum(numButton.Text);
        }

        public void SetNum(String num)
        {
            if (isNewNum) // 새로운 숫자 입력 시작
            {
                NumScreen.Text = num;
                isNewNum = false;
            }
            else if (NumScreen.Text == "0")
            {
                NumScreen.Text = num;
            }
            else
            {
                NumScreen.Text += num;
            }
        }

        private void NumPlus_Click(object sender, EventArgs e)
        {
            if (isNewNum == false) // 연산자가 여러번 동시에 눌러지는 경우 예외처리
            {
                int num = int.Parse(NumScreen.Text); // string -> int
                if (op == Operators.Add)
                {
                    Result = Add(Result, num);
                }
                else if (op == Operators.Sub)
                {
                    Result = Sub(Result, num);
                }

                NumScreen.Text = Result.ToString();
                isNewNum = true;

                Button opButton = (Button)sender;
                if (opButton.Text == "+")
                {
                    op = Operators.Add;
                }
                else if (opButton.Text == "-")
                {
                    op = Operators.Sub;
                }
            }
        }

        private void NumClear_Click(object sender, EventArgs e)
        {
            Result = 0;
            isNewNum = true;
            op = Operators.Add;

            NumScreen.Text = "0";
        }
    }
}
