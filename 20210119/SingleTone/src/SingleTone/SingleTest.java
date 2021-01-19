package SingleTone;

public class SingleTest {
    private static SingleTest inst;
    private int data;
    
    public SingleTest() {
    	data = (int)(Math.random() * 100);
    }
    
    //class method
    public static SingleTest getInstance() {
    	if(inst == null) {
    		inst = new SingleTest();
    	}
    	return inst;
    }
    
    public int getData() {
    	return data;
    }
}
