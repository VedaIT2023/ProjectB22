package com.vedait.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicate {

	public static void main(String[] args) {
		        List<String> names = new ArrayList<>();
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


		        Set<String> uniqueNames = new HashSet<>();
		        Set<String> duplicateNames = new HashSet<>();

		        System.out.println("Duplicate Names and Their Indices: ");
		        for (int i = 0; i < names.size(); i++) {
		            String name = names.get(i);
		            if (!uniqueNames.add(name)) {
		                if (duplicateNames.add(name)) {
		                    
		                    System.out.println(name + " : " + i);
		                } else {
		                    
		                    System.out.println(name + " : " + i);
		                }
		            }
		        }
		    }
}