package Serial0217_2;

import java.util.Scanner;

public class SerialMain0217_4 {
	public static final String ADMIN_ID = "admin";
	public static final String GUEST_ID = "guest";
	public static final String ADMIN_PW = "1234";
	public static final String GUEST_PW = "1111";
	public static final String ADMIN_MODE = "admin_mode";
	public static final String GUEST_MODE = "guest_mode";
	public static final String OTHER_MODE = "other_mode";
	
	public static int MENU_TV_ON = 1;
	public static int MENU_TV_OFF = 2;
	public static int MENU_BOILER_ON = 3;
	public static int MENU_CLEANER_ON = 4;
	public static int MENU_EMERGENCY = 5;
	public static int MENU_GUEST_EXIT = 5;
	public static int MENU_ADMIN_EXIT = 6;
	
	  public static String login(Scanner s) {
		  System.out.println("-------------------");
		  System.out.println("스마트 홈 제어 로그인");
		  System.out.println("-------------------");
		  System.out.print("ID : ");
		  String id = s.next();
		  System.out.print("PW : ");
		  String pw = s.next();
		  String mode;
		  
		   if (id.equals(ADMIN_ID) && pw.equals(ADMIN_PW)) {
			   mode = ADMIN_MODE;
		   }
		   else if (id.equals(GUEST_ID) && pw.equals(GUEST_PW)) {
			   mode = GUEST_MODE;
		   }
		   else {
			   mode = OTHER_MODE;
		   }
		   return mode;
	  }
	  
	  public static int adminMenu(Scanner s) {
		    System.out.println("----------------------");
			System.out.println("스마트 홈 제어 v1.0");
			System.out.println("----------------------");
			System.out.println("1. TV 켜기");
			System.out.println("2. TV 끄기");
			System.out.println("3. 보일러 동작");
			System.out.println("4. 세탁기 동작");
			System.out.println("5. 긴급 정지");
			System.out.println("6. 종료");
			System.out.println("----------------------");
			System.out.print("메뉴 선택 : ");
			return s.nextInt();
	  }
	  
	  public static int guestMenu(Scanner s) {
		    System.out.println("----------------------");
			System.out.println("스마트 홈 제어 v1.0");
			System.out.println("----------------------");
			System.out.println("1. TV 켜기");
			System.out.println("2. TV 끄기");
			System.out.println("3. 보일러 동작");
			System.out.println("4. 세탁기 동작");
			System.out.println("5. 프로그램 종료");
			System.out.println("----------------------");
			System.out.print("메뉴 선택 : ");
			return s.nextInt();
	  }
	  
	  public static void adminWork(Scanner s) {
		  switch (adminMenu(s)) {
		  case 1:
			  System.out.println("TV 켜기");
			  break;
			  
		  case 2:
			  System.out.println("TV 끄기");
			  break;
			  
		  case 3:
			  System.out.println("보일러 가동");
			  break;
			  
		  case 4:
			  System.out.println("세탁기 가동");
			  break;
			  
		  case 5:
			  System.out.println("긴급 정지");
			  break;
			  
		  case 6:
			  System.out.println("프로그램 종료");
			  System.exit(0);
		  }
	  }
	  
	  public static void guestWork(Scanner s) {
		  switch (guestMenu(s)) {
		  case 1:
			  System.out.println("TV 켜기");
			  break;
			  
		  case 2:
			  System.out.println("TV 끄기");
			  break;
			  
		  case 3:
			  System.out.println("보일러 가동");
			  break;
			  
		  case 4:
			  System.out.println("세탁기 가동");
			  break;
			  
		  case 5:
			  System.out.println("프로그램 종료");
			  s.close();
			  System.exit(0);
		  }
	  }
	  

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    while (true) {
	    	String mode = login(s);
	    	if(mode.equals(ADMIN_MODE)) {
	    		while (true) {
	    			adminWork(s);
	    		}
	    	}
	    	else if(mode.equals(GUEST_MODE)) {
	    		while (true) {
	    			guestWork(s);
	    		}
	    	}
	    	else {
	    		System.out.println("ID 또는 비밀번호를 잘못 입력하셨습니다.");
	    		System.out.println("다시 입력하세요.");
	    	}
	    }

	}

}
