using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MLBTEAM.Util
{
    class RandData
    {
        static string[] name = {"PHILADELPHIA PHILLIES", "TAMPA BAY RAYS", "LA DODGERS", "BOSTON REDSOX"};
        static string[] year1 = { "1883", "1998", "1884", "1901"};
        static string[] year2 = { "1980, 2008" ,"없음",
                                  "1955, 1959, 1963, 1965, 1981, 1988, 2020", 
                                  "1903, 1912, 1915, 1916, 1918, 2004, 2007, 2013, 2018"};
        static string[] division = { "내셔널리그 동부지구 1위", 
                                     "아메리칸리그 동부지구 1위", 
                                     "내셔널리그 서부지구 1위", 
                                     "아메리칸리그 동부지구 2위"};
        Random r;

        public RandData(Random r)
        {
            this.r = r;
        }

        public string getName()
        {
            return name[r.Next(5)];
        }

        public string getYear1()
        {
            return year1[r.Next(5)];
        }

        public string getYear2()
        {
            return year2[r.Next(5)];
        }

        public string getDivision()
        {
            return division[r.Next(5)];
        }

        public string getId()
        {
            string rdata =
                "LADSDSFCOLARI";
            StringBuilder rs = new StringBuilder();
            for (int i = 0; i < 5; i++)
            {
                rs.Append(rdata[(int)(r.NextDouble() * rdata.Length)]);
            }
            return rs.ToString();
        }
    }
}
