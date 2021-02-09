using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _20210209
{
    class Program
    {
        static void Main(string[] args)
        {
            CS2006 c = new CS2006();
            c.showCS2006Info();

            CS2006 c2 = new CS2006("OAKLAND ATHLETICS", 1901, "1910, 1911, 1913, 1929, 1930, 1972, 1973, 1974, 1989", "아메리칸리그 서부지구 1위");
            c2.showCS2006Info();
        }
    }
}
