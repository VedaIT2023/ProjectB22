import java.util.Scanner;
public class Userdetails_with_scanner{
   public static void main(String[] args)
   {

    Scanner sc=new Scanner(System.in);

    System.out.print("Name :");
    String Name=sc.nextLine();

    System.out.print("Email :");
    String Email=sc.nextLine();
    
    System.out.print("Qualification :");
    String Qualification=sc.nextLine();


    System.out.print("Age :");
    int Age=sc.nextInt();
     
     System.out.print("Gender :");
    char Gender=sc.next().charAt(0);
  

    System.out.print("Phonenumber :");
    long Phonenumber=sc.nexLong();
    
    
    System.out.println("entered name :"+Name);
    
    System.out.println("entered email :"+Email);
    
    System.out.println("entered qualification :"+Qualification);
   
    System.out.println("entered age :"+Age);
 
    System.out.println("entered Gender :"+Gender);
 
    System.out.println("entered phoneno :"+Phonenumber);
    
   
   
}

}