using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Class0208
{
    class Program
    {
        static void Main(string[] args)
        {
            //인스턴스 생성(= 객체 생성)
            Car c = new Car();
            c.Model = "그랜저";
            c.Company = "현대";
            c.Color = "검정";
            c.Price = "4천만원";
            c.showCarInfo();

            // 한 번 쓰면 다시 쓸 수는 없음.
            // new Car().showCarInfo();

            Car c2 = new Car("현대", "녹색", "G80", "6천만원");
            c2.showCarInfo();

            // 입력 처리
            Console.WriteLine("이름 입력 : ");
            string name =  Console.ReadLine();
            Console.WriteLine("이름 : " + name);

            Console.Write("나이 입력 : ");
            int age = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("나이 : " + age);
        }
    }
}
