public class Duplicates{
	public static void main(String[] args){
	int numbers[] ={1,23,22,44,77,77,23,55,44};
	System.out.println("Duplicate numbers are:" );
	int i=0;
	while(i<numbers.length){
		int j = i +1;
		while(j<numbers.length){
			if(numbers[i]==numbers[j]){
				System.out.println(numbers[j]);
			}
			j++;
		}
		i++;
	}
}
}