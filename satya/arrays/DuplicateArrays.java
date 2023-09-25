package com.name.arrays;
import java.util.ArrayList;
import java.util.HashMap;
public class DuplicateArrays {

	    public static void main(String[] args) {
	        ArrayList<String> names = new ArrayList<>();
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

	        
	        HashMap<String,String> array = new HashMap<>();
	        
	        for (int i = 0; i < names.size(); i++) {
	            String name = names.get(i);
	            if (array.containsKey(name)) {
	                
	                System.out.println("Duplicate at index " + i + ": " + name);
	                
	                names.remove(i);
	              
	                i--;
	            } else {
	                
	                array.put(name, name);
	            }
	        }

	      
	        System.out.println("ArrayList with duplicates removed:");
	        for (String name : names) {
	            System.out.println(name);
	        }
	    }
	}
