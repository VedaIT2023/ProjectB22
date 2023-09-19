import java.util.Scanner; 

public class Tables{
	public static void main(String[] args){
	
	Scanner readInput = new Scanner(System.in);

	System.out.println("Enter any number");
	int a = readInput.nextInt();

	System.out.println("table is ");
	int b = readInput.nextInt();

	for(int i=1;i<=b;i++){

	System.out.println(a + "*" + i + "=" + (a*i));
}
	
}

}