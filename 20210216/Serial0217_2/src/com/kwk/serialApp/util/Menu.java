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
    	 System.out.println("## 메인 메뉴 ##");
    	 System.out.println("--------------------------------------------");
    	 System.out.println("1. TV 켜기");
    	 System.out.println("2. TV 끄기");
    	 System.out.println("3. 보일러 동작");
    	 System.out.println("4. 세탁기 동작");
    	 System.out.println("5. 긴급정지");
    	 System.out.println("6. 로그아웃");
    	 System.out.println("7. 통신 재연결");
    	 System.out.println("8. 종료");
    	 System.out.println("--------------------------------------------");
    	 System.out.print("메뉴 선택 : ");
    	 
    	 return mainMenu();
     }
     
}

