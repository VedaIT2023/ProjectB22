package functions;
import java.util.*; 
class YearsToAge {
    public static void convert(){
    Scanner ssc = new Scanner(System.in);
    System.out.print("Enter age in years :");
    int age=ssc.nextInt();
    ssc.close();
     System.out.println("After converting Age into months : "+age*12);
    }
    public static void main(String args[]){
    convert();
    }
}

