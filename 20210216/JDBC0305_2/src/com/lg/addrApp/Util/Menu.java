package com.lg.addrApp.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.lg.addrApp.Model.PostSeason;

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
    	 System.out.println("------------------------------------------------------------------------");
    	 System.out.println("MYSQL DB ���� V1.0");
    	 System.out.println("------------------------------------------------------------------------");
    	 System.out.println("1. ���̺� ����");
    	 System.out.println("2. ���̺� ����");
    	 System.out.println("3. ������ �߰�");
    	 System.out.println("4. ���� ������ �߰�");
    	 System.out.println("5. ������ ����");
    	 System.out.println("6. ������ ����");
    	 System.out.println("7. ������ ����");
    	 System.out.println("8. ����");
    	 System.out.println("------------------------------------------------------------------------");
    	 System.out.print("���� �޴� ���� : ");
    	 
    	 return s.nextInt();
     }
     
     public PostSeason addMenu(Scanner s)
     {
    	 System.out.println("------------------------------------------------------------------------");
    	 System.out.println("������ �߰� �޴�");
    	 System.out.println("------------------------------------------------------------------------");
    	 System.out.print("�̸� : ");
    	 String name = s.next();
    	 BufferedReader br = 
    				new BufferedReader(
    					new InputStreamReader(System.in));
    			System.out.print("â�ܳ⵵: ");
    			String open = null;
    			try {
    				open = br.readLine();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    	 
    	 BufferedReader br1 = 
    				new BufferedReader(
    					new InputStreamReader(System.in));
    			System.out.print("��³⵵ : ");
    			String champion = null;
    			try {
    				champion = br1.readLine();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    			BufferedReader br2 = 
    					new BufferedReader(
    						new InputStreamReader(System.in));
    				System.out.print("�Ҽ� ����/����/���� : ");
    				String division = null;
    				try {
    					division = br2.readLine();
    				} catch (IOException e) {
    					e.printStackTrace();
    				}
    	 
    	 return new PostSeason(name, open, champion, division);
     }
    		 
}
