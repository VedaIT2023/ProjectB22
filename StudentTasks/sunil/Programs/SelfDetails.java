import java.util.Scanner;

public class SelfDetail {
	public static void main(String[] args){

	Scanner readInput = new Scanner(System.in);

	System.out.println("Enter Name");
	String name = readInput.nextLine();

	System.out.println("Enter email ID");
	String email = readInput.nextLine();

	System.out.println("Enter Qualification");
	String qualification = readInput.nextLine();

	System.out.println("Enter Gender");
	String gender = readInput.nextLine();

	System.out.println("Enter Age");
	int age = readInput.nextInt();

	System.out.println("Enter PhoneNumber");
	long phoneNumber = readInput.nextLong();

	System.out.println(" ");
	System.out.println("Name : " + name);
	System.out.println("Email ID : " + email);
	System.out.println("Age is : " + age);
	System.out.println("Gender is : " + gender);
	System.out.println("Phone Number is : " + phoneNumber);
	System.out.println("Qualification is :" + qualification);
}	
}