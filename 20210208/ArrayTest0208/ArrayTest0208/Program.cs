using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArrayTest0208
{
    class Program
    {
        static void Main(string[] args)
        {
            // 1차원 배열 초기화
            int[] arrInt = { 10, 20, 30, 40 };
            for (int i = 0; i < arrInt.Length; i++)
            {
                Console.WriteLine(arrInt[i] + " ");
                string str = string.Format("배열[{0}] : {1}", i, arrInt[i]);
                Console.WriteLine(str);
            }
            char[] arrCh = new char[4] { '김', '이', '박', '최' };
            for (int i = 0; i < arrCh.Length; i++)
            {
                Console.Write(arrCh[i] + " ");
            }
            //2차원 배열 초기화1
            int[,] arrInt2 =
            {
              {1, 2, 3 }, {4, 5, 6}
            };

            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    Console.Write(arrInt2[i, j] + " ");
                }
                Console.WriteLine();
            }

            //2차원 배열 초기화2(상수 변수)
            const int SIZE_ROW = 2;
            const int SIZE_COL = 3;
            int[,] arrInt2_1 = new int[SIZE_ROW, SIZE_COL]
            {
             {1, 2, 3 }, {4, 5, 6}
            };

            for (int i = 0; i < SIZE_ROW; i++)
            {
                for (int j = 0; j < SIZE_COL; j++)
                {
                    Console.Write(arrInt2_1[i, j] + " ");
                }
                Console.WriteLine();
            }

            // 2차원 배열 초기화3
            string[][] arrStr1 = new string[2][];
            arrStr1[0] =
                new string[] { "LA 다저스", "탬파베이 레이스", "애틀란타 브레이브스" };
            arrStr1[1] =
                new string[] { "휴스턴 애스트로스" };
            for (int i = 0; i < arrStr1.Length; i++)
            {
                for (int j = 0; j < arrStr1[i].Length; j++)
                {
                    Console.Write(arrStr1[i][j] + " ");
                }
                Console.WriteLine();
            }

            // 2차원 배열 초기화4
            int[][] arrInt2_4 = new int[3][];
            for (int i = 0; i < arrInt2_4.Length; i++)
            {
                arrInt2_4[i] = new int[i + 1];
                for (int j = 0; j < arrInt2_4[i].Length; j++)
                {
                    arrInt2_4[i][j] = 10 + j;
                    Console.Write(arrInt2_4[i][j] + " ");
                }
                Console.WriteLine();
            }

            // foreach (향상된 for문) 1차원
            int[] arrEach1 = { 1, 2, 3, 4, 5 };
            // for (int i : arrEach1)
            foreach (int i in arrEach1)
            {
                Console.WriteLine(i);
            }

            // foreach 2차원
            string[,] arrEach2 =
            {
                {"보스턴 레드삭스", "LA 다저스" },
                {"휴스턴 애스트로스", "밀워키 브루어스" }};

            foreach (string str in arrEach2)
            {
                Console.Write(str + " ");
            }
            Console.WriteLine();

        }

    }
}


