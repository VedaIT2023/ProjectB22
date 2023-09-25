package com.pack.code;
import java.util.ArrayList;

public class Duplicate {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList();
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
		ArrayList<Integer> value = new ArrayList();

		for(int i=0; i<names.size();i++) {
            for(int j=i+1; j<names.size();j++){
                    if(names.get(i)==(names.get(j))) {
                        System.out.println("Duplicate name: "+names.get(i)+" -- and it's index value: "+j);
                        value.add(j);
                        break;
                    }
                }
        }

		System.out.println("\nOriginal names:");
		for(int i=0; i<names.size(); i++) {
		    if (!value.contains(i)) {
		        System.out.println("Original name: " + names.get(i) + " -- and it's index value: " + i);
		    }
		}

    }
}