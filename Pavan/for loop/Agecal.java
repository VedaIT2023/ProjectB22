import java.util.*;
public class agecal{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Age:");
	int age = sc.nextInt();
	int month = ageIntoMonth(age);
	System.out.println("months :" + month);
}
        public static int ageIntoMonth(int age){
	int month = age*12;
	return month;
}
}