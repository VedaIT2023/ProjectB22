package com.name.arrays;
import java.util.ArrayList;
public class EmptyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> names = new ArrayList();
		names.add("satya");
		names.add("kavitha");
		if(names.isEmpty()) {
			System.out.println("array is empty"+names.get(0));
	        System.out.println("Number of names: " + names.size()); // Get the number of names

		}
	
	}

}
