package com.vedait.interfaces;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		   
		        Scanner scanner = new Scanner(System.in);
		        int age;
		        
		        try {
		            System.out.print("Enter your age: ");
		           age = scanner.nextInt();
		        } catch (Exception e) {
		            System.out.println("Invalid input. Please enter a valid integer for age.");
		            scanner.close();
		            return;
		        }
				System.out.println("Your age is: " + age);
		        
		    }
	}



        