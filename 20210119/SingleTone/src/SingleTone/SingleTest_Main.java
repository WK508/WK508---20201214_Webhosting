package SingleTone;

public class SingleTest_Main {

	public static void main(String[] args) {
		System.out.println("牢胶畔胶 按眉 积己");
		for (int i = 0; i < 5; i++) {
			System.out.println(new SingleTest().getData());
		}
		System.out.println("教臂沛 按眉 积己");
		for (int i = 0; i < 5; i++) {
			System.out.println(SingleTest.getInstance().getData());
		}

	}

}
