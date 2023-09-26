import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String p="";
        for(int i=num.length()-1;i>=0;i--){
            p+=num.charAt(i);
        }
        if(num.equals(p)){
            System.out.println(p + " is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }


    }
}
