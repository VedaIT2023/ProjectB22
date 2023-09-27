import java.util.*;
public class Reverse{
	public static void main(String[] args){
	Scanner Name=new Scanner(System.in);
	System.out.println("Enter the Name :");
	String name=Name.nextLine();
	for(int i=name.length()-1; i>=0;i--){   
	    System.out.print(name.charAt(i));
	}
}
}