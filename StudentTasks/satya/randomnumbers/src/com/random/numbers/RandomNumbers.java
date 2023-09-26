package com.random.numbers;
import java.util.Random;

public class RandomNumbers {
	

	    public static void main(String[] args) {
	        Random random = new Random();
	        int randomNumber = random.nextInt(10) + 1;
           
	        System.out.println("Random number between 1 and 10: " + randomNumber);
	    }
	}



