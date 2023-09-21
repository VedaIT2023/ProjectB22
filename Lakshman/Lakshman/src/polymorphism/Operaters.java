package com.OOPS.polymorphism;

public class Operaters {
	
	static void addnumbers(int a,int b) {
		System.out.println("The Addition of two numbers : "+(a+b));
	}
	static void addnumbers(int a,int b,int c) {
		System.out.println("The Addition of three numbers : "+(a+b+c));
	}
	static void addnumbers(int a,int b,int c,int d) {
		System.out.println("The Addition of four numbers : "+(a+b+c+d));
	}
	static void addnumbers(int a,int b,int c,int d,int e) {
		System.out.println("The Addition of five numbers : "+(a+b+c+d+e));
	}
	
	
	static void subnumbers(int a,int b) {
		System.out.println("The Substraction of two numbers : "+(a-b));
	}
	static void subnumbers(int a,int b,int c) {
		System.out.println("The Substraction of three numbers : "+(a-b-c));
	}
	static void subnumbers(int a,int b,int c,int d) {
		System.out.println("The Substraction of four numbers : "+(a-b-c-d));
	}
	static void subnumbers(int a,int b,int c,int d,int e) {
		System.out.println("The Substraction of five numbers : "+(a-b-c-d-e));
	}
	
	static void mulnumbers(int a,int b) {
		System.out.println("The Multiplication of two numbers : "+a*b);
	}
	static void mulnumbers(int a,int b,int c) {
		System.out.println("The Multiplication of three numbers : "+a*b*c);
	}
	static void mulnumbers(int a,int b,int c,int d) {
		System.out.println("The Multiplication of four numbers : "+a*b*c*d);
	}
	static void mulnumbers(int a,int b,int c,int d,int e) {
		System.out.println("The Multiplication of five numbers : "+a*b*c*d*e);
	}
	

	public static void main(String[] args) {
		Operaters.addnumbers(10,30);
		Operaters.addnumbers(10,30,60,20);
		System.out.println();
		
		Operaters.subnumbers(100,30);
		Operaters.subnumbers(100,30,25);
		System.out.println();
		
		Operaters.mulnumbers(10,30,25,3,2);
		Operaters.mulnumbers(10,3,2);
	}

}
