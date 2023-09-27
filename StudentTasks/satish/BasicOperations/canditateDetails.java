import java.util.*;
public class canditateDetails {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Name:");
	String name = sc.nextLine();
	System.out.println("Enter the Age:");
	int age = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter your Email Id:");
	String email = sc.nextLine();
	System.out.println("Mention Your Gender");
    char gender = sc.next().charAt(0);
        studentDetails(name, age, email, gender);
    }

    public static void studentDetails(String name, int age, String email, char gender) {
        System.out.println("Candidate Details:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + age);
        System.out.println("Age: " + email);
        System.out.println("Gender: " + gender);
    }
}

