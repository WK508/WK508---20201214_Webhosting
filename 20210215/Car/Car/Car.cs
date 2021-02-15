using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Car
{
    class Car
    {
        private string model;
        private int year;
        private string color;
        private string company;
        private string price;
        private string name;
        private string tel;
        private string address;

        public Car(string model, int year, string color, string company, string price, 
            string name, string tel, string address)
        {
            this.model = model;
            this.year = year;
            this.color = color;
            this.company = company;
            this.price = price;
            this.name = name;
            this.tel = tel;
            this.address = address;
        }

        public string Model { get => model; set => model = value; }
        public int Year { get => year; set => year = value; }
        public string Color { get => color; set => color = value; }
        public string Company { get => company; set => company = value; }
        public string Price { get => price; set => price = value; }
        public string Name { get => name; set => name = value; }
        public string Tel { get => tel; set => tel = value; }
        public string Address { get => address; set => address = value; }

        public void showCarInfo()
        {
            Console.WriteLine("이름 : " + name);
            Console.WriteLine("전화번호 : " + tel);
            Console.WriteLine("주소 : " + address);
            Console.WriteLine("모델명 : " + model);
            Console.WriteLine("색상 : " + color);
            Console.WriteLine("년도 : " + year);
            Console.WriteLine("제조사 : " + company);
            Console.WriteLine("가격 : " + price);
            Console.WriteLine("------------------------------------");
        }
    }
}
