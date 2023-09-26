package com.vedait.dup.stuhash;
import java.util.*;
public class DupIndex {
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

	System.out.println("Duplicate Names with their indexes :");
	System.out.println();
	 for(int i=0;i<names.size();i++) {
		 for(int j=i+1;j<names.size();j++) {
			 if(names.get(i)==names.get(j)) {
				 System.out.println("Duplicate Name: " + names.get(i) + " at index "+ j);
				 break;
				 
			 }
			 
		 }
		 
	 }
		for(int i=0;i<names.size();i++)  
			for(int j=i+1;j<names.size();j++) {
				if(names.get(i)== names.get(j)) {
					names.remove(j);
					j--;
				}
				
			}
		System.out.println();
		System.out.println("ArrayList after removing Duplicate names :");
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
	}
}	
