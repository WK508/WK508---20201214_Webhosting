using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _21._02._18
{
    class _1988LCS_Team
    {
        private string name;
        private string year1;
        private string year2;
        private string division;
        private static _1988LCS_Team inst;

        public string Name { get => name; set => name = value; }
        public string Year1 { get => year1; set => year1 = value; }
        public string Year2 { get => year2; set => year2 = value; }
        public string Division { get => division; set => division = value; }
        internal static _1988LCS_Team Inst { get => inst; set => inst = value; }

        public static _1988LCS_Team getInst()
        {
            if (inst == null)
            {
                inst = new _1988LCS_Team();
            }
            return inst;
        }

        public _1988LCS_Team() {}

        public _1988LCS_Team(string name, string year1, 
            string year2, string division)
        {
            this.name = name;
            this.year1 = year1;
            this.year2 = year2;
            this.division = division;
        }


    }
}
