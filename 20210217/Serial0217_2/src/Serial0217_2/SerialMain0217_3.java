package Serial0217_2;

import java.util.Scanner;

public class SerialMain0217_3 {
	
	public static final String ADMIN_ID = "admin";
	public static final String GUEST_ID = "guest";
	public static final String ADMIN_PW = "1234";
	public static final String GUEST_PW = "1111";
	
	public static String[] login(Scanner s) {
		System.out.println("--------------------");
		System.out.println("����Ʈ Ȩ ���� �α���");
		System.out.println("--------------------");
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
			if (loginArr[0].equals(ADMIN_ID) && loginArr[1].equals(ADMIN_PW)) {
				System.out.println("�����ڸ��");
				break;
			}
			else if (loginArr[0].equals(GUEST_ID) && loginArr[1].equals(GUEST_PW)) {
				System.out.println("����ڸ��");
				break;
			}
			else {
				System.out.println("ID �Ǵ� ����� �߸��Ǿ����ϴ�.");
			}
		}

	}

}
