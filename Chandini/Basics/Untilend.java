package functions;
import java.util.*; 
public class Untilend {
    public static void convert(){
    Scanner ssc = new Scanner(System.in);
    System.out.print("Enter age in years :");
    int age=ssc.nextInt();
     System.out.println("After converting Age into months : "+age*12);
    }
    public static void main(String args[]){
    while(true){
    System.out.println("Enter 0 to exit ");
    System.out.println("Enter 1 for can converting age in years to months ");
    System.out.print("Enter number: ");
    Scanner ssc = new Scanner(System.in);
    int num=ssc.nextInt();
    if(num==0){
        ssc.close();
        break;
    }
    else{
        convert();
    }
    }
    }
}


