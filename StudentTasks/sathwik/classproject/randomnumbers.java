package classproject;
import java.util.Random;
import java.util.Scanner;


public class randomnumbers {
	
	

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Upper limit of the number: ");
			int num = scanner.nextInt();
			Random random = new Random();
			int number = random.nextInt(num)+1;
			System.out.println("Random number between 0 and "+num+" is "+number);
		}

	}

