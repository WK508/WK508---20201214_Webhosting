using MLBTEAM.Control;
using MLBTEAM.View;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MLBTEAM
{
    class Program
    {
        static void Main(string[] args)
        {
            Menu m = new Menu();
            MLBTEAM_Ctrl mc = new MLBTEAM_Ctrl();

            while (true)
            {
                switch(m.mainMenu())
                {
                    case Menu.menu_main_add:
                        mc.addItem();
                        break;

                    case Menu.menu_main_view:
                        mc.viewItem();
                        break;

                    case Menu.menu_main_random_add:
                        mc.randData(4);
                        break;

                    case Menu.menu_main_delete:
                        mc.delItem(m.delMenu());
                        break;

                    case Menu.menu_main_delete_all:
                        mc.delItemAll();
                        break;

                    case Menu.menu_main_update:
                        mc.updateItem(m.updateMenu());
                        break;

                    case Menu.menu_main_exit:
                        Console.Write("프로그램 종료");
                        Environment.Exit(0);
                        break;
                }
            }
        }
    }
}
