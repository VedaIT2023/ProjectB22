import java.util.*;
public class Stringrev {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a name:");

	String Name = sc.nextLine();
	int len = Name.length();
	String rev = " ";

	for(int i=len-1;i>=0;i--) {
		rev = rev + Name.charAt(i);
		}
	System.out.println("Reverse String is :" + rev);

   }
}