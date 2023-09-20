package com.Encapsulation.task;

import java.util.Scanner;

import java.util.Random;

public class Randomnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the any upper limit of random number");
		int num=scanner.nextInt();
		Random random=new Random();
		System.out.println("Random number between 100 num "+num+" is number");
		int num1=random.nextInt();
	}

}
