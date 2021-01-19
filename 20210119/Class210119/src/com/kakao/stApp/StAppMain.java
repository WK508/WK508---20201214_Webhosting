package com.kakao.stApp;

import java.util.Random;

public class StAppMain {

	public static void main(String[] args) {
		String name[] = {"홍길동", "김길동", "박길동", "이길동", "최길동"};
		int age[] = {20, 25, 30, 35, 40};
		char gender[] = {'남', '여'};
		String address[] = {"대구시 동구 신암동", "서울시 송파구 잠실동", "부산시 해운대구 우동", "인천시 미추홀구 문학동", "광주시 북구 임동"};

		Student st[] = new Student[10];
		Random r = new Random();
		for (int i = 0; i < st.length; i++) {
			System.out.println("번호 : " + (i+1));
		
		st[i] = new Student(name[r.nextInt(5)], age[r.nextInt(5)], gender[r.nextInt(2)], address[r.nextInt(5)]);
		st[i].showStudentInfo();
		}
		
		// 새로운 객체를 생성
		st[9] = new Student("전우치", 24, '남', "조선 한양 두메산골");
		st[9].showStudentInfo();
		
		// 기존 객체를 재사용
		st[9].setName("전우치");
	    st[9].setAge(24);
	    st[9].setGender('남');
	    st[9].setAddress("조선 한양 두메산골");
		
		/*
		for (int i = 0; i < st.length; i++) {
		   new Student(name[r.nextInt(5)], age[r.nextInt(5)], gender[r.nextInt(2)], address[r.nextInt(5)]).showStudentInfo(); 
		}
		*/
	}

}
