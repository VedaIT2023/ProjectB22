package functions;
import java.util.*;
public class HighestAndLowest {
    public static int highlowfun(int[] a,int n,int choice){
        int ans=0;
        if(choice==1){
        for(int i=0;i<n;i++){
            if(a[i]>ans){
                ans=a[i];
            }
        }
    }
    else if(choice==2){
       for(int i=0;i<n;i++){
            if(a[i]<ans){
                ans=a[i];
            }
        } 
    }
    return ans;

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
        System.out.println("1.Press 1 for highest num");
        System.out.println("2.Press 2 for lowest num");
        System.out.print("Enter your choice :");
        int choice=sc.nextInt();
        sc.close();
        if(choice==1){
            System.out.println("Highest number in the array is:- " + highlowfun(arr,n,choice));
        }
        else{
            System.out.println("Lowest number in the array is:- " + highlowfun(arr,n,choice));
        }
    }
}
