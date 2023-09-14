import java.util.*;
public class Dupname{
	public static void main(String[] args){
	Scanner rc = new Scanner(System.in);
	System.out.println("Enter the String  :");
	String name = rc.nextLine();

	char[] array = name.toCharArray();
	dupName(array);
}
	public static void dupName(char[] array){
		int add = 0;
		for(int i=0;i<array.length;i++){
			int count = 1;
			if(array[i]!=0){
			for(int j=i+1;j<array.length;j++){
			if(array[i] == array[j]){
			count++;
			array[j] = 0;	
				}	
			}
		}
		if(count>1){
		System.out.println("Duplicate letter is :" + array[i]+" " + count);
		add = add+count;
			}
		
		}
		System.out.println("Total Number of Duplicate Letters are:" +add);
	}
}