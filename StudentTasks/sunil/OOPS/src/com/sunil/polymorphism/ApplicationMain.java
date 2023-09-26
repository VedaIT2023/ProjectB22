package com.sunil.polymorphism;

public class ApplicationMain {

	public static void main(String[] args) {
		Arithematic.additionOfNumbers(10, 20);
		Arithematic.additionOfNumbers(10, 20,30);
		Arithematic.additionOfNumbers(10, 20 ,30 ,40);
		Arithematic.additionOfNumbers(10, 20 ,30 ,40 ,50);
		System.out.println("\n");
		
		Arithematic sub=new Arithematic();
		sub.subtractionOfNumbers(50,40);
		sub.subtractionOfNumbers(50,40,30);
		sub.subtractionOfNumbers(50,40,30,20);
		sub.subtractionOfNumbers(50,40,30,20,10);
		System.out.println("\n");

		Arithematic.multiplicationOfNumbers(10, 2);
		Arithematic.multiplicationOfNumbers(10,2,3);
		Arithematic.multiplicationOfNumbers(10,2,3,4);
		Arithematic.multiplicationOfNumbers(10,2,3,4,5);
		
		System.out.println("\n\n");
		
		Toyota toy =new Toyota();
		System.out.println("Name : "+toy.name);		
		System.out.println("Colour : "+toy.color);		
		toy.wheeler="4 WHeeler";
		System.out.println("Wheeler  type : "+toy.wheeler);
		toy.type="Sports car";
		System.out.println("Type of car : "+toy.type);
		
		toy.engineType();
		
		
		System.out.println("\n");
		
		Suzuki suz =new Suzuki();
		System.out.println("Name : "+suz.name);		
		System.out.println("Colour : "+suz.color);		
		suz.wheeler="4 WHeeler";
		suz.type="Commercial car";
		System.out.println("Wheeler  type : "+suz.wheeler);
		System.out.println("Type of car : "+suz.type);

		suz.engineType();

		
	}

}
