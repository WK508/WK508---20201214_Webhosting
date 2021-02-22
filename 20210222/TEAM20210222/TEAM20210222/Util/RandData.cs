using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TEAM20210222.Util
{
    class RandData
    {
        static string[] name = { "CHICAGO WHITESOX", "HOUSTON ASTROS", 
                                 "LA ANGELS", "SAINT LOUIS CARDINALS" };
        static string[] year1 = { "1901", "1962", "1961", "1882" };
        static string[] year2 = {"1906, 1917, 2005", 
                                 "2017",
                                 "2002", 
                                 "1926, 1931, 1934, 1942, 1944, 1946, 1964, 1967, 1982, 2006, 2011"};
        static string[] division = { "아메리칸리그 중부지구 1위", 
                                     "내셔널리그 중부지구 2위", 
                                     "아메리칸리그 서부지구 1위", 
                                     "내셔널리그 중부지구 1위" };

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
                "CWSHOUSTLLAA";
            StringBuilder rs = new StringBuilder();
            for (int i = 0; i < 4; i++)
            {
                rs.Append(rdata[(int)(r.NextDouble() * rdata.Length)]);
            }
            return rs.ToString();
        }
    }
}
