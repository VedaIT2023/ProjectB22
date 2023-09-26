package functions;
import java.util.*;
public class Sum {
    public static int sumofnum(int arr[],int n){
        int s=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
        }
        return s;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array :");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter array elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Sum of integer arrays :"+sumofnum(arr,n));
    }
}
