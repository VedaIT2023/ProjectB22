package com.watch.brands;

public class womenWatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
			 
		Watches fossil = new Watches();
		fossil.brand = "Fossil";
		fossil.color = "Rose Gold";
		fossil.price = 8500;
		fossil.movement = "Quartz";
		fossil.powerSource="Battery";
		fossil.warranty = 2;
		fossil.waterResistance = 50;
		
		System.out.println("watch brand is:"+fossil.brand);
		System.out.println("price of watch is :"+fossil.color);
		System.out.println("price of watch is :"+fossil.price +"/-");
		System.out.println("price of watch is :"+fossil.movement);
		System.out.println("price of watch is :"+fossil.powerSource);
		System.out.println("price of watch is :"+fossil.warranty +"years");
		System.out.println("price of watch is :"+fossil.waterResistance +"m");
		
		
		 System.out.println("");
		 
		Watches Gucci = new Watches();
		Gucci.brand = "GUCCI";
		Gucci.color ="Pink";
		Gucci.price = 1650;
		Gucci.movement = "Quartz";
		Gucci.powerSource = "Battery";
		Gucci.waterResistance = 32;
		
		System.out.println("watch brand is:"+Gucci.brand);
		System.out.println("price of watch is :"+Gucci.color);
		System.out.println("price of watch is :"+"$"+Gucci.price +"/-");
		System.out.println("price of watch is :"+Gucci.movement);
		System.out.println("price of watch is :"+Gucci.powerSource);
		System.out.println("price of watch is :"+Gucci.waterResistance +"mm");
		
		
		
	}

}
