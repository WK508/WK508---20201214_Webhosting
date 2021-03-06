package Car;

public class Car {
       public static final String JIJUM = "동대구 영업소";
       private String model;
       private String company;
       private String color;
       private String price;
       
	public Car() {
		model = "K7";
		company = "기아";
		color = "블랙";
		price = "사천만원";
	}

	public Car(String model, String company, String color, String price) {
		super();
		this.model = model;
		this.company = company;
		this.color = color;
		this.price = price;
	}
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void showCarInfo() {
		System.out.println("========================");
		System.out.println(Car.JIJUM);
		System.out.println("========================");
		System.out.println("모델 : " + model);
		System.out.println("회사 : " + company);
		System.out.println("색깔 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("========================");
	}
       
       
}
