package com.wk.student;

import java.util.Random;

import com.wk.student.person.*;

public class StudentMain {

	public static void main(String[] args) {
		Student info[] = new Student[10];
		
		String name[] = {"ȫ�浿", "����", "�ڱ浿", "�̱��", "�ֱ浿"};
		int age[] = {30, 25, 30, 35, 40};
		char gender[] = {'��', '��'};
		String address[] = {"�뱸�� ���� �ž�4��", "����� ���ı� ��ǵ�", "�λ�� �ؿ�뱸 �쵿", "��õ�� ����Ȧ�� ���е�", "���ֽ� �ϱ� �ӵ�"};		
		
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			info[i] = new Student(name[r.nextInt(5)], age[r.nextInt(5)], gender[r.nextInt(2)], address[r.nextInt(5)]);
			
			Student st0 = new Student();
			st0.showStudentInfo();
			
			Student st1 = new Student("����", 25, '��', "����� ���ı� ��ǵ�");
			st1.showStudentInfo();
			
			Student st2 = new Student("�ڱ浿", 30, '��', "�λ�� �ؿ�뱸 �쵿");
			st2.showStudentInfo();
			
			Student st3 = new Student("�̱��", 35, '��', "��õ�� ����Ȧ�� ���е�");
			st3.showStudentInfo();
			
			Student st4 = new Student("�ֱ浿", 40, '��', "���ֽ� �ϱ� �ӵ�");
			st4.showStudentInfo();
			
			Student st5 = new Student("��ö��", 25, '��', "����� ���ı� ��ǵ�");
			st5.showStudentInfo();
			
			Student st6 = new Student("�ڿ���", 30, '��', "�λ�� �ؿ�뱸 �쵿");
			st6.showStudentInfo();
			
			Student st7 = new Student("��ö��", 35, '��', "��õ�� ����Ȧ�� ���е�");
			st7.showStudentInfo();
			
			Student st8 = new Student("�ֿ�ȯ", 40, '��', "���ֽ� �ϱ� �ӵ�");
			st8.showStudentInfo();
			
			Student st9 = new Student("����ġ", 24, '��', "���� �Ѿ��α� �θ޻��");
			st9.showStudentInfo();
			
		}
	   
	    }
	
        }
	
		
		
	
    
   
    	
    	
    	
		
    	
    	
    	
    

	
		
	


		



