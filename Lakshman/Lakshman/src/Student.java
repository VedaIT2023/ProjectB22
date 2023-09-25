package com.OOPS.polymorphism;
import java.util.*;

public class Student {

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
		
		System.out.println("Duplicte names along with  Index values :");
		
		for(int i=0;i<names.size();i++) {
			 
			for(int j=i+1;j<names.size();j++) {
				
				if(names.get(i)== names.get(j)) {
					
					System.out.println("Duplicate name: "+names.get(j)+"\n"+"Index value : "+ j);
					break;
				}
				
			}	
		}
		ArrayList<String>Names = new ArrayList(names);
		for(int i=0;i<Names.size();i++) 
			 
			for(int j=i+1;j<Names.size();j++) {
				if(Names.get(i)== Names.get(j)) {
					Names.remove(j);
					j--;
				}
				
			}
		System.out.println();
		System.out.println("The ArrayList after removing Duplicate names :");
		for(int i=0; i<Names.size(); i++) {
			System.out.println(Names.get(i));
		}
		
	}
		
}

