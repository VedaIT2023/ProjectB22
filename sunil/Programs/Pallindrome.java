public class Pallindrome {
	public static void main (String[] args){
	int num = 12321;
	int r,sum=0;
	int duplicate = num;
	for(duplicate = num ; num>0 ;num=num/10){
	r=num%10;
	sum=(sum*10)+r;

}
	if(duplicate==sum){
	System.out.println("Number is a Pallindrome");
}else{
	System.out.println("Number is not a Pallindrome");	
	}

}
}