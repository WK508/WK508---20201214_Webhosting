package com.kwk.serialApp.util;

public class Menu {
     public static int menu_main_tv_on = 1;
     public static int menu_main_tv_off = 2;
     public static int menu_main_boiler_on = 3;
     public static int menu_main_cleaner_on = 4;
     public static int menu_main_emergency = 5;
     public static int menu_main_logout = 6;
     public static int menu_main_reconnect = 7;
     public static int menu_main_exit = 8;
     
     public int mainMenu()
     {
    	 System.out.println("--------------------------------------------");
    	 System.out.println("## ���� �޴� ##");
    	 System.out.println("--------------------------------------------");
    	 System.out.println("1. TV �ѱ�");
    	 System.out.println("2. TV ����");
    	 System.out.println("3. ���Ϸ� ����");
    	 System.out.println("4. ��Ź�� ����");
    	 System.out.println("5. �������");
    	 System.out.println("6. �α׾ƿ�");
    	 System.out.println("7. ��� �翬��");
    	 System.out.println("8. ����");
    	 System.out.println("--------------------------------------------");
    	 System.out.print("�޴� ���� : ");
    	 
    	 return mainMenu();
     }
     
}

