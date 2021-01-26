

public class Question_1 {

	public static void main(String[] args) {
		Circle c = new Circle(0);
		c.setRad(0);
		
	}
}

		
		
 class Circle {
	double rad = 0;
	final double PI = 3.14;
	
	public Circle(double r) { setRad(r); }
	
	public double getArea() { return (rad * rad) * PI; }
	
	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	}


	
