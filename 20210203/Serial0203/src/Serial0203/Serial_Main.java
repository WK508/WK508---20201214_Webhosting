package Serial0203;

public class Serial_Main {

	public static void main(String[] args) {
		new MySerial().connect("COM3");
		System.out.println("포트 사용 가능!");

	}

}
