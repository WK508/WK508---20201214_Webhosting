using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AddressTest0218
{
    class Program
    {
        const int MENU_ADD = 1;
        const int MENU_VIEW = 2;
        const int MENU_RANDOM_ADD = 3;
        const int MENU_DELETE = 4;
        const int MENU_DELETE_ALL = 5;
        const int MENU_EXIT = 6;

        static Student0218 stud;
        static List<Student0218> addrList =
            new List<Student0218>();
        static void Main(string[] args)
        {

            while (true)
            {

                switch (getMenu())
                {
                    case MENU_ADD:
                        addItem();
                        break;
                    case MENU_VIEW:
                        viewItem();
                        break;
                    case MENU_RANDOM_ADD:
                        addRandomData();
                        break;
                    case MENU_DELETE:
                        delItem();
                        break;
                    case MENU_DELETE_ALL:
                        delItemAll();
                        break;

                    case MENU_EXIT:
                        Console.WriteLine("프로그램 종료");
                        Environment.Exit(0);
                        break;

                }
            }
        }

        public static void addItem()
        {
            Console.WriteLine("------------------------");
            Console.WriteLine("주소록 정보 추가");
            Console.WriteLine("------------------------");
            Console.Write("이름 : ");
            string name = Console.ReadLine();
            Console.Write("전화번호 : ");
            string tel = Console.ReadLine();
            Console.Write("주소 : ");
            string address = Console.ReadLine();
            Console.Write("이메일 : ");
            string email = Console.ReadLine();
            addrList.Add(
                new Student0218(name, tel, address, email));
            Console.WriteLine("정보가 정상적으로 입력되었습니다.");
            /*Student0218 st = new Student0218(name, tel, address, email);
            return st; */
            // return new Student0218(name, tel, address, email);
        }

        public static void viewItem()
        {
            for (int i = 0; i < addrList.Count; i++)
            {
                Console.WriteLine("번호 : " + (i + 1));
                Console.WriteLine("이름 : " + addrList[i].Name);
                Console.WriteLine("전화번호 : " + addrList[i].Tel);
                Console.WriteLine("주소 : " + addrList[i].Address);
                Console.WriteLine("이메일 : " + addrList[i].Email);
                Console.WriteLine("---------------------------------");
            }
        }

        public static void addRandomData()
        {
            string[] name = { "홍길동", "김길동", "박길동", "이길동", "최길동", "전우치" };
            string[] tel = { "1111", "3333", "5555", "7777", "9999", "6666" };
            string[] address = { "서울", "대전", "대구", "부산", "인천", "울산" };
            string[] email = { "야도란나시발챙이@", "조온마난색기@", "드라이식기@", "그레이색이야@", "씨벨롬@", "스바시바@" };

            Random r = new Random();
            for (int i = 0; i < 10; i++)
            {
                addrList.Add(new Student0218(
                name[r.Next(6)],
                tel[r.Next(6)],
                address[r.Next(6)],
                email[r.Next(6)]));
            }
        }
        public static int getMenu()
        {
            Console.WriteLine("------------------------");
            Console.WriteLine("1. 주소록 정보 추가");
            Console.WriteLine("2. 주소록 정보 보기");
            Console.WriteLine("3. 랜덤 데이터 추가");
            Console.WriteLine("4. 주소록 정보 삭제");
            Console.WriteLine("5. 전체 데이터 삭제");
            Console.WriteLine("6. 종료");
            Console.WriteLine("------------------------");
            Console.Write("메뉴 선택 : ");

            int menu = Convert.ToInt32(Console.ReadLine());
            return menu;
        }

        static void delItem()
        {
            Console.WriteLine("---------------------");
            Console.WriteLine("주소록 정보 삭제");
            Console.WriteLine("---------------------");
            Console.Write("삭제할 이름 : ");
            string name = Console.ReadLine();

            for (int i = 0; i <addrList.Count; i++)
            {
                if (name.Equals(addrList[i].Name))
                {
                    addrList.RemoveAt(i--);
                }
            }
            /*
            int cnt = 0;
            while (cnt < addrList.Count)
            for (int i = 0; i < addrList.Count; i++)
            {
                if (name.Equals(addrList[i].Name))
                {
                    addrList.RemoveAt(i);
                }
                else
                {
                    cnt++;
                }
            }
            */
        }

        static void delItemAll()
        {
            addrList.Clear();
        }
    }

    
}
