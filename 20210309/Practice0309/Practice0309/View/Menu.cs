using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TEAM20210222.View
{
    class Menu
    {
        public const int menu_main_add = 1;
        public const int menu_main_view = 2;
        public const int menu_main_random_add = 3;
        public const int menu_main_delete = 4;
        public const int menu_main_delete_all = 5;
        public const int menu_main_update = 6;
        public const int menu_main_exit = 7;

        public const int menu_update_NAME = 1;
        public const int menu_update_YEAR1 = 2;
        public const int menu_update_YEAR2 = 3;
        public const int menu_update_DIVISION = 4;
        public const int menu_update_exit = 5;

        public int mainMenu()
        {
            Console.WriteLine("----------------------------------------------------------------------");
            Console.WriteLine("### 메인 메뉴 ###");
            Console.WriteLine("----------------------------------------------------------------------");
            Console.WriteLine("1. 팀 정보 추가");
            Console.WriteLine("2. 팀 정보 보기");
            Console.WriteLine("3. 랜덤 데이터 추가");
            Console.WriteLine("4. 팀 정보 삭제");
            Console.WriteLine("5. 전체 데이터 삭제");
            Console.WriteLine("6. 팀 정보 수정");
            Console.WriteLine("7. 종료");
            Console.WriteLine("----------------------------------------------------------------------");
            Console.Write("메뉴 선택 : ");

            int menu = Convert.ToInt32(Console.ReadLine());
            return menu;
        }

        public string delMenu()
        {
            Console.WriteLine("----------------------------------------------------------------------");
            Console.WriteLine("### 삭제 메뉴 ###");
            Console.WriteLine("----------------------------------------------------------------------");
            Console.Write("삭제할 팀 : ");

            return Console.ReadLine();
        }

        public int updateMenu()
        {
            Console.WriteLine("----------------------------------------------------------------------");
            Console.WriteLine("### 수정 메뉴 ###");
            Console.WriteLine("----------------------------------------------------------------------");
            Console.WriteLine("1. 팀명 수정");
            Console.WriteLine("2. 창단년도 수정");
            Console.WriteLine("3. 우승년도 수정");
            Console.WriteLine("4. 소속 리그/지구/순위 수정");
            Console.WriteLine("5. 종료");
            Console.WriteLine("----------------------------------------------------------------------");
            Console.Write("메뉴 선택 : ");

            int menu = Convert.ToInt32(Console.ReadLine());
            return menu;
        }
            
    }
}
