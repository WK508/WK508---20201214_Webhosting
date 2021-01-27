package Thread0127;

import java.awt.Toolkit;

public class Thread2 {

	public static void main(String[] args) {
		BeepThread beep = new BeepThread();
		//�۾� ������ ����
		beep.start();
		
		//���� ������ ����
		for (int i = 0; i < 5; i++) {
			System.out.println("���� ������ ���� : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("���� ������ ����");

	}

}

// �����带 ����ϱ� ���ؼ��� run()�� �ݵ�� �������̵� �ؾ� �Ѵ�.
// �θ� Ŭ������ Thread ���
class BeepThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("�۾������� : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�۾� ������ ����");
	}
	
}