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
    	 System.out.println("MYSQL DB 관리 V1.0");
    	 System.out.println("------------------------------------------------------------------------");
    	 System.out.println("1. 테이블 생성");
    	 System.out.println("2. 테이블 삭제");
    	 System.out.println("3. 데이터 추가");
    	 System.out.println("4. 랜덤 데이터 추가");
    	 System.out.println("5. 데이터 보기");
    	 System.out.println("6. 데이터 수정");
    	 System.out.println("7. 데이터 삭제");
    	 System.out.println("8. 종료");
    	 System.out.println("------------------------------------------------------------------------");
    	 System.out.print("메인 메뉴 선택 : ");
    	 
    	 return s.nextInt();
     }
     
     public PostSeason addMenu(Scanner s)
     {
    	 System.out.println("------------------------------------------------------------------------");
    	 System.out.println("데이터 추가 메뉴");
    	 System.out.println("------------------------------------------------------------------------");
    	 System.out.print("이름 : ");
    	 String name = s.next();
    	 BufferedReader br = 
    				new BufferedReader(
    					new InputStreamReader(System.in));
    			System.out.print("창단년도: ");
    			String open = null;
    			try {
    				open = br.readLine();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    	 
    	 BufferedReader br1 = 
    				new BufferedReader(
    					new InputStreamReader(System.in));
    			System.out.print("우승년도 : ");
    			String champion = null;
    			try {
    				champion = br1.readLine();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    			BufferedReader br2 = 
    					new BufferedReader(
    						new InputStreamReader(System.in));
    				System.out.print("소속 리그/지구/순위 : ");
    				String division = null;
    				try {
    					division = br2.readLine();
    				} catch (IOException e) {
    					e.printStackTrace();
    				}
    	 
    	 return new PostSeason(name, open, champion, division);
     }
    		 
}
