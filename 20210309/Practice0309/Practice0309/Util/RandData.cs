using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TEAM20210222.Util
{
    class RandData
    {
        static string[] name = { "시카고 컵스", "클리블랜드 인디언스", "LA 다저스", "토론토 블루제이스" };
        static string[] year1 = { "1876", "1894", "1884", "1977" };
        static string[] year2 = { "1907, 1908, 2016", 
                                  "1920, 1948", 
                                  "1955, 1959, 1963, 1965, 1981, 1988, 2020", 
                                  "1992, 1993" };
        static string[] division = { "내셔널리그 중부지구 1위", 
                                     "아메리칸리그 중부지구 1위", 
                                     "내셔널리그 서부지구 1위", 
                                     "아메리칸리그 동부지구 2위" };

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
                "CHCCLELADTOR";
            StringBuilder rs = new StringBuilder();
            for (int c = 0; c < 4; c++)
            {
                rs.Append(rdata[(int)(r.NextDouble() * rdata.Length)]);
            }
            return rs.ToString();
        }
    }
}
