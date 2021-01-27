package Thread0127;

import java.awt.Toolkit;

public class Thread3 {

	public static void main(String[] args) {
		BeepTask task = new BeepTask();
        Thread th = new Thread(task);
        th.start();
        
        // ���� ������ ����
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

// Runnable �������̽��� ���
// Interface�� �ݵ�� �������̵��� �ؾ��Ѵ�.
class BeepTask implements Runnable {

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
