package com.iPhone.Applications;
import java.util.*;

public class MobileTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Sc = new Scanner(System.in);
		ApplePhones iPhone14 = new ApplePhones();
		
		iPhone14.brand = "Apple";
		iPhone14.model = "iPhone14";
		iPhone14.storageCapacity = "128GB";
		iPhone14.chip =	"A15";
		iPhone14.camera = "12MP";
		iPhone14.simcards = 2;
		iPhone14.buttons = 4;
		iPhone14.battery = 1;
		
	System.out.println("name of the mobile:"+iPhone14.brand);
	System.out.println("name of the mobile:"+iPhone14.model );
	System.out.println("storage capacity of the mobile:"+iPhone14.storageCapacity );
	System.out.println("chip of  mobile:"+iPhone14.chip);
	System.out.println("chip of  mobile:"+iPhone14.camera );
	System.out.println("simcards of mobile:"+iPhone14.simcards);
	System.out.println("buttons of mobile:"+iPhone14.buttons);
	System.out.println("battery of mobile:"+iPhone14.battery );
	iPhone14.startCamera();
	iPhone14.stopCamera();
	
	
	ApplePhones iPhone14Pro= new ApplePhones();
	iPhone14Pro.model= "iPhone14Pro";
	iPhone14Pro.storageCapacity = "512GB";
	iPhone14Pro.chip =	"A16";
	iPhone14Pro.camera = "48MP";
	iPhone14Pro.simcards = 2;
	iPhone14Pro.buttons = 4;
	iPhone14Pro.battery = 1;
	
	System.out.println("\n\n");
	
	System.out.println("name of the mobile:"+iPhone14Pro.brand);
	System.out.println("name of the mobile:"+iPhone14Pro.model );
	System.out.println("storage capacity of the mobile:"+iPhone14Pro.storageCapacity );
	System.out.println("chip of  mobile:"+iPhone14Pro.chip );
	System.out.println("chip of  mobile:"+iPhone14Pro.camera );
	System.out.println("simcards of mobile:"+iPhone14Pro.simcards);
	System.out.println("buttons of mobile:"+iPhone14Pro.buttons);
	System.out.println("battery of mobile:"+iPhone14Pro.battery );
	iPhone14Pro.startCamera();
	iPhone14Pro.stopCamera();
	
	 
	
	}

}
