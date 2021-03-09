using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TEAM20210222.Control;
using TEAM20210222.View;

namespace Practice0309
{
    class Program
    {
        static void Main(string[] args)
        {
            Menu m = new Menu();
            TeamCtrl tc = new TeamCtrl();

            while (true)
            {
                switch(m.mainMenu())
                {
                    case Menu.menu_main_add:
                        tc.addItem();
                        break;

                    case Menu.menu_main_view:
                        tc.viewItem();
                        break;

                    case Menu.menu_main_random_add:
                        tc.randData(4);
                        break;

                    case Menu.menu_main_delete:
                        tc.delItem(m.delMenu());
                        break;

                    case Menu.menu_main_delete_all:
                        tc.delItemAll();
                        break;

                    case Menu.menu_main_update:
                        tc.updateItem(m.updateMenu());
                        break;

                    case Menu.menu_main_exit:
                        Console.WriteLine("프로그램 종료");
                        Environment.Exit(0);
                        break;
                }
            }
        }
    }
}
