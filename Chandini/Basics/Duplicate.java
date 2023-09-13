package functions;
import java.util.*;
public class Duplicate {
    public static void dup(String str){
        char []ch = new char[100];
        String s="";
        for(int i=0;i<str.length();i++){
            int cnt=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    cnt+=1;
                }
            }
            int z=0;
            if(cnt!=1){
            int c=0;
                for(int j=0;j<ch.length;j++){
                    if(str.charAt(i)==ch[j]){
                        c++;
                    }
                }
                if(c==0){
                System.out.println(str.charAt(i) + ":" + cnt);}
            
            ch[z]=str.charAt(i);
            z++;
            }
            else{
                int c=0;
                for(int j=0;j<ch.length;j++){
                    if(str.charAt(i)==ch[j]){
                        c++;
                    }
                }
                if(c==0){
                s+=str.charAt(i);}
            }
            
        }
       System.out.println("String with out repeated characters :"+ s);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String str= sc.nextLine();
        sc.close();
        dup(str);
    }
}
