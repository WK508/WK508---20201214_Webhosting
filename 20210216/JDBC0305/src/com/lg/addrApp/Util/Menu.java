package com.lg.addrApp.Util;

import java.util.Scanner;

import com.lg.addrApp.Model.Mlbteam;

public class Menu {
	public static final int CREATE_TABLE = 1;
	public static final int DELETE_TABLE = 2;
	public static final int INSERT_DATA = 3;
	public static final int INSERT_RAND_DATA = 4;
	public static final int VIEW_DATA = 5;
	public static final int UPDATE_DATA = 6;
	public static final int DELETE_DATA = 7;
	public static final int MAIN_EXIT = 8;
	
	public int mainmenu(Scanner s)
	{
		System.out.println("--------------------------------");
		System.out.println("MYSQL DB ���� v1.0");
		System.out.println("--------------------------------");
		System.out.println("1. ���̺� ����");
		System.out.println("2. ���̺� ����");
		System.out.println("3. ������ �߰�");
		System.out.println("4. ���� ������ �߰�");
		System.out.println("5. ������ ����");
		System.out.println("6. ������ ����");
		System.out.println("7. ������ ����");
		System.out.println("8. ����");
		System.out.println("--------------------------------");
		System.out.print("���� �޴� ���� : ");
		
		return s.nextInt();
	}
	
	public Mlbteam addmenu(Scanner s)
	{
		System.out.println("--------------------------------");
		System.out.println("������ �߰� �޴�");
		System.out.println("--------------------------------");
		System.out.print("�̸� : ");
		String name = s.next();
		System.out.print("â�ܳ⵵ : ");
		String open = s.next();
		System.out.print("��³⵵ : ");
		String champion = s.next();
		System.out.print("�Ҽ� ����/����/���� : ");
		String division = s.next();
		return new Mlbteam(name, open, champion, division);
	}
	
	
}
