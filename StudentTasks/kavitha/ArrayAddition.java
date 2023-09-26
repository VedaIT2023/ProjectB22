 import java.util.Scanner;

public class ArrayAddition{
	public static void main(String[] args){

	Scanner val=new Scanner(System.in);
	System.out.println("Enter the Numbers values:");

	int num=val.nextInt();
	int arr[]=new int[num];
	

	for (int i = 0; i < num; i++) {
            System.out.print("Numbers " + (i + 1) + ": ");
            arr[i] = val.nextInt();
        }
	int sum=0;
	  for(int i=0;i<num;i++){
		sum=sum+arr[i];

	
}
	System.out.println(sum);	
}
}