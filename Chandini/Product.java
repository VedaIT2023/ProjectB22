package functions;
import java.util.*;
public class Product {
    public static int prodofnum(){
        int s=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array :");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter array elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++){
            s*=arr[i];
        }
        return s;
    }
    public static void main(String args[]){
        System.out.println("Product of integer arrays :"+prodofnum());
    }
}

