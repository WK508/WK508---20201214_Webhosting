using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _21._02._18
{
    class Program
    {
        const int MENU_ADD = 1;
        const int MENU_VIEW = 2;
        const int MENU_RANDOM_ADD = 3;
        const int MENU_EXIT = 4;

        static _1988LCS_Team _1988;
        static List<_1988LCS_Team> addrList = 
            new List<_1988LCS_Team>();
        static void Main(string[] args)
        {
            while (true)
            {
                switch(getMenu())
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

                    case MENU_EXIT:
                        Console.WriteLine("프로그램 종료");
                        Environment.Exit(0);
                        break;
                }
            }
        }

        public static void addItem()
        {
            Console.WriteLine("----------------------------------------------------------------");
            Console.WriteLine("팀 정보 추가");
            Console.WriteLine("----------------------------------------------------------------");
            Console.Write("팀명 : ");
            string name = Console.ReadLine();
            Console.Write("창단년도 : ");
            string year1 = Console.ReadLine();
            Console.Write("우승년도 : ");
            string year2 = Console.ReadLine();
            Console.Write("소속 리그/지구/순위 : ");
            string division = Console.ReadLine();
            addrList.Add(
                new _1988LCS_Team(name, year1, year2, division));
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
                Console.WriteLine("----------------------------------------------------------------");

            }
        }
        public static void addRandomData()
        {
            string[] name = { "LA DODGERS", "OAKLAND ATHLETICS", "NEW YORK METS", "BOSTON REDSOX" };
            string[] year1 = { "1884", "1901", "1962", "1901" };
            string[] year2 = { "1955, 1959, 1963, 1965, 1981, 1988, 2020", 
                               "1910, 1911, 1913, 1929, 1930, 1972, 1973, 1974, 1989", 
                               "1969, 1986", 
                               "1903, 1912, 1915, 1916, 1918, 2004, 2007, 2013, 2018" };
            string[] division = { "내셔널리그 서부지구 1위", 
                                  "아메리칸리그 서부지구 1위", 
                                  "내셔널리그 동부지구 1위", 
                                  "아메리칸리그 동부지구 1위" };

            Random r = new Random();
            for (int i = 0; i < 4; i++)
            {
                addrList.Add(new _1988LCS_Team(name[r.Next(4)], year1[r.Next(4)], 
                             year2[r.Next(4)], division[r.Next(4)]));
            }
        }

        public static int getMenu()
        {
            Console.WriteLine("----------------------------------------------------------------");
            Console.WriteLine("1. 팀 정보 추가");
            Console.WriteLine("2. 팀 정보 보기");
            Console.WriteLine("3. 랜덤 데이터 추가");
            Console.WriteLine("4. 종료");
            Console.WriteLine("----------------------------------------------------------------");
            Console.Write("메뉴 선택 : ");

            int menu = Convert.ToInt32(Console.ReadLine());
            return menu;
        }
    }
}
