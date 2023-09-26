public class RemoveDuplicates{
	public static void main(String[] args){
	int numbers[] ={10,20,30,10,23,20,23};
	System.out.println("The numbers are:" );
	for(int i=0;i<numbers.length;i++){
	    for(int j=i+1;j<numbers.length;j++){
		if(numbers[i]!=numbers[j])
		System.out.println(numbers[j]);

}
}
}
}