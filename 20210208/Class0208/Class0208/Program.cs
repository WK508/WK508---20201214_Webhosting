using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Class0208
{
    class Program
    {
        static void Main(string[] args)
        {
            WS2006 w = new WS2006();
            w.showWS2006Info();

            WS2006 w2 = new WS2006("디트로이트 타이거스", 1894, "1935, 1945, 1968, 1984", "아메리칸리그 중부지구 1위");
            w2.showWS2006Info();
        }
    }
}
