package Thread0127;


public class Thread1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread("LA 다저스");
		MyThread t2 = new MyThread("탬파베이 레이스");
		t1.start(); // t1 쓰레드 객체 동작 시작
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main 쓰레드 동작중");
			Thread.sleep(1000);
		}
		System.out.println("메인 쓰레드 종료");

	}

}

class MyThread extends Thread {
	String str;
	
	public MyThread(String str) {
		this.str = str;
	}

	// 오버로딩 : 중복정의
	// 오버라이딩 : 부모의 것을 재정의
	// 쓰레드로 동작하는 부분
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(str);
			// 1000ms = 1초
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		System.out.println("작업 쓰레드 종료");
	}
	
	
}
