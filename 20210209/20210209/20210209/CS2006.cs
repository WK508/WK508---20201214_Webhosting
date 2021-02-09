using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _20210209
{
    class CS2006
    {
        public const string CS = "2006 ALCS 진출팀";

        private string team;
        private int year1;
        private string year2;
        private string division;

        public CS2006()
        {
            team = "DETROIT TIGERS";
            year1 = 1894;
            year2 = "1935, 1945, 1968, 1984";
            division = "아메리칸리그 중부지구 1위";
        }

        public CS2006(string team, int year1, string year2, string division)
        {
            this.team = team;
            this.year1 = year1;
            this.year2 = year2;
            this.division = division;
        }

        public void showCS2006Info()
        {
            Console.WriteLine("팀명 : " + team);
            Console.WriteLine("창단년도 : " + year1);
            Console.WriteLine("우승년도 : " + year2);
            Console.WriteLine("소속 리그/지구/순위 : " + division);
            Console.WriteLine("---------------------------------------------------------------------------");
        }
    }

    
}
