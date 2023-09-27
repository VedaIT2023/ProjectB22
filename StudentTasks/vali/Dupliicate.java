import java.util.*;
public class FunctionDuplicates{
	public static void main(String[] args){

	Scanner input=new Scanner(System.in);
	System.out.println("Enter the Name :");
	String name=input.nextLine();
	char[] Array = name.toCharArray();
	duplicatecharecters(Array);
}
      public static void duplicatecharecters(char[] Array){
      
     		int count=0;
      for(int i=0;i<Array.length;i++){

         for(int j=i+1;j<Array.length;j++) {
            if (Array[i]==Array[j]) {
               System.out.println("Duplicate elements are :" + Array[j] );
		count++;
               break;
      }

      }
      }	
      System.out.println("Duplicate Count in string are: " +count);
}
}