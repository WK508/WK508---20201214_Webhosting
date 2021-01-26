import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = s.nextInt();
		System.out.print("12지신 입력 : ");
		String oper = s.next();
		s.close();
		
		if (year % 12 == 4) {
			System.out.println(year + " : " + oper);
		}
		
		else if (year % 12 == 5) {
			System.out.println(year + " : " + oper);
		}
		
		else if (year % 12 == 6) {
			System.out.println(year + " : " + oper);
		}
		
		else if (year % 12 == 7) {
			System.out.println(year + " : " + oper);
		}
		
		else if (year % 12 == 8) {
			System.out.println(year + " : " + oper);
		}
		
		else if (year % 12 == 9) {
			System.out.println(year + " : " + oper);
		}
		else if (year % 12 == 10) {
			System.out.println(year + " : " + oper);
		}
		
		else if (year % 12 == 11) {
			System.out.println(year + " : " + oper);
		}
		
		else if (year % 12 == 0) {
			System.out.println(year + " : " + oper);
	}
		else if (year % 12 == 1) {
			System.out.println(year + " : " + oper);
   }
		else if (year % 12 == 2) {
			System.out.println(year + " : " + oper);
		}
		
		else if (year % 12 == 3) {
			System.out.println(year + " : " + oper);
		}
	}	
}		