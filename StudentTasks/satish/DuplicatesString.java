package com.vedait.Basic.Operations;
import java.util.*;
public class DuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String>names = new HashSet<>();
		names.add("Sunanda");
		names.add("Sindhu");
		names.add("Kavitha");
		names.add("Chandini");
		names.add("Satya");
		names.add("Chandini");
		names.add("Balaji");
		names.add("Satwik");
		names.add("Satwik");
		names.add("Satwik");
		names.add("Satish");
		names.add("Pavan");
		names.add("Lakki");
		names.add("Valli");
		names.add("Raki");
		names.add("Divakar");
		names.add("Divakar");
		names.add("Divakar");
		names.add("Pavan");
		names.add("Pavan");
		
		HashSet<String> uniqueNames = new HashSet<>();
		for (String name : names) {
				if (!uniqueNames.contains(name)) {
	                uniqueNames.add(name);
	            }
	        }

	        // Print the unique names
	        for (int i=0; i<uniqueNames.size();i++) {
	        }
	        System.out.println(uniqueNames);
		
	}

}
