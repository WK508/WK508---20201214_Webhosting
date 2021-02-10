using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _20210210
{
    class Program
    {
        static void Main(string[] args)
        {
            DS2020 d = new DS2020();
            d.showDS2020Info();

            DS2020 d2 = new DS2020("세인트루이스 카디널스", 1882, "1926, 1931, 1934, 1942, 1944, 1946, 1964, 1967, 1982, 2006, 2011", "내셔널리그 중부지구 2위");
            d2.showDS2020Info();

            DS2020 d3 = new DS2020("신시내티 레즈", 1882, "1919, 1940, 1975, 1976, 1990", "내셔널리그 중부지구 3위");
            d3.showDS2020Info();

            DS2020 d4 = new DS2020("밀워키 브루어스", 1969, "없음", "내셔널리그 중부지구 4위");
            d4.showDS2020Info();

            DS2020 d5 = new DS2020("피츠버그 파이어리츠", 1882, "1909, 1925, 1960, 1971, 1979", "내셔널리그 중부지구 5위");
            d5.showDS2020Info();
        }
    }
}
