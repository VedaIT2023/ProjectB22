package com.vedait.Hash.Poly;

public class ArithmeticOP {
	
		static void addNumbers(int a, int b) {
		System.out.println("Addition of Two Numbers is :" + (a+b));
		}
		
		static void addNumbers(int a, int b, int c) {
		System.out.println("Addition of Three Numbers is :" + (a+b+c));
		}
		
		static void addNumbers(int a, int b, int c, int d) {
		System.out.println("Addition of Four Numbers is :" + (a+b+c+d));
		}
		
		static void addNumbers(int a, int b, int c, int d, int e) {
		System.out.println("Addition of Five Numbers is :" + (a+b+c+d+e));
		}
	
		static void subNumbers(int a,int b) {
		System.out.println("Substraction of Two Numbers is :" + (a-b));
		}
		
		static void subNumbers(int a,int b,int c) {
		System.out.println("Substraction of Three Numbers is :" + (a-b-c));
		}
		
		static void subNumbers(int a,int b,int c,int d) {
		System.out.println("Substraction of Four Numbers is :" + (a-b-c-d));
		}
		
		static void subNumbers(int a,int b,int c,int d,int e) {
		System.out.println("Substraction of Five Numbers is :" + (a-b-c-d-e) );
		}
	
		static void mulNumbers(int a,int b) {
		System.out.println("Multiplication of Two Numbers is :" + (a*b));
		}
		
		static void mulNumbers(int a,int b,int c) {
		System.out.println("Multiplication of Three Numbers is :" + (a*b*c));
		}
		
		static void mulNumbers(int a,int b,int c,int d) {
		System.out.println("Multiplication of Four Numbers is :" + (a*b*c*d));
		}
		
		static void mulNumbers(int a,int b,int c,int d,int e) {
		System.out.println("Multiplication of Five Numbers is :" + (a*b*c*d*e));
		}
		
	public static void main (String[] args) {
		
		ArithmeticOP.addNumbers(1,2);
		ArithmeticOP.subNumbers(1,2,3);
		ArithmeticOP.mulNumbers(1,2,3,4,6);
	}
	
}
