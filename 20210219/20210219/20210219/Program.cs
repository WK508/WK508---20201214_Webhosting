using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _20210219
{
    class Program
    {
        const int menu_add = 1;
        const int menu_view = 2;
        const int menu_random_add = 3;
        const int menu_delete = 4;
        const int menu_delete_all = 5;
        const int menu_exit = 6;

        static Team t;
        static List<Team> addrList =
            new List<Team>();

        static void Main(string[] args)
        {
           while (true)
            {
                switch (getMenu())
                {
                    case menu_add:
                        addItem();
                        break;

                    case menu_view:
                        viewItem();
                        break;

                    case menu_random_add:
                        addRandomData();
                        break;

                    case menu_delete:
                        delItem();
                        break;

                    case menu_delete_all:
                        delItemAll();
                        break;

                    case menu_exit:
                        Console.WriteLine("프로그램 종료");
                        Environment.Exit(0);
                        break;
                }
            }
        }

        public static void addItem()
        {
            Console.WriteLine("---------------------------------------------------------");
            Console.WriteLine("팀 정보 추가");
            Console.WriteLine("---------------------------------------------------------");
            Console.Write("팀명 : ");
            string name = Console.ReadLine();
            Console.Write("창단년도 : ");
            string year1 = Console.ReadLine();
            Console.Write("우승년도 : ");
            string year2 = Console.ReadLine();
            Console.Write("소속 리그/지구/순위 : ");
            string division = Console.ReadLine();

            addrList.Add(new Team(name, year1, year2, division));
        }

        public static void viewItem()
        {
            for (int i = 0; i < addrList.Count; i++)
            {
                Console.WriteLine("번호 : " + (i + 1));
                Console.WriteLine("팀명 : " + addrList[i].Name);
                Console.WriteLine("창단년도 : " + addrList[i].Year1);
                Console.WriteLine("우승년도 : " + addrList[i].Year2);
                Console.WriteLine("소속 리그/지구/순위 : " + addrList[i].Division);
                Console.WriteLine("---------------------------------------------------------");
            }
        }

        public static void addRandomData()
        {
            string[] name = { "필라델피아 필리스", "탬파베이 레이스", "LA 다저스", "보스턴 레드삭스" };
            string[] year1 = { "1883", "1998", "1884", "1901" };
            string[] year2 = { "1980, 2008", 
                               "없음", 
                               "1955, 1959, 1963, 1965, 1981, 1988, 2020", 
                               "1903, 1912, 1915, 1916, 1918, 2004, 2007, 2013, 2018" };
            string[] division = {"내셔널리그 동부지구 1위", "아메리칸리그 동부지구 1위",
                                 "내셔널리그 서부지구 1위", "아메리칸리그 동부지구 2위"};

            Random r = new Random();
            for (int i = 0; i < 4; i++)
            {
                addrList.Add(new Team(name[r.Next(4)], year1[r.Next(4)], year2[r.Next(4)], division[r.Next(4)]));
            }
        }

        public static int getMenu()
        {
            Console.WriteLine("---------------------------------------------------------");
            Console.WriteLine("1. 팀 정보 추가");
            Console.WriteLine("2. 팀 정보 보기");
            Console.WriteLine("3. 랜덤 데이터 추가");
            Console.WriteLine("4. 팀 정보 삭제");
            Console.WriteLine("5. 전체 데이터 삭제");
            Console.WriteLine("6. 종료");
            Console.WriteLine("---------------------------------------------------------");
            Console.Write("메뉴 선택 : ");

            int menu = Convert.ToInt32(Console.ReadLine());
            return menu;
        }

        static void delItem()
        {
            Console.WriteLine("---------------------------------------------------------");
            Console.WriteLine("팀 정보 삭제");
            Console.WriteLine("---------------------------------------------------------");
            Console.Write("삭제할 팀 : ");
            string name = Console.ReadLine();

            for (int i = 0; i < addrList.Count; i++)
            {
                if (name.Equals(addrList[i].Name))
                {
                    addrList.RemoveAt(i);
                }
            }
        }

        static void delItemAll()
        {
            addrList.Clear();
        }
    }
}
