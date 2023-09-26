package com.Statecodes.com;

import java.util.Scanner;

public class States {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String States[] = {"Andhra Pradesh","Telangana","Kerala","Arunachal Pradesh","Mizoram","Karntaka","Sikkim","Jammu Kashmir","Tripura","Nagaland","Uttharkhand","Orissa","UttarPradesh","Gujarath","Haryana","Himachal Pradesh","Pune","Bihar","Assam","Madhya Pradesh","Chattish Ghad","Rajastan","Punjab","Maharastra","West Bengal","Manipur","Andaman Nikobar","Jharkhand","Tamilnadu","Meghalaya","Chandighar","Ponecherry"};
		 
		String codes[] = {"AP","TS","KL","APS","MZ","KA","AS","GA","CG","GRT","HP","JK","ML","PY","JK","NL","UK","OR","UP","SK","HP","WB","RJ","TN","TR","PN","MP","PB"};
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any state name :");
		String code = scanner.nextLine();
		
		for(int i=0;i<codes.length;i++){
			if(codes[i].contentEquals(code)) {
				System.out.println("State code: "+code.toUpperCase()+"\nState Name: "+States[i]);
			}
		}
			
		
			
	}
 
}
