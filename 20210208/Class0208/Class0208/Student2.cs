using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Class0208
{
    class Student2
    {
        // 인스턴스 변수(속성)
        private string name;
        private string tel;

        // 클래스 변수
        // public static final CLASS와 동일
        public const string CLASS = "JAVA, C# 응용프로그램 개발자";

        public Student2()
        {
            name = "마이크 트라웃";
            tel = "010-1010-1010";
        }

        public Student2(string name, string tel)
        {
            this.name = name;
            this.tel = tel;
        }

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public string Tel
        {
            get { return tel; }
            set { tel = value; }
        }

        public void printStudentInfo()
        {
            Console.WriteLine("과정 : " + Student2.CLASS);
            Console.WriteLine("이름 : " + name);
            Console.WriteLine("전화번호 : " + tel);
            Console.WriteLine("----------------------------------------");
        }

    }
}
