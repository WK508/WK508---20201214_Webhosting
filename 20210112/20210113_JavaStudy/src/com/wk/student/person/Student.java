package com.wk.student.person;

public class Student {
     private String name;
     private int age;
     private char gender;
     private String address;
     
     public Student () {
    	 name = "홍길동";
    	 age = 30;
    	 gender = '남';
    	 address = "대구시 동구 신암4동";
    	 
     }
     
    
     public Student(String name, int age, char gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
     
     public void showStudentInfo() {
    	 System.out.println("이름 : " + name);
    	 System.out.println("나이 : " + age);
    	 System.out.println("성별 : " + gender);
    	 System.out.println("주소 : " + address);
    	 System.out.println("======================================================================================");
     }
     
}
