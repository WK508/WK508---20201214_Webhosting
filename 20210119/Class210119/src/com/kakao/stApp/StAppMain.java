package com.kakao.stApp;

import java.util.Random;

public class StAppMain {

	public static void main(String[] args) {
		String name[] = {"ȫ�浿", "��浿", "�ڱ浿", "�̱浿", "�ֱ浿"};
		int age[] = {20, 25, 30, 35, 40};
		char gender[] = {'��', '��'};
		String address[] = {"�뱸�� ���� �žϵ�", "����� ���ı� ��ǵ�", "�λ�� �ؿ�뱸 �쵿", "��õ�� ����Ȧ�� ���е�", "���ֽ� �ϱ� �ӵ�"};

		Student st[] = new Student[10];
		Random r = new Random();
		for (int i = 0; i < st.length; i++) {
			System.out.println("��ȣ : " + (i+1));
		
		st[i] = new Student(name[r.nextInt(5)], age[r.nextInt(5)], gender[r.nextInt(2)], address[r.nextInt(5)]);
		st[i].showStudentInfo();
		}
		
		// ���ο� ��ü�� ����
		st[9] = new Student("����ġ", 24, '��', "���� �Ѿ� �θ޻��");
		st[9].showStudentInfo();
		
		// ���� ��ü�� ����
		st[9].setName("����ġ");
	    st[9].setAge(24);
	    st[9].setGender('��');
	    st[9].setAddress("���� �Ѿ� �θ޻��");
		
		/*
		for (int i = 0; i < st.length; i++) {
		   new Student(name[r.nextInt(5)], age[r.nextInt(5)], gender[r.nextInt(2)], address[r.nextInt(5)]).showStudentInfo(); 
		}
		*/
	}

}
