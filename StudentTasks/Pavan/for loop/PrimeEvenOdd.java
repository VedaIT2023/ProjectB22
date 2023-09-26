public class PrimeEvenOdd{
	public static void main(String[] args){
	int n=100;
	System.out.println("Even Numbers are:");
	for(int i=1;i<=100;i++){
		if(i%2==0){
			System.out.println(i);
		}
	}
	System.out.println("Odd Numbers are:");	
	for(int i=1;i<100;i++){
		if(i%2!=0){
			System.out.println(i);
		}	
	}
	System.out.println("Prime Numbers are:");
	for(int i=1;i<=100;i++){
		int count=0;
		for(int j=1;j<=i;j++){
			if(i%j==0){
			count++;
			}
		}
	if(count == 2){
		System.out.println(i);
		}
	}
}
}
