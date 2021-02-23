using MLBTEAM.Util;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MLBTEAM.Control
{
    class MLBTEAM_Ctrl
    {
        List<MLBTEAM_Ctrl> addrList =
            new List<MLBTEAM_Ctrl>();

        RandData rand;

        public string Name { get; private set; }
        public string Year1 { get; private set; }
        public string Year2 { get; private set; }
        public string Division { get; private set; }

        public MLBTEAM_Ctrl()
        {
            rand = new RandData(new Random());
        }

        public MLBTEAM_Ctrl(string v1, string v2, string v3, string v4, string v5)
        {
        }

        public MLBTEAM_Ctrl(string name, string year1, string year2, string division)
        {
            Name = name;
            Year1 = year1;
            Year2 = year2;
            Division = division;
        }

        public void addItem()
        {
            Console.WriteLine("-----------------------------------------------------------------------------------");
            Console.WriteLine("팀 정보 입력");
            Console.WriteLine("-----------------------------------------------------------------------------------");
            Console.Write("팀명 : ");
            string name = Console.ReadLine();
            Console.Write("창단년도 : ");
            string year1 = Console.ReadLine();
            Console.Write("우승년도 : ");
            string year2 = Console.ReadLine();
            Console.Write("소속 리그/지구/순위 : ");
            string division = Console.ReadLine();

            addrList.Add(new MLBTEAM_Ctrl(name, year1, year2, division));
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
                Console.WriteLine("-----------------------------------------------------------------------------------");
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
                addrList.Add(new MLBTEAM_Ctrl(rand.getId(),
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
