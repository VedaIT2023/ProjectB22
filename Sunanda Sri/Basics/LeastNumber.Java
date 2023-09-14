import java.util.Scanner;

public class LeastValue {
    public static int LeastValue(int[] numbers) {
        int leastValue = Integer.MAX_VALUE;

        for (int num : numbers) {
            leastValue = Math.min(leastValue, num);
        }

        return leastValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int leastValue = LeastValue(numbers);
        System.out.println("Least value: " + leastValue);

        scanner.close();
    }
}
