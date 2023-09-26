package com.vedait.MyFiles;

public class Watches {

	String name,strape_type,display_type,colour,movement,connectivity_type,controller_type,tracker;
	int Price,wattage,storage,battery_power,length;
	double case_size,weight;
	
	void watchStart() {
		System.out.println(this.name + " Watch Started Working");
	}
	
	void watchStop() {
		System.out.println(this.name +  " Watch Stoped Working");
	}
	
	void heartRate() {
		System.out.println(this.name + " Monitoring your Heart Rate");
	}
	
	void music() {
		System.out.println(this.name + " Stream Music");
	}
	
	void bluetoothCallingOn() {
		System.out.println(this.name + " Bluetooth Calling Started");
	}
	
	void bluetoothCallingOff() {
		System.out.println(this.name + " Bluetooth Calling Stopped");
	}
	
	void alarmOn() {
		System.out.println(this.name + " Alarm is ON");
	}
	
	void alarmOff() {
		System.out.println(this.name + " Alarm is OFF");
	}
	
	public static void main(String[] args) {
		Watches omega = new Watches();
		
		omega.name = "Omega Planet Ocean";
		omega.strape_type = "Leather";
		omega.case_size  = 43.5;
		omega.display_type = "Analog";
		omega.colour = "Blue";
		omega.Price = 2750600;
		
		System.out.println("Brand Name :" + omega.name);
		System.out.println("Strape :" + omega.strape_type );
		System.out.println("Case Size :" + omega.case_size + "mm");
		System.out.println("Dispaly Type :" + omega.display_type);
		System.out.println("Colour :" + omega.colour);
		System.out.println("Price :" + "INR " + omega.Price );
		omega.watchStart();
		omega.watchStop();
		
		Watches rolex = new Watches();
		
		rolex.name = "Rolex Daytona";
		rolex.strape_type = "Chain";
		rolex.case_size  = 40;
		rolex.movement = "Automatic";
		rolex.colour = "Gold";
		rolex.Price = 69990;
		
		System.out.println("\nBrand Name :" + rolex.name);
		System.out.println("Strape :" + rolex.strape_type );
		System.out.println("Case Size :" + rolex.case_size + "mm");
		System.out.println("Movement :" + rolex.movement);
		System.out.println("Colour :" + rolex.colour);
		System.out.println("Price :" + "INR " + rolex.Price);
		rolex.watchStart();
		rolex.watchStop();
		
		Watches apple = new Watches();
		
		apple.name = "Apple Watch Series 8";
		apple.weight= 420;
		apple.wattage = 40;
		apple.connectivity_type = "Celluar";
		apple.colour = "Graphite/Midnight";
		apple.Price = 79899;
		
		System.out.println("\nBrand Name :" + apple.name);
		System.out.println("Weight :" + apple.weight + "g" );
		System.out.println("Wattage:" + apple.wattage + "Watts");
		System.out.println("Connectivity :" + apple.connectivity_type);
		System.out.println("Colour :" + apple.colour);
		System.out.println("Price :" + "INR " + apple.Price);
		apple.heartRate();
		apple.music(); 
		
		Watches samsung = new Watches();
		
		samsung.name = "Samsung Galaxy Watch5";
		samsung.storage= 16;
		samsung.battery_power = 410;
		samsung.controller_type = "Touch Screen";
		samsung.colour = "Sapphire";
		samsung.Price = 30999;
		
		System.out.println("\nBrand Name :" + samsung.name);
		System.out.println("Storage Capacity :" + samsung.storage + "GB" );
		System.out.println("Battery :" + samsung.battery_power);
		System.out.println("Controller Type:" + samsung.controller_type);
		System.out.println("Colour :" + samsung.colour);
		System.out.println("Price :" + "INR " + samsung.Price);
		samsung.alarmOn(); 
		samsung.alarmOff(); 
		
		Watches garmin = new Watches();
		
		garmin.name = "garmin Forerunner 245";
		garmin.weight= 0.08;
		garmin.length = 14;
		garmin.tracker = "GPS";
		garmin.colour = "Black";
		garmin.Price = 67490;
		
		System.out.println("\nBrand Name :" + garmin.name);
		System.out.println("Weight in pounds :" + garmin.weight + " pounds" );
		System.out.println("Length :" + garmin.length + "cm");
		System.out.println("Special Feature:" + garmin.tracker);
		System.out.println("Colour :" + garmin.colour);
		System.out.println("Price :" + "INR " + garmin.Price);
		garmin.bluetoothCallingOn();
		garmin.bluetoothCallingOff();

	}

}
