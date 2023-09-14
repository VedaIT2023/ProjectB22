import java.util.Scanner;
public class age {
          public static void main(String[] args) {
    ageInMonths();
       
   
    }

   public static int  ageInMonths(){
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        int ageInMonths = age*12;

        System.out.println("Your age in months is: " + ageInMonths);
         return ageInMonths;

        
    }
}