import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		char kor[] = {'��', '��', '��', '��', '��', '��', '��', '��', '��' ,'��', '��', '��', '��', '��',
				      '��', '��', '��', '��', '��', '��', '��', '��', '��', '��'};
		
		char eng[] = {'a' , 'b' ,'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
				      'm', 'n', 'o', 'p', 'q', 'r' ,'s', 't', 'u', 'v', 'w' , 'x', 'y', 'z'};
		
		int chCount[] = new int[24];
		
		Scanner s = new Scanner(System.in);
		System.out.print("���ĺ��� �Է��ϼ��� : ");
		String str = s.next();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < eng.length; j++) {
				if(str.charAt(i) == eng[j]) {
					System.out.println(kor[j]);
					chCount[j]++; // chCount[j] += 1;
					break;
				}
			}
		}
		
		for (int i = 0; i < eng.length; i++) {
			if(chCount[i] != 0) {
			System.out.println(eng[i] + " : " + chCount[i]);
		}
	}

}
}
