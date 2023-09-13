package com.vedait.Mobilephones;

public class Phone {
	String name="";
	String color="";
	int cam=0;
	String battery="";
	int price=0;
	public void Samsung() {
		name="Samsung";
		color="black";
		cam=4;
		battery="5000mah";
		price=30000;
		System.out.println("properties of samsung");
		System.out.println("color :" + color);
		System.out.println("cam :"+ cam);
		System.out.println("Battery :" + battery);
		System.out.println("Price :" + price+"/-");
	}
	public void Iphone14() {
		name="Iphone14";
		color="white";
		cam=4;
		battery="4000mah";
		price=50000;
		System.out.println("properties of Iphone");
		System.out.println("color :" + color);
		System.out.println("cam :"+ cam);
		System.out.println("Battery :" + battery);
		System.out.println("Price :" + price+"/-");
	}
	public static void main(String[] args) {
		Phone samsung = new Phone();
		samsung.Samsung();
		Phone iphone = new Phone();
		iphone.Iphone14();
		
	}
}
