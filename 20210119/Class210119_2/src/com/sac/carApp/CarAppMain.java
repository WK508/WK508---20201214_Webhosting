package com.sac.carApp;

import java.util.Random;

import com.sac.carApp.car.Car;
import com.sac.carApp.customer.Customer;

public class CarAppMain {

	public static void main(String[] args) {
		String name[] = {"홍길동" ,"박길동", "이길동", "최길동", "김길동"};
		String tel[] = {"010-1010-0101", "010-1010-0101", "010-1010-0101", "010-1010-0101", "010-1010-0101"};
		String address[] = {"대구광역시 북구" ,"서울특별시 송파구", "대전광역시 유성구", "광주광역시 광산구", "울산광역시 중구"};
		String model[] = {"SM6" ,"소나타", "싼타페", "K7", "그랜저"};
		String color[] = {"블랙" ,"블루", "화이트", "레드", "그린"};
		int year[] = {2021, 2020, 2019, 2018, 2017};
		String company[] = {"르노삼성", "현대", "기아" ,"쌍용", "GM"};
		String price[] = {"2천5백만원", "3천만원", "3천5백만원", "4천만원", "4천5백만원"};

		Random r = new Random();
		Customer cu[] = new Customer[10];
		for (int i = 0; i < cu.length; i++) {
			System.out.println("번호 : " + (i+1));
			cu[i] = new Customer(name[r.nextInt(5)], tel[r.nextInt(5)], address[r.nextInt(5)], 
					new Car(model[r.nextInt(5)], year[r.nextInt(5)], color[r.nextInt(5)], company[r.nextInt(5)], price[r.nextInt(5)]));
			cu[i].printCustomerInfo();
		}
	}
	
	

}
