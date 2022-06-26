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
    public partial class Calculator : Form
    {
        public Calculator()
        {
            InitializeComponent();
        }

        private void Calculator_Load(object sender, EventArgs e)
        {

        }

        private void HelloLabel_Click(object sender, EventArgs e)
        {
            // HelloLabel.Text = "Hello C#";

            int num1 = 1;
            int num2 = 2;

            int sum = num1 + num2;

            // ToString() : int -> string
            HelloLabel.Text = sum.ToString();
        }

        private void sumNumbers_Click(object sender, EventArgs e)
        {
            int num1 = 0, num2 = 0;

            // 문자열에 null 또는 공백 있는지 확인 -> string.IsNullOrWhiteSpace()
            if (string.IsNullOrWhiteSpace(sum1.Text))
            {
                // 알림창
                MessageBox.Show("입력칸에 숫자를 입력해주세요.");
                return;
            }

            // int.TryParse(string str, out num) -> str을 숫자로 바꿔서 num1에 저장
            if (int.TryParse(sum1.Text, out num1) == false )
            {
                // 알림창
                MessageBox.Show("입력칸에 문자가 들어왔습니다. 숫자를 입력해주세요.");

                // 사용자 배려 -> sum1 입력칸에 포커스
                sum1.SelectAll();
                sum1.Focus();

                return;
            }

            // Convert.ToInt32() : String -> Int
            num1 = Convert.ToInt32(sum1.Text);
            num2 = Convert.ToInt32(sum2.Text);

            int sum = Add(num1,  num2);

            sumResult.Text = sum.ToString();
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
    }
}
