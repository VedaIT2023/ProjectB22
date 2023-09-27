import java.util.*;
public class Eop {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number");
	int num = sc.nextInt();
	int i=0;
	System.out.println("Even Numbers are : ");
	while(i<=num) {
		System.out.println(i);
		i+=2;
		}
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter a Number");
	int num1 = sc1.nextInt();
	int j=1;
	System.out.println("Odd Numbers are :");
	while(j<=num1) {
		System.out.println(j);
		j+=2;
		}
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Enter a Number");
	int n = sc2.nextInt();
	
	System.out.println("Prime Numbers are :");
	int k=0;
	while(k<=n) {
		int m=1;
		int count=0;
		while(m<=k) {
			if(k % m == 0) {
			count++;
			}
		m++;
		}
		if(count == 2) {
			System.out.println(k);
				}
	k++;	
	}

   }
}
