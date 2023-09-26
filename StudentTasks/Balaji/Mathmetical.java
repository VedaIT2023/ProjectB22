package com.vedait.institute.details;
import java.util.Scanner;

public class Mathmetical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of laddus: ");
		double l = scanner.nextDouble();

		double a = (l-1)/3;
		double b  = (l-1)-a;
		System.out.println("First guy ate "+a+" laddus");
		System.out.println("remaining laddus"+b);

		double c = (b-1)/3;
		double e = (b-1)-c;
		System.out.println("Second guy ate "+c+" laddus");
		System.out.println("remaining laddus"+e);		
		double f = (e-1)/3;
		double g = (e-1)-f;
		System.out.println("Third guy ate "+f+" laddus");
		System.out.println("remaining laddus "+g);		
		double h = g/3;
		
		System.out.println("Each guy gets "+h+" laddus");		

		
		if(g%3==0) {
			System.out.println(l+" it is correct");
		}
		else {
			System.out.println(l+ " it is wrong");
		}
	}

}
