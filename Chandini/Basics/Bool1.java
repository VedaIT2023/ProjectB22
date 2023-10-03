package functions;

import java.util.Scanner;

public class Bool1 {
    static int s=0;
    static String ans="";
    public static String num(int arr[],int n,boolean b,boolean p){
        if(b){
        for(int i=0;i<n;i++){
            s+=arr[i];
        } 
         ans="sum of numbers: "+s;  
    }
    if(p){
        s=1;
        for(int i=0;i<n;i++){
            s*=arr[i];
        }
       ans="Product of numbers: "+s; 
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
         System.out.print("For Addition(true/false) :");
         boolean b=sc.nextBoolean();
         System.out.print("For Product(true/false) :");
         boolean p=sc.nextBoolean();
        sc.close();
        System.out.println(num(arr,n,b,p));
    }

}
