import java.util.*;
public class ArraySum{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		System.out.println("no.of elements in the array : " + X);
		int[] array =new  int[X];
		for(int i=0;i<X;i++){
			
			array[i]=input.nextInt();
			
		}
		System.out.println("array elements are:");
		for(int i=0;i<X;i++){
		
			System.out.print(array[i]+" \n");
		}
		 SumOfArray(array);
		ProductOfArray(array);
		
		
	}
	public static int SumOfArray(int array[]){
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum += array[i];
		}
		System.out.println("sum of the array : " + sum);
		return sum;
	}
	public static int ProductOfArray(int array[]){
		int product =1;
		for(int i=0;i<array.length;i++){

			product = product* array[i];
		}
		System.out.println("product  of the array : " + product);
		return product;
	}
}
		