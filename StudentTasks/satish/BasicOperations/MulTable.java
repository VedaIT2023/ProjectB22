import java.util.*;
public class MulTable{
    public static void main(String[] args){
System.out.println("Enter a number:");
Scanner sc1 = new Scanner(System.in);
int num=sc1.nextInt();
System.out.println("Enter a number:");
Scanner sc2 = new Scanner(System.in);
int j =sc2.nextInt();
for(int i=1;i<=j;i++){
System.out.println(num+"*"+i+"="+(num*i));
}
}
}
