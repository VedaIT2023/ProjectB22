import java.util.*;
public class Productprice{
	public static void main(String[] args){
	String A = "Yes";
	Scanner sc = new Scanner(System.in);
	for(int i=0; i>=0; i++){
	System.out.println("Enter the Product Price:");
	long PP = sc.nextLong();
	System.out.println("Enter the Discount Price:");
	double DP = sc.nextDouble();
	double Discountper = PP*(float)DP/100;
	double Price = (PP-Discountper);
	sc.nextLine();
	System.out.println(" Product Price after Discount:" + Price);
	System.out.println(" Are you Happy with the Discount say Yes or No ");
	String customer = sc.nextLine();  
	if(customer.equalsIgnoreCase(A)){
		System.out.println(" THANK YOU");
		break;
		}
	
	}
}
}