import java.util.*;
public class Revwhile {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a name:");

	String Name = sc.nextLine();
	int len = Name.length();
	String rev = " ";
	int i=len-1;
	while(i>=0) {
		rev = rev + Name.charAt(i);
	i--;
	}
	
	System.out.println("Reverse String is :" + rev);

   }
}