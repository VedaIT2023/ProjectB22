public class Pallindrome{
	public static void main(String[] args){
	int n=323;	
	int duplicate=n;
	int r=0, sum=0;

		for(n=323;n>0;n=n/10){
		r=n%10;
	sum=(sum*10)+r;
}
	if(duplicate==sum){
	System.out.println("it is a Pallindrome");
}else{
	System.out.println("it is not a Pallindrome");
		}
	}
}