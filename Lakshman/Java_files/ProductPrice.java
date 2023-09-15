import java.util.*;
public class ProductPrice{
	public static void main(String[] args){
	int count=0;
	Scanner price=new Scanner(System.in);
	String s="yes";
	do{
  
	System.out.println("Enter the actual price of product :");
	long Actualprice=price.nextLong();
	System.out.println("Enter the Discount percentage of product :");
	long Discountpercentage=price.nextLong();
	double Discountprice= (Actualprice*((float)Discountpercentage/100));
	double Finalprice=(Actualprice-Discountprice);
	System.out.println("Final price of the product is :"+Finalprice);
	price.nextLine();
	System.out.println("Are you happy with the Discout Please say yes or no: ");
	String Feedback = price.nextLine();
	if(Feedback.equalsIgnoreCase(s)){
	  System.out.println("Thank You");
		count++;
		}
	}while(count==0);

	price.close();
	
}
}