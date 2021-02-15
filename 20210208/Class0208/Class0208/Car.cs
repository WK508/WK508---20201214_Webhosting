using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Class0208
{
    class Car
    {
        // 클래스 상수 변수(클래스변수화)
        public const string DAERI = "동대구 영업소";

        // 인스턴스 변수(캡슐화)
        private string company;
        private string color;
        private string model;
        private string price;

        // 기본 생성자
        public Car()
        {
              
        }

        // 일반 생성자(오버로딩)
        public Car(string company, string color, string model, string price)
        {
            // this의 역할 : 다른 변수와의 충돌 방지, 객체의 시작 위치
            this.company = company;
            this.color = color;
            this.model = model;
            this.price = price;
        } 

        public string Company
        {
            get { return company; }
            set { company = value; }
        }

        public string Color { get => color; set => color = value; }
        public string Model { get => model; set => model = value; }
        public string Price { get => price; set => price = value; }

        public void showCarInfo()
        {
            Console.WriteLine("제조회사 : " + company);
            Console.WriteLine("색상 : " + color);
            Console.WriteLine("모델명 : " + model);
            Console.WriteLine("가격 : " + price);
            Console.WriteLine("지점 : " + DAERI);
            Console.WriteLine("--------------------------------");
        }
    }
}
