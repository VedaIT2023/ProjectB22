import java.util.*;

public class MaximumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements:");
        int n = sc.nextInt();
        int num[] = new int[n];
        
        System.out.println("Enter the Numbers:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        
        highestNum(max);
        lowestNum(min);
    }

    public static void highestNum(int max) {
        System.out.println("Maximum Number is: " + max);
    }
    
    public static void lowestNum(int min) {
        System.out.println("Minimum Number is: " + min);
    }
}
