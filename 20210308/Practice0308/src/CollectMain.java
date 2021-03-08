import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CollectMain {

	public static void main(String[] args) {
		System.out.println("---------- �迭 ----------");
		String strArr[] = new String[4];
		strArr[0] = "��ī�� �Ž�";
		strArr[1] = "Ŭ������ �ε��";
		strArr[2] = "LA ������";
		strArr[3] = "����� ������̽�";
		
		for (String str : strArr)
		{
			System.out.println(str);
		}
		
	    System.out.println("---------- ArrayList ----------");
	    ArrayList<String> list = new ArrayList<>();
	    list.add("�޽��� �ֽ�Ʈ�ν�");
	    list.add("LA ������");
	    list.add("���� ��Ű��");
	    list.add("��ī�� �Ž�");
	    
	    for (int h = 0; h < list.size(); h++)
	    {
	    	System.out.println(list.get(h));
	    }
	    
	    System.out.println("---------- Stack ----------");
	    Stack<String> st = new Stack<>();
	    st.push("�п�Ű ���");
	    st.push("�޽��� �ֽ�Ʈ�ν�");
	    st.push("LA ������");
	    st.push("������ ����轺");
	    
	    while (!st.isEmpty())
	    {
	    	System.out.println(st.pop());
	    }
	    
	    System.out.println("---------- Queue -----------");
	    Queue<String> qu = new LinkedList<>();
	    qu.add("������ ���ųν�");
	    qu.add("�޽��� �ֽ�Ʈ�ν�");
	    qu.add("���� ��Ű��");
	    qu.add("����Ʈ���̽� ī��ν�");
	    
	    while (!qu.isEmpty())
	    {
	    	System.out.println(qu.poll());
	    }
	    
	    System.out.println("---------- HashMap ----------");
	    HashMap<Integer, String> map = new HashMap<>();
	    map.put(1, "LA ������");
	    map.put(2, "���ĺ��� ���̽�");
	    map.put(3, "��Ʋ��Ÿ �극�̺꽺");
	    map.put(4, "�޽��� �ֽ�Ʈ�ν�");
	    
	    Iterator<Integer> keySetIt = map.keySet().iterator();
	    
	    while(keySetIt.hasNext())
	    {
	    	Integer key = keySetIt.next();
	    	System.out.printf("key = %d, �� = %s\n", key, map.get(key));
	    }

	}

}
