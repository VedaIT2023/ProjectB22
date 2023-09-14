import java.util.*;
public class HLnum{
	public static void main(String[] args){
	Scanner a = new Scanner(System.in);
	System.out.println("Enter no of Elements:");
	int num = a.nextInt();
	System.out.println("Enter the array Elements:");
	int array[] = new int[num];
	for(int i=0;i<num;i++){
		array[i] = a.nextInt();
}
	highNumber(array);
}
	public static void highNumber(int[] array){
	int temp;
	for(int i=0;i<=array.length;i++){
		for(int j=i+1;j<array.length;j++){
		if(array[i] > array[j]){
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;

}
}
}
	System.out.println("Highest Number is :" + array[array.length-1]);
	System.out.println("Lowest Number is :" + array[0]);
}
}