package com.sac.carApp;

import java.util.Random;

import com.sac.carApp.car.Car;
import com.sac.carApp.customer.Customer;

public class CarAppMain {

	public static void main(String[] args) {
		String name[] = {"ȫ�浿" ,"�ڱ浿", "�̱浿", "�ֱ浿", "��浿"};
		String tel[] = {"010-1010-0101", "010-1010-0101", "010-1010-0101", "010-1010-0101", "010-1010-0101"};
		String address[] = {"�뱸������ �ϱ�" ,"����Ư���� ���ı�", "���������� ������", "���ֱ����� ���걸", "��걤���� �߱�"};
		String model[] = {"SM6" ,"�ҳ�Ÿ", "��Ÿ��", "K7", "�׷���"};
		String color[] = {"��" ,"���", "ȭ��Ʈ", "����", "�׸�"};
		int year[] = {2021, 2020, 2019, 2018, 2017};
		String company[] = {"����Ｚ", "����", "���" ,"�ֿ�", "GM"};
		String price[] = {"2õ5�鸸��", "3õ����", "3õ5�鸸��", "4õ����", "4õ5�鸸��"};

		Random r = new Random();
		Customer cu[] = new Customer[10];
		for (int i = 0; i < cu.length; i++) {
			System.out.println("��ȣ : " + (i+1));
			cu[i] = new Customer(name[r.nextInt(5)], tel[r.nextInt(5)], address[r.nextInt(5)], 
					new Car(model[r.nextInt(5)], year[r.nextInt(5)], color[r.nextInt(5)], company[r.nextInt(5)], price[r.nextInt(5)]));
			cu[i].printCustomerInfo();
		}
	}
	
	

}
