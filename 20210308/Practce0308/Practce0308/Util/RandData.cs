using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TEAM20210222.Util
{
    class RandData
    {
        static string[] name = { "토론토 블루제이스", "필라델피아 필리스", "애틀란타 브레이브스", "시카고 화이트삭스" };
        static string[] year1 = { "1977", "1883", "1871", "1901" };
        static string[] year2 = { "1992, 1993", "1980, 2008", "1914, 1957, 1995", "1906, 1917, 2005" };
        static string[] division = { "아메리칸리그 동부지구 1위", 
                                     "내셔널리그 동부지구 2위", 
                                     "내셔널리그 동부지구 1위", 
                                     "아메리칸리그 중부지구 1위" };

        Random r;

        public RandData(Random r)
        {
            this.r = r;
        }

        public string getName()
        {
            return name[r.Next(4)];
        }

        public string getYear1()
        {
            return year1[r.Next(4)];
        }

        public string getYear2()
        {
            return year2[r.Next(4)];
        }
        
        public string getDivision()
        {
            return division[r.Next(4)];
        }

        public string getId()
        {
            string rdata =
                "TORPHIATLCHW";
            StringBuilder rs = new StringBuilder();
            for (int i = 0; i < 4; i++)
            {
                rs.Append(rdata[(int)(r.NextDouble() * rdata.Length)]);
            }
            return rs.ToString();
        }
    }
}
