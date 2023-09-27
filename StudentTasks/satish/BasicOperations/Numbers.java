import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Required Integers size:");
        int size = sc.nextInt();
        int myArray[] = new int[size];
        
        System.out.println("Enter the Array Elements One By One:");
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        
        int result = sumOfIntegers(myArray);
        System.out.println("Sum of array elements: " + result);
		
		System.out.println("Enter the Required Integers size:");
        int size1 = sc.nextInt();
        int myArray1[] = new int[size1];
        
        System.out.println("Enter the Array Elements One By One:");
        for (int i = 0; i < size1; i++) {
            myArray1[i] = sc.nextInt();
        }
		int result1 = mulOfIntegers(myArray1);
		System.out.println("Mul of array elements: " + result1);
    }

    public static int sumOfIntegers(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return sum;
    }
	 public static int mulOfIntegers(int[] myArray1) {
        int mul = 1;
        for (int i = 0; i < myArray1.length; i++) {
			
            mul = mul * myArray1[i];
        }
        return mul;
    }
}
