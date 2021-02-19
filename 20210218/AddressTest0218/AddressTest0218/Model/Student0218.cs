using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AddressTest0218
{
    class Student0218
    {
        private string id;
        private string name;
        private string tel;
        private string address;
        private string email;
        private static Student0218 inst;

        public static Student0218 getInst()
        {
            if (inst == null)
            {
                inst = new Student0218();
            }
            return inst;
        }

        public Student0218() {}

        public Student0218(string name, string tel, 
            string address, string email)
        {
            this.name = name;
            this.tel = tel;
            this.address = address;
            this.email = email;
        }

        public Student0218(string id, string name, string tel, string address, string email) : this(name, tel, address, email)
        {
            this.id = id;
        }

        public string Name { get => name; set => name = value; }
        public string Tel { get => tel; set => tel = value; }
        public string Address { get => address; set => address = value; }
        public string Email { get => email; set => email = value; }
        public string Id { get => id; set => id = value; }

        /*public void showAddressInfo()
        {
            Console.WriteLine("이름 : {0}", name);
            Console.WriteLine("전화 : " + tel);
            Console.WriteLine("주소 : " + address);
            Console.WriteLine("이메일 : " + email);
            Console.WriteLine("---------------------------");
        } */
    }
}
