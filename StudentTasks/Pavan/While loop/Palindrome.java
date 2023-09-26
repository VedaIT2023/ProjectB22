import java.util.*;
public class Palindrome{
	public static void main(String[] ags){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int num = sc.nextInt();
	int realnum = num;
	int rev=0;
	while(num!=0){
		rev = rev*10 + num%10;
		num = num/10;
	}
	if( realnum == rev){
	System.out.println(" It is Palindrome number ");
	}
	else{
	System.out.println(" It is not a Palindrome number ");
	}	
}
}