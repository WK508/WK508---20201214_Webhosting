package Serial0217;

import java.util.Scanner;

public class SerialMain_5 {
	public static final String ADMIN_ID = "admin";
	public static final String GUEST_ID = "guest";
	public static final String ADMIN_PW = "1234";
	public static final String GUEST_PW = "1111";
	
	public static String[] login(Scanner s) {
		System.out.println("------------------------");
		System.out.println("���������� ���ųθ��� ��������");
		System.out.println("------------------------");
		System.out.println("1. LA DODGERS");
		System.out.println("2. SAN DIEGO PADRES");
		System.out.println("3. SAN FRANCISCO GIANTS");
		System.out.println("4. COLORADO ROCKIES");
		System.out.println("5. ARIZONA DIAMONDBACKS");
		System.out.println("6. �������");
		System.out.println("7. �α׾ƿ�");
		System.out.println("8. ����");
		System.out.println("------------------------");
		System.out.println("�޴� ���� : ");
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
				System.out.println("�����ڸ��");
				break;
			}
			else if (loginArr[0].equals(GUEST_ID) && loginArr[1].equals(GUEST_PW)) {
				System.out.println("����ڸ��");
				break;
			}
			else {
				System.out.println("ID �Ǵ� ��й�ȣ�� �߸��Ǿ����ϴ�.");
			}
		}

	}

}
