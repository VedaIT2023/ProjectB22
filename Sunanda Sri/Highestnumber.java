import java.util.Scanner;

public class HighestValue {
    public static int HighestValue(int[] numbers) {
        int highestValue = Integer.MIN_VALUE;

        for (int num : numbers) {
            highestValue = Math.max(highestValue, num);
        }

        return highestValue;
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

        int highestValue = HighestValue(numbers);
        System.out.println("Highest value: " + highestValue);

    
    }
}

