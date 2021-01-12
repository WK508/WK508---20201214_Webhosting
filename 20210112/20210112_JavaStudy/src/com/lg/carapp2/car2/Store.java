package com.lg.carapp2.car2;

public class Store {

	 private String maker;
	 private String color;
	 private String name;
	 private int price;
	 private String store;
	 
	 public Store() {
		 maker = "기아";
		 color = "블랙";
		 name = "K7";
		 price = 40000000;
		 store = "동대구 영업소";
		 showStoreInfo();
	 }
	 
	 public Store(String maker, String color, String name, int price, String store) {
		 super();
		 this.maker = maker;
		 this.color = color;
		 this.name = name;
		 this.price = price;
		 this.store = store;
	 }

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}
	 
	 public void showStoreInfo() {
		 System.out.println("제조사 : " + maker);
		 System.out.println("색상 : " + color);
		 System.out.println("이름 : " + name);
		 System.out.println("가격 : " + price);
		 System.out.println("대리점명 : " + store);
		 System.out.println("-------------------");
	 }
}
