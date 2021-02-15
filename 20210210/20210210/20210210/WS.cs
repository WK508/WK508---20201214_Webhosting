using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _20210210
{
    class WS 
    {
        public const string WSM = "역대 월드시리즈 매치업";

        private string matchup;
        private int year;
        private string winner;

        public WS()
        {
            matchup = "샌프란시스코 자이언츠 vs 텍사스 레인저스";
            year = 2010;
            winner = "샌프란시스코 자이언츠(4승 1패)";
        }

        public WS(string matchup, int year, string winner)
        {
            this.matchup = matchup;
            this.year = year;
            this.winner = winner;
        }

        public void showWSInfo()
        {
            Console.WriteLine("매치업 : " + matchup);
            Console.WriteLine("년도 : " + year);
            Console.WriteLine("승리팀(전적) : " + winner);
            Console.WriteLine("---------------------------------------------------------------------------------");
        }
    }

}
