using System;
using System.Collections.Generic;
using System.Text;

namespace CuteCat
{
    public class Cat // internal -> CuteCat namespace만 사용 가능 / public -> 외부에서도 사용 가능
    {
        public string Name;
        public int Age;

        private int Happiness = 50;

        public Cat(string name, int age) // 생성자 -> 접근지정자 public, return 타입 x
        {
            this.Name = name; // this -> 현재 인스턴스를 가리킴
            this.Age = age;
        }

        public void Play()
        {
            Happiness += 10;

            if (Happiness > 100)
            {
                Happiness = 100;
            }
        }

        public void Eat()
        {
            Happiness += 20;

            if (Happiness > 100)
            {
                Happiness = 100;
            }
        }

        public void GetBored()
        {
            Happiness -= 10;

            if (Happiness < 0)
                Happiness = 0;
        }

        public string Express()
        {
            string message = "";

            if (Happiness >= 80)
                message += "I'm very happy.";
            else if (Happiness >= 60)
                message += "I'm happy.";
            else if (Happiness >= 40)
                message += "I'm so so.";
            else if (Happiness >= 20)
                message += "I'm gloomy.";
            else
                message += "I'm sad.";

            return this.Name + " : " + message;
        }
    }
}
