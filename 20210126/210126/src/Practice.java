import java.util.Scanner;

public class Practice {
	
	
	public static int avg(int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
		int result = 0;
		result = (num1 + num2 + num3 + num4 + num5 + num6 + num7) / 7;
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("1���� ���� : ");
		int num1 = s.nextInt();
		System.out.print("2���� ���� : ");
		int num2 = s.nextInt();
		System.out.print("3���� ���� : ");
		int num3 = s.nextInt();
		System.out.print("4���� ���� : ");
		int num4 = s.nextInt();
		System.out.print("5���� ���� : ");
		int num5 = s.nextInt();
		System.out.print("6���� ���� : ");
		int num6 = s.nextInt();
		System.out.print("7���� ���� : ");
		int num7 = s.nextInt();
		
		int avg = avg(num1,num2, num3, num4, num5, num6, num7);
		
		System.out.println("������� : " + avg);
	}
}

		
	
