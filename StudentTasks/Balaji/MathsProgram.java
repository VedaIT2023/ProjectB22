package com.vedait.institute.details;
import java.util.*;


public class MathsProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no.of Luddus: ");
		double laddu = scanner.nextDouble();
		
		double laddusCopy = laddu;
		double ladduEaten = laddu-1;
		int i=1;
		while(i<=3) {
			ladduEaten = (laddu-1)/3;
			double remainingLaddu  = (laddu-1)-ladduEaten;
			System.out.println("Laddu Eaten by guy "+i+" is "+(int)ladduEaten);
			System.out.println("Remaining laddus "+(int)remainingLaddu);
			laddu = remainingLaddu;
			i++;
		}
		
		double left = laddu/3;
		System.out.println("Laddus distributed "+(int)left+" for each person");
		
		if(laddu%3==0) {
			System.out.println((int)laddusCopy+" Laddus can be distributed");
		}
		else {
		System.out.println((int)laddusCopy+" Laddus cannot be distributed");

		}
	}
}
