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
            WS w = new WS();
            w.showWSInfo();

            WS w2 = new WS("세인트루이스 카디널스 vs 텍사스 레인저스", 2011, "세인트루이스 카디널스(4승 3패)");
            w2.showWSInfo();

            WS w3 = new WS("샌프란시스코 자이언츠 vs 디트로이트 타이거스", 2012, "샌프란시스코 자이언츠(4승)");
            w3.showWSInfo();

            WS w4 = new WS("보스턴 레드삭스 vs 세인트루이스 카디널스", 2013, "보스턴 레드삭스(4승 2패)");
            w4.showWSInfo();

            WS w5 = new WS("샌프란시스코 자이언츠 vs 캔자스시티 로열스", 2014, "샌프란시스코 자이언츠(4승 3패)");
            w5.showWSInfo();

            WS w6 = new WS("캔자스시티 로열스 vs 뉴욕 메츠", 2015, "캔자스시티 로열스(4승 1패)");
            w6.showWSInfo();

            WS w7 = new WS("시카고 컵스 vs 클리블랜드 인디언스", 2016, "시카고 컵스(4승 3패)");
            w7.showWSInfo();

            WS w8 = new WS("휴스턴 애스트로스 vs LA 다저스", 2017, "휴스턴 애스트로스(4승 3패)");
            w8.showWSInfo();

            WS w9 = new WS("보스턴 레드삭스 vs LA 다저스", 2018, "보스턴 레드삭스(4승 1패)");
            w9.showWSInfo();

            WS w10 = new WS("워싱턴 내셔널스 vs 휴스턴 애스트로스", 2019, "워싱턴 내셔널스(4승 3패)");
            w10.showWSInfo();

            WS w11 = new WS("LA 다저스 vs 탬파베이 레이스", 2020, "LA 다저스(4승 2패)");
            w11.showWSInfo();
        }
    }
}
