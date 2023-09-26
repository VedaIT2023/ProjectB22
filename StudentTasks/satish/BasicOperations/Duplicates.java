public class Duplicates{
	public static void main(String[] args){
	int numbers[] ={1,23,22,44,77,77,23,55,44};
	System.out.println("Duplicate numbers are:" );
	for(int i=0;i<numbers.length;i++){
	    for(int j=i+1;j<numbers.length;j++){
		if(numbers[i]==numbers[j])
		System.out.println(numbers[j]);

}
}
}
}