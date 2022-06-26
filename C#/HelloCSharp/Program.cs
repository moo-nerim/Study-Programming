using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloCSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello C#"); // 콘솔창에 출력 1) Write() = print() 2) WriteLine() = println()
            Console.WriteLine("Hello " + args[0]);
            Console.ReadKey(); 
        }
    }
}
