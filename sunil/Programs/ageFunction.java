import java.util.Scanner;

public class AgeFunction{
	public static void main(String[] args){
	ageInMonths();
}
	public static  int ageInMonths(){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter age");
	int age=sc.nextInt();
	int month=age*24;
	System.out.println(month);
	return month;
	}
	
}