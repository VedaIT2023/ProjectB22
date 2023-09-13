import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
    ageInMonths();
       
   
    }

   public static void  ageInMonths(){
        Scanner scanner = new Scanner(System.in);
         while (true) {
            System.out.println("Enter your age : ");
            int age = scanner.nextInt();

            if (age == 0) {
                System.out.println("Exiting the program.");
                break;
            }

            int ageInMonths = age * 12;
            System.out.println("Your age in months is: " + ageInMonths);
        }

        
    }
}













