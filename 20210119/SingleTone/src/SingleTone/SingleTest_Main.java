package SingleTone;

public class SingleTest_Main {

	public static void main(String[] args) {
		System.out.println("�ν��Ͻ� ��ü ����");
		for (int i = 0; i < 5; i++) {
			System.out.println(new SingleTest().getData());
		}
		System.out.println("�̱��� ��ü ����");
		for (int i = 0; i < 5; i++) {
			System.out.println(SingleTest.getInstance().getData());
		}

	}

}
