package Satish;
import java.util.Scanner;

public class StudentAge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the Age:");
                int age = sc.nextInt();
                System.out.println("Entered age: " + age);
                break; 
            } catch (Exception e) {
                System.out.println("Please Enter a Valid User Age");
                sc.nextLine(); 
            }
        }
    }
}

