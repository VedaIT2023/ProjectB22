import java.util.Scanner;
public class BioData{

	static String name;
        static int age;
        static String email;
        static char gender;
        
	

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter name :");
	name = sc.nextLine();

	System.out.println("Enter Age :");
	age = sc.nextInt();
	sc.nextLine();

	System.out.println("Enter Email :");
	email = sc.nextLine();

	System.out.println("Enter Gender :");
	gender = sc.next().charAt(0);	

	bioData(name,age,email,gender);
}
	public static void bioData(String name,int age,String email,char gender){
	
	System.out.println("\nBio Data of Person :\n");
	
	System.out.println("Name :" + name);
	System.out.println("Age :" + age);
	System.out.println("Email :" + email);
	System.out.println("Gender :" + gender);


}
}