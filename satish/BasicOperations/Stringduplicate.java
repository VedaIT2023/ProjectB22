import java.util.*;
public class stringDuplicate {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Name:");
	String str = sc.nextLine();
	

	duplicateString(str);
	}
	public static void duplicateString(String ch) {
	char[] letter = ch.toCharArray();		

	int add = 0;
	for(int i=0;i<letter.length;i++) {
		int count=1;
		if(letter[i]!=0) {
		for(int j=i+1;j<letter.length;j++){
			if(letter[i] == letter[j]){
				count++;
				letter[j] = 0;
					}
				}
			}
			if(count>1){
			System.out.println("Number of Duplicate Letters is :"+letter[i]+ " " +count);
			add = add+count; 
			}
		
		}
		System.out.println("Total number of Duplicate Letters are :" + add);
	}
}