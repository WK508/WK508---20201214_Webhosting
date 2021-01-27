package Collect210127;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CollectMain {

	public static void main(String[] args) {
		System.out.println("-------�迭-------");
		String strArr[] = new String[3];
		strArr[0] = "�ƹ���";
	    strArr[1] = "�ӽñ�";
	    strArr[2] = "���󹹶�";
	    
	    
	    for (String str : strArr) {
	    	System.out.println(str);
	    }
	    
	    for (int i = 0; i < strArr.length; i++) {
	    	System.out.println(strArr[i]);

	}
	    
	    System.out.println("-------ArrayList-------");
	    ArrayList<String> list = new ArrayList<>();
	    list.add("�ƹ���");
	    list.add("�ӽñ�");
	    list.add("���󹹶�");
	    
	    for (int i = 0; i < list.size(); i++) {
	    	System.out.println(list.get(i));
	    }
	    
	    System.out.println("--------stack--------");
	    // LIFO (Last In First Out)
	    // push : ������ �߰�
	    // pop : ������ ��������
	    Stack<String> st = new Stack<>();
        st.push("�ƹ���");
        st.push("�ӽñ�");
        st.push("���󹹶�");
        
        // stack�� ������� ������
        while (!st.isEmpty()) {
        	System.out.println(st.pop());
}
        System.out.println("-----------Queue------------");
        // FIFO (First in First Out)
        Queue<String> qu = new LinkedList<>();
        qu.add("�ƹ���");
        qu.add("�ӽñ�");
        qu.add("���󹹶�");
        
        while (qu.isEmpty() == false) {
        	System.out.println(qu.poll());
        }
        
        System.out.println("----------HashMap----------");
        // Ű-������ �����Ǵ� �ڷᱸ��
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "�ƹ���");
        map.put(2, "�ӽñ�");
        map.put(3, "���󹹶�");
        
        
        // �ؽ����̺� ��ġ ����
        Iterator<Integer> keySetIt = map.keySet().iterator();
        
        while (keySetIt.hasNext()) {
        	Integer key = keySetIt.next();
        	System.out.printf("key = %d, �� = %s\n", key, map.get(key));
        }
     }
	
}