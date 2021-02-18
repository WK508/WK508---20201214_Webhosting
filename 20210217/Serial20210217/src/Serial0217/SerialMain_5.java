package Serial0217;

import java.util.Scanner;

public class SerialMain_5 {
	public static final String ADMIN_ID = "admin";
	public static final String GUEST_ID = "guest";
	public static final String ADMIN_PW = "1234";
	public static final String GUEST_PW = "1111";
	
	public static String[] login(Scanner s) {
		System.out.println("------------------------");
		System.out.println("메이저리그 내셔널리그 서부지구");
		System.out.println("------------------------");
		System.out.println("1. LA DODGERS");
		System.out.println("2. SAN DIEGO PADRES");
		System.out.println("3. SAN FRANCISCO GIANTS");
		System.out.println("4. COLORADO ROCKIES");
		System.out.println("5. ARIZONA DIAMONDBACKS");
		System.out.println("6. 긴급정지");
		System.out.println("7. 로그아웃");
		System.out.println("8. 종료");
		System.out.println("------------------------");
		System.out.println("메뉴 선택 : ");
		System.out.print("ID : ");
		String id = s.next();
		System.out.print("PW : ");
		String pw = s.next();
		
		String[] loginData = new String[2];
		loginData[0] = id;
		loginData[1] = pw;
		return loginData;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			String[] loginArr = login(s);
			if(loginArr[0].equals(ADMIN_ID) && loginArr[1].equals(ADMIN_PW)) {
				System.out.println("관리자모드");
				break;
			}
			else if (loginArr[0].equals(GUEST_ID) && loginArr[1].equals(GUEST_PW)) {
				System.out.println("사용자모드");
				break;
			}
			else {
				System.out.println("ID 또는 비밀번호가 잘못되었습니다.");
			}
		}

	}

}
