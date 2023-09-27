import java.util.*;

public class AgeCalculator {
    public static void main(String[] args) {
        ageCalculation();
    }

    public static void ageCalculation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = sc.nextInt();
        
        int months = age * 12;
        System.out.println("Age in Months: " + months);
    }
}