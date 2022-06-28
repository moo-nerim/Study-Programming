using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CuteCat
{
    public partial class Form1 : Form
    {
        Cat myCat = new Cat("Navi",1);

        public Form1()
        {
            InitializeComponent();
        }

        private void Play_Click(object sender, EventArgs e)
        {
            myCat.Play();
            CatScreen.Text = myCat.Express();
        }

        private void Feed_Click(object sender, EventArgs e)
        {
            myCat.Eat();
            CatScreen.Text = myCat.Express();
        }

        private void CatTimer_Tick(object sender, EventArgs e) // Timer에서 정한 시간마다 호출
        {
            myCat.GetBored();
            CatScreen.Text = myCat.Express();
        }
    }
}
