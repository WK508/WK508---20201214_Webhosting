package Car;

public class Car {
       public static final String JIJUM = "���뱸 ������";
       private String model;
       private String company;
       private String color;
       private String price;
       
	public Car() {
		model = "K7";
		company = "���";
		color = "��";
		price = "��õ����";
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
		System.out.println("�� : " + model);
		System.out.println("ȸ�� : " + company);
		System.out.println("���� : " + color);
		System.out.println("���� : " + price);
		System.out.println("========================");
	}
       
       
}
