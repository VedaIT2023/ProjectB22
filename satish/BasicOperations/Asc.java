import java.util.*;
public class Asc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int i, j, temp;
        System.out.println("Please Enter 5 elements in the Array");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Increasing Order:-");
        for (j = 0; j < 5; j++) {
            System.out.println(a[j]);
        }
        for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Decreasing Order:-");
        for (j = 0; j < 5; j++) {
            System.out.println(a[j]);
        }
    }
}