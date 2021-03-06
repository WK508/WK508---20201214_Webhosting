﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Class0215
{
    class Student
    {
        private string name;
        private int age;
        private char gender;
        private string address;

        public string Name { get => name; set => name = value; }
        public int Age { get => age; set => age = value; }
        public char Gender { get => gender; set => gender = value; }
        public string Address { get => address; set => address = value; }

        public Student()
        {
            name = "홍길동";
            age = 20;
            gender = '남';
            address = "대구시 동구 신암4동";
        }

        public Student(string name, int age, char gender, string address)
        {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.address = address;
        }

        public void showStudentInfo()
        {
            Console.WriteLine("이름 : " + name);
            Console.WriteLine("나이 : " + age);
            Console.WriteLine("성별 : " + gender);
            Console.WriteLine("주소 : " + address);
            Console.WriteLine("----------------------------------------");
        }
    }
}
