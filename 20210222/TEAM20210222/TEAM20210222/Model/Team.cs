using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TEAM20210222.Control;

namespace TEAM20210222.Model
{
    class Team
    {
        private string name;
        private string year1;
        private string year2;
        private string division;
        private static Team inst;

        public static Team getInst()
        {
            if (inst == null)
            {
                inst = new Team();
            }
            return inst;
        }

        public Team() { }

        public Team(string name, string year1, string year2, string division)
        {
            this.name = name;
            this.year1 = year1;
            this.year2 = year2;
            this.division = division;
        }

        

        public Team(string v1, string v2, string v3, string v4, string v5)
        {
        }

        public string Name { get => name; set => name = value; }
        public string Year1 { get => year1; set => year1 = value; }
        public string Year2 { get => year2; set => year2 = value; }
        public string Division { get => division; set => division = value; }
    }
}
