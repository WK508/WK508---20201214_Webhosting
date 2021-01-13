package Car;

public class ArrayMain {

	public static void main(String[] args) {
	   int arr[] = {8, 4, 6, 7, 4, 3};
	   
	   ArrayHap hap = new ArrayHap(arr);
	}

}

class ArrayHap {
	private int sum;
	private int avg;
	
	public ArrayHap(int arr[]) {
		for (int i : arr) {
			sum += i;
		}
		
		avg = sum / arr.length;
		System.out.println("배열의 합 : " + sum);
		System.out.println("배열의 평균 : " + avg);
	}
	
	public int sum() {
		return sum;
	}
	
	public int avg() {
		return avg;
	}
}


	
	

