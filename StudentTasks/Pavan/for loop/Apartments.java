import java.util.*;
public class Apartments{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter No Of Floors : ");
	int floors = sc.nextInt();
	System.out.println("    Enter No Of Rooms : ");
	int rooms = sc.nextInt();


	for(int i=0;i<floors;i++){
		System.out.println("Floor No : " + (i+1));

	
		for(int j=1;j<=rooms+i;j++){
			System.out.println("    Room No : " + (100*(i+1) + j));
		}
	}
}
}