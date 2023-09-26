package com.random.numbers;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Upper limit of the number: ");
		int num = scanner.nextInt();
		Random random = new Random();
		int number = random.nextInt(num)+1;
		System.out.println("Random number between 1 and "+num+" is "+number);
	}

}
