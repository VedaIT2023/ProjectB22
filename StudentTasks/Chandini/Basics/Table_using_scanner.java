import java.util.Scanner;
public class Table_using_scanner{
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter a number to print its table:");
   int table=sc.nextInt();
   System.out.print("Enter upto a number:");
   int n=sc.nextInt();
   for(int i=1;i<=n;i++){
      System.out.println(table+"*"+i+"="+table*i);
     }
}


}