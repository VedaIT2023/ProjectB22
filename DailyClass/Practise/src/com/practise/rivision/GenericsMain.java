package com.practise.rivision;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericsMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		swapGeneric(10,20);
//		swapGeneric("Java ","Class");
//		swapGeneric(10.4,"Class");
		
		GenericClass<Integer> genC = new GenericClass<Integer>(10, 20);
		genC.swapGeneric();
		
		GenericClass<String> genStr = new GenericClass<String>("Java", "Class");
		genStr.swapGeneric();
		
		
		ArrayList myList = new ArrayList();
		myList.add("abc");
		myList.add(10);
		myList.add(10.5f);
		myList.add(true);
		myList.add('a');
		
		
	}
	
		
	
//	public static <K> void swapGeneric(K a, K b) {
//		
//		Object val1 = a;
//		Object val2 = b;
//		
//		System.out.println("Before swapping " + val1 + " " + val2);
//		
//		Object temp = val1;
//		val1 = val2;
//		val2 = temp;
//		
//		System.out.println("Before swapping " + val1 + " " + val2);
//
//	}
		
	
	
	

}
