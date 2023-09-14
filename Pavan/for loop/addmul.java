import java.util.*;
public class integers{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of elements :");
	int numbers = sc.nextInt();
	int array[] = new int[numbers]; 
	System.out.println("Enter the elements of the array for addition:");
	for(int i = 0;i<numbers;i++){
	 array[i] = sc.nextInt();
		
	}
	System.out.println("Enter the elements of the array for multliplication:");
	int array1[] = new int[numbers]; 
	for(int j = 0;j<numbers;j++){
	array1[j] = sc.nextInt();
		
	}
	int sum = sumOfNumbers(array, array1);

	}
	public static int sumOfNumbers(int[] array, int[] array1){
	int sum = 0;
	int mul = 1;
	for(int numbers : array){
	sum = sum + numbers;
	}
	for(int num : array1){
	mul = mul * num;
	}
	System.out.println("Addition of array: "+sum);
	System.out.println("Multiplication of array: "+mul);
	return sum &mul;
}
}