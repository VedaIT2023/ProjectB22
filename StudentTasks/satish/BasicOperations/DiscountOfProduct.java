import java.util.*;
public class DiscountOfProduct {
	public static void main(String[] args) {
	String a = "yes";
	while (true) {
	Scanner sc = new Scanner(System.in);
 	
	System.out.println("Enter the Maximum Retail Price:");
	double MRP = sc.nextDouble();
	System.out.println("Enter the Discount  Price");
	double DP = sc.nextDouble();
	double offerprice = MRP*(float)DP/100;
	double soldprice = (MRP-offerprice);
	System.out.println("Sold Price of the Product is :" + soldprice);
	String Price = sc.next();
	if(Price.equals(a)) {
		System.out.println("Happy Customers");
		break;
		} else {
			continue;
		}
	   }
	
	

	}
	
}