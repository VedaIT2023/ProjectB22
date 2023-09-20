import java.util.Scanner;

public class Integers{
	public static void main(String[] args){
	integerArray();
}
	public static void integerArray(){
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter the number of integers : ");
	n=sc.nextInt();
	int numbers[]=new int [n];
	
	System.out.println("enter the values :");
	for(int i=0 ;i<n;i++){
	numbers[i] = sc.nextInt();
 	}
	addArrayElements(numbers);
	productOfArray(numbers);
	maxInArray(numbers);
	minArray(numbers);
	}
	public static int addArrayElements(int array[]){
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		System.out.println("Sum is : "+sum);
		return sum;
		
	} 
	public static int productOfArray(int numbers[]){
		int mul=1;
		for(int i=0; i<numbers.length; i++){
			mul=mul*numbers[i];
		}
		System.out.println("Multiplication is  : "+ mul);
		return mul;
		
	}
	public static int maxInArray(int array[]) {
		int max=array[0];
		
		for (int i=0;i<array.length;i++) {
			
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("Highest Number in the Array Elements is : "+max);
		return max;
	}
		public static int minArray(int array[]) {
			int min =array[0];
			for(int i=0;i<array.length;i++) {
				if(min>array[i]) {
					min=array[i];
				}
			}
			System.out.println("Least number in the array elements is :"+min);
			return min;
		}
}