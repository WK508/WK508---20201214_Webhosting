using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Class0208
{
    class WS2006
    {
        public const string WS = "2006 월드시리즈 진출팀";

        private string team;
        private int year1;
        private string year2;
        private string division;

        public WS2006()
        {
            team = "세인트루이스 카디널스";
            year1 = 1882;
            year2 = "1926, 1931, 1934, 1942, 1944, 1946, 1964, 1967, 1982, 2006, 2011";
            division = "내셔널리그 중부지구 1위";
        }

        public WS2006(string team, int year1, string year2, string division)
        {
            this.team = team;
            this.year1 = year1;
            this.year2 = year2;
            this.division = division;
        }

        public void showWS2006Info()
        {
            Console.WriteLine("팀명 : " + team);
            Console.WriteLine("창단년도 : " + year1);
            Console.WriteLine("우승년도 : " + year2);
            Console.WriteLine("소속 리그/지구/순위 : " + division);
            Console.WriteLine("-----------------------------------------------------------------------------------");
        }
    }
}
