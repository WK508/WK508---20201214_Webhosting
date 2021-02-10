using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _20210210
{
    class DS2020
    {
        public const string DS = "내셔널리그 중부지구 팀";

        private string team;
        private int year1;
        private string year2;
        private string division;

        public DS2020()
        {
            team = "시카고 컵스";
            year1 = 1876;
            year2 = "1907, 1908, 2016";
            division = "내셔널리그 중부지구 1위";
        }

        public DS2020(string team, int year1, string year2, string division)
        {
            this.team = team;
            this.year1 = year1;
            this.year2 = year2;
            this.division = division;
        }

        public void showDS2020Info()
        {
            Console.WriteLine("팀명 : " + team);
            Console.WriteLine("창단년도 : " + year1);
            Console.WriteLine("우승년도 : " + year2);
            Console.WriteLine("소속 리그/지구/순위 : " + division);
            Console.WriteLine("----------------------------------------------------------------------------------------");
        }
    }

}
