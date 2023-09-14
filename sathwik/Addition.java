import java.util.*;
	public class Addition{
		public static void main(String[] args){
	Scanner num = new Scanner(System.in);
	int a = num.nextInt();
	System.out.println("Enter the numbers :");
	int[] array= new int[a];

		for(int i=0; i<a; i++){
			array[i] = num.nextInt();
		}
		System.out.println("numbers are :");
		for(int i=0; i<a; i++){
			System.out.println(array[i]);
		}
		sumOfArray(array);
		productOfArray(array);
	}
		public static int sumOfArray(int array[]){
		int sum = 0;
		for(int i=0; i<array.length; i++){
			sum += array[i];
		}
		System.out.println("Sum " + sum);
		return sum;
		}
		public static int productOfArray(int array[]){
		int product=1;
		for(int i=0; i<array.length; i++){
			product *= array[i];
		}
		System.out.println("Product " + product);
		return product;
		}
	
	}
		
