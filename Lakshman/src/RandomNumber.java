package com.Student.data;
import java.util.*;

public class RandomNumber {
	public static void main(String[] args) {
	  
	  int maxNum;

      Scanner num = new Scanner(System.in);
      Random random = new Random();
      
      System.out.print("Enter maximum range: ");
      maxNum=num.nextInt();
      
      for(int i=1; i<=10; i++) {
          System.out.println(random.nextInt(maxNum));
      }
  }
}
