public class PrimeNumbers {
	public static void main(String[] args){
	System.out.println("Pime numbers are");
		for(int i=2;i<100;i++){
		int count=0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
				count=1;
				break;
				}
			}
			if(count==0){
			System.out.println(i + " ");
			}
		}
	}
}