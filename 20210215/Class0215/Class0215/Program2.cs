using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Class0215
{
    class Program2
    {
        static void Main(string[] args)
        {
            string[] name = { "홍길동", "김길동", "박길동", "이길동", "최길동" };
            int[] age = { 20, 25, 30, 35, 40 };
            char[] gender = { '남', '여' };
            string[] address = { "대구시 동구 신암4동", "서울시 송파구 잠실동", "부산시 해운대구 우동",
                "인천시 미추홀구 문학동", "광주시 북구 임동" };


            Student[] st = new Student[10];
            Random r = new Random();

            for (int i = 0; i < st.Length; i++)
            {
                st[i] = new Student(name[r.Next(5)], age[r.Next(5)], 
                    gender[r.Next(2)], address[r.Next(5)]);
            }

            for (int i = 0; i < st.Length; i++)
            {
                st[i].showStudentInfo();
            }

            st[9] = new Student("전우치", 24, '남', "조선 한양 두메산골");
            st[9].showStudentInfo();
           


        }
    }
}