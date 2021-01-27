package Thread0127;

import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		System.out.println("!!!!!!!!!!!!!!!!! ArrayList !!!!!!!!!!!!!!!!!");
		ArrayList <String> list = new ArrayList<>();
		list.add("2000 WORLD SERIES (NYY vs NYM)");
		list.add("2001 WORLD SERIES (ARI vs NYY)");
		list.add("2002 WORLD SERIES (LAA vs SF)");
		list.add("2003 WORLD SERIES (MIA vs NYY)");
		list.add("2004 WORLD SERIES (BOS vs STL)");
		
		for (int b = 0; b < list.size(); b++) {
			System.out.println(list.get(b));
		}
	}

}
