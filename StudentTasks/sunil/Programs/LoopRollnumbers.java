
public class LoopRollnumbers{

	public static void main(String[] args){

	int numbers[] = 	{34,49,56,7,33,7,18,45,84,9,62,23,7,5,8,3,2,30,107,3};

	System.out.print("Even numbers are:");
	for(int i=0;i<numbers.length; i++){

	if(numbers[i]%2==0){
	System.out.print(numbers[i]+" ");
	}
}
	System.out.println();
	System.out.print("Odd numbers are:");
	for(int i=0;i<numbers.length; i++){

	if(numbers[i]%2!=0){
	System.out.print(numbers[i]+" ");
	}
}	


}

}