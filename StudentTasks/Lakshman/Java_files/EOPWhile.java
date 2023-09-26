import java.util.*;
public class EOPWhile{
	public static void main(String[] args){
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the number :");
	int number=num.nextInt();
	int i=0;
	while(i<number){
	System.out.println(i);
	i=i+2;
      }

	System.out.println("Enter the number :");
	System.out.println("Odd Numbers:");
	int number1=num.nextInt();
	int j=1;
	while(j<number1){
	System.out.println(j);
	j=j+2;
      }

	System.out.println("Enter the number :");
	System.out.println("The prime numbers are :");
	int number2=num.nextInt();
	int k=0;
	while(k<number2){
		int n=1;
		int count=0;
		while(n<=k){
			if(k % n==0){
	   		count++;
			}
		n++;
		}
		if(count==2){
	  	   System.out.println(k);
	} 
	k++;
	}
	
  }
}





