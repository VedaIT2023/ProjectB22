package functions;
import java.util.*;
public class Details {
    public static void printdetails(String name,String age, String email ){
        System.out.println();
        System.out.println();
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Email :"+email);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name :");
        String name=sc.nextLine();
        System.out.print("enter age:");
        String age=sc.nextLine();
        System.out.print("enter email:");
        String email=sc.nextLine();
        printdetails(name,age,email);
        sc.close();
    }
}
