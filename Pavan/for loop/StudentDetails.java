import java.util.*;
public class StudentDetails{
    public static void main(String[] args){
    Scanner name = new Scanner(System.in);
    System.out.println("Enter the Name");
    String Name = name.nextLine();
    Scanner email = new Scanner(System.in);
    System.out.println("Enter the Email");
    String Email = email.nextLine(); 
    Scanner age = new Scanner(System.in);
    System.out.println("Enter the Age");
    int Age = age.nextInt();
    Scanner phno  = new Scanner(System.in);
    System.out.println("Enter the PhNo");
    long PhNo= phno.nextLong();
    Scanner gender = new Scanner(System.in);
    System.out.println("Enter the Gender");
    String Gender =gender.nextLine();
    Scanner qualification = new Scanner(System.in);
    System.out.println("Enter the Qualification");
    String Qualification  = qualification .nextLine();
    System.out.println("NAME:"+Name);
    System.out.println("EMAIL:"+Email);
    System.out.println("AGE:"+Age);
    System.out.println("PHNO:"+PhNo);
    System.out.println("GENDER:"+Gender);
    System.out.println("QUALIFICATION:"+Qualification);

}
}