package com.practise.rivision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class AppMain {

	enum Weekdays{
		sunday,
		monday,
		tuesday,
		wednesday,
		thursday,
		friday,
		saturday
	}
	
	public static int classCount = 10;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
//		if, 
//		if-else, 
//		if-else if, 
//		if if
		
		
		int age = 10;
		switch(age){
			case 10:
				System.out.println("Minor");
			break;
			
			default:
				System.out.println(" Not defined");
				break;
			
		}

		
		Weekdays day = Weekdays.saturday;
		
		switch(day) {
			case monday:
				System.out.println("Today is Monday");
			break;
			
			case tuesday:
				System.out.println("Today is Tuesday");
			break;
			
			case wednesday:
				System.out.println("Today is Wednesday");
			break;
			
			case thursday:
				System.out.println("Today is Thursday");
			break;
			
			
			case friday:
				System.out.println("Today is Friday");
			break;
			
			case saturday:
				System.out.println("Today is Saturdy");
			break;
		}
		

		ArrayList<String> namesArray = new ArrayList<String>();
		namesArray.add("name");
		System.out.println(namesArray);
		
		
		Vector<String> namesVector = new Vector<String>();
		
		Stack<String> namesStack = new Stack<String>();
		
		
		ArrayList<String> namesSet = new ArrayList<String>();
		namesSet.add("Satya");
		namesSet.add("Kavitha");
		namesSet.add("Deepika");
		namesSet.add("Divakar");
		namesSet.add("RamaKrishna");
		namesSet.add("Charan");
		namesSet.add("Satish");
		namesSet.add("Satwik");
		namesSet.add("Balaji");
		namesSet.add("Pavan");
		namesSet.add("Lakshman");
		namesSet.add("Valli");
		
		System.out.println("The lucky person is " + namesSet.get(getRandom()));
		System.out.println(namesSet);
		
		
//		https://www.scientecheasy.com/2020/09/collection-hierarchy-in-java.html/
		
//		https://www.scientecheasy.com/wp-content/uploads/2018/09/java-collection-hierarchy.png
		
		TreeMap<Integer, String> namesTree = new TreeMap<Integer, String>();
		namesTree.put(3, "Kavitha");
		namesTree.put(4, "Balaji");
		namesTree.put(2, "Lakshman");
		System.out.println(namesTree);
				

		
	}
	
	public static int functionOne() {
		System.out.println(classCount);
		return classCount;
	}
	
	public static int functionTwo() {
		classCount = 15;
		System.out.println(classCount);
		return classCount;
	}
	
	public static int functionThree() {
		classCount = 20;
		System.out.println(classCount);
		return classCount;
	}
	
	
	
	public static int getRandom() {
        int min = 0; // Minimum value
        int max = 10; // Maximum value

        Random rand = new Random();
        int randomNumber = rand.nextInt(max - min + 1) + min;
//        System.out.println("Random number between " + min + " and " + max + "is : " + randomNumber);
        return randomNumber;
    }
		
}
