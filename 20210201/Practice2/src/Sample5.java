import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int[] alphabet = new int[26];
		
		for (int i = 0; i < input.length(); i++) {
			int index = input.charAt(i) + (int)'a';
			alphabet[index]++;
		}
		
		for (int i = 0; i < 26; i++) {
			if (alphabet[i] !=0) {
				String sentence = "'" + (char)(i+97) + "'" + 
			                      "는" + alphabet[i] + "글자입니다.";
				System.out.println(sentence);
			}
		}

	}

}
