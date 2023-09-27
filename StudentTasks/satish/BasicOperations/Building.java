import java.util.*;
public class Building {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Floor Number:");
	int floorno = sc.nextInt();
	System.out.println("Enter a Room Number:");
	int roomno = sc.nextInt();
	for(int i=0;i<floorno;i++) {
		System.out.println("Floor NUmber:" + (i+1));
	for(int j=1;j<=roomno+i;j++){
			System.out.println("Room Number:"+ (100*(i+1)+j));
			}
	
		}
	}
}