public class Max {
	public static void main(String[] args){
	int[] a = {5,2,1,6,4,7};
	int max = a[0];
	int min = a[0];
	for(int i=0 ; i<a.length ; i++){
	if(max<a[i]){
	max = a[i];

}
}
	for(int i=0 ; i<a.length ; i++){
	if(min>a[i])
	min=a[i];
}
	System.out.println("Maximum number is " +max);
	System.out.println("Minimum number is " +min);
	
}
} 