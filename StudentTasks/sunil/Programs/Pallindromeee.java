
import java.util.*;
public class palidrome {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ;
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int currentNumber = num;
	int rev = 0;
	while(num!=0) {
	rev = rev*10 + num % 10; 
	num = num/10;
	}
	if(currentNumber == rev) {
		System.out.println("It is Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
			}
	}
}