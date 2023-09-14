import java.util.Scanner;
public class ArrayProduct {
    public static int calculateProduct(int[] arr) {
        int Product = 1;
        for (int num : arr) {
            Product *= num;
        }
        return Product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int Product = calculateProduct(array);
        System.out.println("Product of array: " + Product);

        scanner.close();
    }
}