import java.util.Scanner;
public class Table{
    public static void main(String[] args){
    System.out.println("Enter the number");
    Scanner number = new Scanner(System.in);
    int Number = number.nextInt();
    System.out.println("Enter the number1");
    Scanner number1 = new Scanner(System.in);
    int Number2 = number1.nextInt();
       for(int i=1;i<=Number2;i++){
	   System.out.println(Number + " * " + i + " = "  + (Number*i));
}
}
}
 