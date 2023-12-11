package com.vedait.encapsulation;

import java.util.ArrayList;
import java.util.HashMap;

public class ApplicationMain {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		
		HashMap<String,String> cityCodes = new HashMap();
		cityCodes.put("AP", "Andhra Pradesh");
		cityCodes.put("AR", "Arunachal Pradesh");
		cityCodes.put("JH", "Jharkhand");
		cityCodes.put("MP", "Madhya Pradesh");
		
		HashMap<String,String> phoneBook = new HashMap();
		phoneBook.put("Dinesh", "9876543211");
		phoneBook.put("Balaji", "2476543211");
		phoneBook.put("Satwik", "6253595846");
		
		phoneBook.remove("Dinesh");
		
		System.out.println(phoneBook.get("Dinesh"));
		
		System.out.println(cityCodes.get("JH"));
		
		
		//Polymorphism: 
		//runtime method overloading and 
		//compiletime method overriding
		
		ArrayList<String> names = new ArrayList();
		names.add("Dinesh");
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Satish");
		names.add("Jiddesh");
		
		
		
		Additions.addNumbers(1,2,3,4,5);
		
		
		ChaitanyaTechSchool madhapurBranch = new ChaitanyaTechSchool();
		System.out.println(madhapurBranch.passPercentage());
		
		
		Oxford hitech = new Oxford();
		System.out.println(hitech.passPercentage());
		
		
	}
	
	public static void getPercentage() {
		 
	}
	
	public static void promotedStatus() {
		
	}
	
	public static void printDetails() {
		
	}

}
