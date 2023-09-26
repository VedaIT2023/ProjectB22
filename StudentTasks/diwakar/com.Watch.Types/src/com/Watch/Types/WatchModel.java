package com.Watch.Types;

public class WatchModel {

	public WatchModel(String string, String string2, String string3, int i, String string4, int j) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WatchModels Types=new WatchModels("Fasttrack","Yes","Analog",2,"Brown",12000); 
	    System.out.println("Name of brand : "+Types.brand);
	    System.out.println("Water : "+Types.waterresistant);
	    System.out.println("Display: "+Types.displaytype);
	    System.out.println("Belts: "+Types.belts);
	    System.out.println("Strapcolour: "+Types.strapcolour);
	    System.out.println("Price: "+Types.price);
	
	    System.out.println(" ");
	
	    WatchModels Types1=new WatchModels("Noise","Yes","Screen",4,"Black",8000); 
	    System.out.println("Name of brand : "+Types1.brand);
	    System.out.println("Water : "+Types1.waterresistant);
	    System.out.println("Display: "+Types1.displaytype);
	    System.out.println("Belts: "+Types1.belts);
	    System.out.println("Strapcolour: "+Types1.strapcolour);
	    System.out.println("Price: "+Types1.price);
	  
	    System.out.println(" ");
	    
	    WatchModels Types2=new WatchModels("casio","Yes","Digital",2,"Silver",24000); 
	    System.out.println("Name of brand : "+Types2.brand);
	    System.out.println("Water : "+Types2.waterresistant);
	    System.out.println("Display: "+Types2.displaytype);
	    System.out.println("Belts: "+Types2.belts);
	    System.out.println("Strapcolour: "+Types2.strapcolour);
	    System.out.println("Price: "+Types2.price);
	}   
}
