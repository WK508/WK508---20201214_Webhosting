package Collect210127;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CollectMain {

	public static void main(String[] args) {
		System.out.println("-------배열-------");
		String strArr[] = new String[3];
		strArr[0] = "아무개";
	    strArr[1] = "머시기";
	    strArr[2] = "뭐라뭐라";
	    
	    
	    for (String str : strArr) {
	    	System.out.println(str);
	    }
	    
	    for (int i = 0; i < strArr.length; i++) {
	    	System.out.println(strArr[i]);

	}
	    
	    System.out.println("-------ArrayList-------");
	    ArrayList<String> list = new ArrayList<>();
	    list.add("아무개");
	    list.add("머시기");
	    list.add("뭐라뭐라");
	    
	    for (int i = 0; i < list.size(); i++) {
	    	System.out.println(list.get(i));
	    }
	    
	    System.out.println("--------stack--------");
	    // LIFO (Last In First Out)
	    // push : 데이터 추가
	    // pop : 데이터 가져오기
	    Stack<String> st = new Stack<>();
        st.push("아무개");
        st.push("머시기");
        st.push("뭐라뭐라");
        
        // stack이 비어있을 때까지
        while (!st.isEmpty()) {
        	System.out.println(st.pop());
}
        System.out.println("-----------Queue------------");
        // FIFO (First in First Out)
        Queue<String> qu = new LinkedList<>();
        qu.add("아무개");
        qu.add("머시기");
        qu.add("뭐라뭐라");
        
        while (qu.isEmpty() == false) {
        	System.out.println(qu.poll());
        }
        
        System.out.println("----------HashMap----------");
        // 키-값으로 관리되는 자료구조
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "아무개");
        map.put(2, "머시기");
        map.put(3, "뭐라뭐라");
        
        
        // 해쉬테이블 위치 정보
        Iterator<Integer> keySetIt = map.keySet().iterator();
        
        while (keySetIt.hasNext()) {
        	Integer key = keySetIt.next();
        	System.out.printf("key = %d, 값 = %s\n", key, map.get(key));
        }
     }
	
}