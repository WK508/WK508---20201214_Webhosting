
public class Thread1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread("LA ������");
		MyThread t2 = new MyThread("���ĺ��� ���̽�");
		t1.start();
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main ������ ������");
			Thread.sleep(1000);
		}
		System.out.println("���� ������ ����");

	}

}

class MyThread extends Thread {
	String str;
	
	public MyThread(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(str);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
			    e.printStackTrace();
			}
		}
		System.out.println("�۾� ������ ����");
	}
}