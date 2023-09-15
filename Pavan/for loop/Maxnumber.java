public class Maxnumber{
	public static void main(String[] args){
	int num[] = {1,23,3,4,5,6,7,8,9,10};
	int temp;
	for(int i=0;i<=num.length-1;i++){
	for(int j=i+1;j<num.length;j++){
		if(num[i] > num[j]){
		temp = num[i];
		num[i] = num[j];
		num[j] = temp;
		}
	}
}
		System.out.println("Max Number is:"  + num[num.length-1]);
		System.out.println("Max Number is:"  + num[num.length-2]);
}
}