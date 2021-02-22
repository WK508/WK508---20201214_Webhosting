using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TEAM20210222.Model;
using TEAM20210222.Util;

namespace TEAM20210222.Control
{
    class TeamCtrl
    {
        List<Team> addrList =
            new List<Team>();

        RandData rand;

        public TeamCtrl()
        {
            rand = new RandData(new Random());
        }


        public void addItem()
        {
            Console.WriteLine("------------------------------------------------------------");
            Console.WriteLine("팀 정보 입력");
            Console.WriteLine("------------------------------------------------------------");
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

        public void viewItem()
        {
            for (int i = 0; i < addrList.Count; i++)
            {
                Console.WriteLine("번호 : " + (i + 1));
                Console.WriteLine("팀명 : " + addrList[i].Name);
                Console.WriteLine("창단년도 : " + addrList[i].Year1);
                Console.WriteLine("우승년도 : " + addrList[i].Year2);
                Console.WriteLine("소속 리그/지구/순위 : " + addrList[i].Division);
                Console.WriteLine("----------------------------------------------------------------------");
            }
        }

        public void delItem(string name)
        {
            for (int i = 0; i < addrList.Count; i++)
            {
                if (name.Equals(addrList[i].Name))
                {
                    addrList.RemoveAt(i--);
                }
            }
        }

        public void delItemAll()
        {
            addrList.Clear();
        }

        public void randData(int count)
        {
            for (int i = 0; i < count; i++)
            {
                addrList.Add(new Team(rand.getId(),
                    rand.getName(),
                    rand.getYear1(),
                    rand.getYear2(),
                    rand.getDivision()));
            }
        }

        public void updateItem(int menu)
        {

        }
    }

   
    }


