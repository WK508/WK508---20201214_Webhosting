using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Car
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] name = { "홍길동", "박길동", "이길동", "최길동", "김길동" };
            char[] tel = { '0', '1', '2', '3', '4' };
            string[] address = { "대구광역시 북구", "서울특별시 송파구", "대전광역시 유성구",
                                 "광주광역시 광산구", "울산광역시 중구" };
            string[] model = { "SM6", "소나타", "싼타페", "K7", "그랜저" };
            string[] color = { "블랙", "블루", "화이트", "레드", "그린" };
            string[] year = { "2021", "2020", "2019", "2018", "2017" };
            string[] company = { "르노삼성", "현대", "기아", "쌍용", "GM" };
            string[] price = { "2천5백만원", "3천만원", "3천5백만원", "4천만원", "4천5백만원" };

            Car[] c = new Car[10];
            Random r = new Random();

            for (int i = 0; i < c.Length; i++)
            {
                c[i] = new Car(name[r.Next(5)], tel[r.Next(5)], address[r.Next(5)], model[r.Next(5)], 
                    color[r.Next(5)], year[r.Next(5)], company[r.Next(5)], price[r.Next(5)]);
            }

            for (int i = 0; i < c.Length; i++)
            {
                c[i].showCarInfo();
            }
        }
    }
}
