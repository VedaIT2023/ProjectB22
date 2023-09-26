import java.util.*;
public class StudentBio{
    public static void main(String[] args){
System.out.println("Enter your Bio Details:");
Scanner sc1= new Scanner(System.in);
String s0;
int n;	
do {
	System.out.println("Please Enter Your Name:");
	
	s0 = sc1.nextLine();
	n = s0.length();
	}
while (n<=0);
Scanner sc2 = new Scanner(System.in);
String s1;
int a;	
do {
	System.out.println("Please Enter Your Email Id:");
	
	s1 = sc2.nextLine();
	a = s1.length();
}while (a<=0);
Scanner sc3 = new Scanner(System.in);
String s2;
int b;
do {
       System.out.println("Enter your Age:");
       s2 = sc3.nextLine();
       b = s2.length();
}while(b<=0);
Scanner sc4 = new Scanner(System.in);
String s3;
int c;
do {
       System.out.println("Enter the Phone Number:");
       s3 = sc4.nextLine();
       c = s3.length();
}while(c<=0);
Scanner sc5 = new Scanner(System.in);
String s4;
int d;
do {
       System.out.println("Gender:");
       s4=sc5.nextLine();
       d = s4.length();
}while(d<=0);
Scanner sc6 = new Scanner(System.in);
String s5;
int e;
do {
       System.out.println("Enter the Qualification:");
       s5= sc6.nextLine();
       e = s5.length();
}while(e<=0);
}
}