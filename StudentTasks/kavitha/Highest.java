import java.util.Scanner;
public class Highest{

  public static void main(String[] args) {
	 int highest = mySampleHeightNumber();
        System.out.println("Highest number is " + highest);
    

}
	public static int mySampleHeightNumber(){
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the size of an array");
     int n = in.nextInt();

     int arr[] = new int[n];

     System.out.println("Enter an array elements");

     for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
     }

     
    int highest=arr[0];

     for (int i = 0; i < n; i++) {
      
       if (arr[i] > highest) {
          highest = arr[i];
	
       }
    }

     return highest;
   }

}