public class Palindrome{
	public static void main(String[] args){;
	int n=565;
	int sum=0;
	int temp=n;
	while(n>0){
      int i=n%10;
	sum=(sum*10)+i;
	n=n/10;    
	}
      if(temp==sum){
        System.out.println("palindrome");
}else{
	  System.out.println("not palindrome");
}
	
	
}
}