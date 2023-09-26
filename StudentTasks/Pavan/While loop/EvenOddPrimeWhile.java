import java.util.*;
public class EvenOddPrimeWhile{
	public static void main(String[] args){

	int number,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	number=sc.nextInt();

	i=2;
	System.out.println("Even Numbers are:");
	while(i<number){
		System.out.println(i);
	i=i+2;
	}

	int num,j;
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter the number");
	num=ab.nextInt();

	j=1;
	System.out.println("Odd Numbers are:");s
	while(j<num){
		System.out.println(j);
	j=j+2;
	}

	int n,k;
	Scanner rc =new Scanner(System.in);
	System.out.println("Enter the number");
	n=rc.nextInt();

	System.out.println("Prime Numbers are:");
	k=0;
	while(k<=n){
		int m=1;
		int count =0;
		while (m<=k){
			if(k%m==0){
			count++;
			}
		m++;
		}
		if(count == 2){
			System.out.println(k);
	}
	k++;
}
				
}
}