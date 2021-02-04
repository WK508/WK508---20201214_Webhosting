import java.awt.Toolkit;

public class Thread2 {

	public static void main(String[] args) {
		BeepThread beep = new BeepThread();
		beep.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("메인 쓰레드 동작 : " + i);
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("메인 쓰레드 종료");

	}

}

  class BeepThread extends Thread {
	  @Override
	  public void run() {
		  Toolkit toolkit = Toolkit.getDefaultToolkit();
		  for (int i = 0; i < 5; i++) {
			  toolkit.beep();
			  System.out.println("작업쓰레드 : " + i);
			  try {
				  Thread.sleep(2000);
			  }catch (InterruptedException e) {
				  e.printStackTrace();
			  }
		  }
		  System.out.println("작업 쓰레드 종료");
	  }
  }
