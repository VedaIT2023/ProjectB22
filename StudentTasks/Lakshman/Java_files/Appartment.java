import java.util.*;
public class Appartment{
	public static void main(String[] args){
	Scanner A=new Scanner(System.in);
	System.out.println("Enter No.Of Floors :");
	int Floors=A.nextInt();
	int rooms[] = new int[Floors];
	for(int i=0;i<Floors;i++){
	System.out.println("Enter No.of Rooms in Floor No: "+(i+1));
	rooms[i] =A.nextInt();
	System.out.println("Floor No :"+ (i+1));
	  for(int j=1;j<=rooms[i];j++){
             System.out.println("Room No :" + (100*(i+1)+j));
	
		}
	}

}
}