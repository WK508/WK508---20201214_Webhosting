
public class Circle {

		private double r = 0;
		public double getR() {
			return r;
		}
		public void setR(double r) {
			if (r < 0)
			{
				r = 0;
				return;
			}
			this.r = r;
		}
		final double PI = 3.1415;
        
		
		public Circle(double r) {
			setR(r);
		}
}
		
		

        
        
        
		
		
		
