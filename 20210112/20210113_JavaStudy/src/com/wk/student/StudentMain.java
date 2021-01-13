package com.wk.student;

import java.util.Random;

import com.wk.student.person.*;

public class StudentMain {

	public static void main(String[] args) {
		Student info[] = new Student[10];
		
		String name[] = {"홍길동", "김길순", "박길동", "이길순", "최길동"};
		int age[] = {30, 25, 30, 35, 40};
		char gender[] = {'남', '여'};
		String address[] = {"대구시 동구 신암4동", "서울시 송파구 잠실동", "부산시 해운대구 우동", "인천시 미추홀구 문학동", "광주시 북구 임동"};		
		
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			info[i] = new Student(name[r.nextInt(5)], age[r.nextInt(5)], gender[r.nextInt(2)], address[r.nextInt(5)]);
			
			Student st0 = new Student();
			st0.showStudentInfo();
			
			Student st1 = new Student("김길순", 25, '여', "서울시 송파구 잠실동");
			st1.showStudentInfo();
			
			Student st2 = new Student("박길동", 30, '남', "부산시 해운대구 우동");
			st2.showStudentInfo();
			
			Student st3 = new Student("이길순", 35, '여', "인천시 미추홀구 문학동");
			st3.showStudentInfo();
			
			Student st4 = new Student("최길동", 40, '남', "광주시 북구 임동");
			st4.showStudentInfo();
			
			Student st5 = new Student("최철수", 25, '남', "서울시 송파구 잠실동");
			st5.showStudentInfo();
			
			Student st6 = new Student("박영희", 30, '여', "부산시 해운대구 우동");
			st6.showStudentInfo();
			
			Student st7 = new Student("이철순", 35, '여', "인천시 미추홀구 문학동");
			st7.showStudentInfo();
			
			Student st8 = new Student("최영환", 40, '남', "광주시 북구 임동");
			st8.showStudentInfo();
			
			Student st9 = new Student("전우치", 24, '남', "조선 한양인근 두메산골");
			st9.showStudentInfo();
			
		}
	   
	    }
	
        }
	
		
		
	
    
   
    	
    	
    	
		
    	
    	
    	
    

	
		
	


		



