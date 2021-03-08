import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CollectMain {

	public static void main(String[] args) {
		System.out.println("---------- 배열 ----------");
		String strArr[] = new String[4];
		strArr[0] = "시카고 컵스";
		strArr[1] = "클리블랜드 인디언스";
		strArr[2] = "LA 다저스";
		strArr[3] = "토론토 블루제이스";
		
		for (String str : strArr)
		{
			System.out.println(str);
		}
		
	    System.out.println("---------- ArrayList ----------");
	    ArrayList<String> list = new ArrayList<>();
	    list.add("휴스턴 애스트로스");
	    list.add("LA 다저스");
	    list.add("뉴욕 양키스");
	    list.add("시카고 컵스");
	    
	    for (int h = 0; h < list.size(); h++)
	    {
	    	System.out.println(list.get(h));
	    }
	    
	    System.out.println("---------- Stack ----------");
	    Stack<String> st = new Stack<>();
	    st.push("밀워키 브루어스");
	    st.push("휴스턴 애스트로스");
	    st.push("LA 다저스");
	    st.push("보스턴 레드삭스");
	    
	    while (!st.isEmpty())
	    {
	    	System.out.println(st.pop());
	    }
	    
	    System.out.println("---------- Queue -----------");
	    Queue<String> qu = new LinkedList<>();
	    qu.add("워싱턴 내셔널스");
	    qu.add("휴스턴 애스트로스");
	    qu.add("뉴욕 양키스");
	    qu.add("세인트루이스 카디널스");
	    
	    while (!qu.isEmpty())
	    {
	    	System.out.println(qu.poll());
	    }
	    
	    System.out.println("---------- HashMap ----------");
	    HashMap<Integer, String> map = new HashMap<>();
	    map.put(1, "LA 다저스");
	    map.put(2, "탬파베이 레이스");
	    map.put(3, "애틀란타 브레이브스");
	    map.put(4, "휴스턴 애스트로스");
	    
	    Iterator<Integer> keySetIt = map.keySet().iterator();
	    
	    while(keySetIt.hasNext())
	    {
	    	Integer key = keySetIt.next();
	    	System.out.printf("key = %d, 값 = %s\n", key, map.get(key));
	    }

	}

}
