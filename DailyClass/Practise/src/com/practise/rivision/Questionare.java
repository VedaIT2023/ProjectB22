package com.practise.rivision;

public class Questionare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		checkEven(3);
//		System.out.println("Hello");
		checkOdd(4);

	}
	
	public static void checkEven(int num) {
		if(num%2==0) {
			System.out.println("Yes it is an even number");			
		}
		else {
			throw new ArithmeticException("Not a valid number");
		}
	}
	
	public static void checkOdd(int num) throws ArithmeticException {
		if(num%2!=0) {
			System.out.println("Yes it is an odd number");			
		}
		else {
			throw new ArithmeticException("Not a valid odd number");
		}
	}

}
