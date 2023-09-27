import java.util.*;

public class AgeCalculator {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter your Age:");
			int age = sc.nextInt();
			if(age == 0){
			System.out.println("Your Input is wrong ");
			break;
				}
			
			ageCalculation(age);
		}
	
        
    }

    public static void ageCalculation(int age) {
		int months = age * 12;
        System.out.println("Age in Months: " + months);
    }
}