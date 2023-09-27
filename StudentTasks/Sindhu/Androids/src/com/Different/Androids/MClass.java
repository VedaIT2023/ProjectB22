package com.Different.Androids;
import java.util.*;

public class MClass {
	
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Android Smartphones and Features:");
		Phones smp1 = new Phones();  //Constructing obj. for samsung class
		smp1.samsungPhone(); //Calling function in class using class obj.
		SmartPhone smp = new SmartPhone();
		smp.printSmartPhoneFeatures("Samsung","Galaxy S21",128,6.2,12,"Android");
		
		
		System.out.print("\n\n");
		
		
		smp1.OnePlusPhone();
		smp.printSmartPhoneFeatures("OnePlus","9 Pro", 256, 6.7, 48, "OxygenOS");
        
	}   
}
		
		        
		  
		        	
		  

