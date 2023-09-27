import java.util.Scanner;
public class FindDuplicates{
  public static void main(String[] args){
    int i,j,count=0;
    boolean isduplicate=false;
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();

    for(i=0;i<name.length();i++){
       
      for(j=i+1;j<name.length();j++){
        if(name.charAt(i)==name.charAt(j)){
         isduplicate=true;
         count++; 
         }   

       if(isduplicate){
       System.out.println("Duplicate letter:"+name.charAt(i));
       }
      isduplicate=false;
      
}
}
     System.out.println("Duplicates count:"+count);


}
}