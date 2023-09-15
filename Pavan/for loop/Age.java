import java.util.*;
public class age{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while(true){
	System.out.println("Enter Your Age:");
	int age = sc.nextInt();
		if(age == 0){
		System.out.println("STOP");
		break;
		}
	int month = ageIntoMonth(age);
	System.out.println("months :" + month);
	}
}
        public static int ageIntoMonth(int age){
	int month = age*12;
	return month;
}
}