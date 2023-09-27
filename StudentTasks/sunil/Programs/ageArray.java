import java.util.Scanner;

public class AgeInMonths{
	public static void main(String[] args){
	ageInMonths();
}

	public static int ageInMonths(int years, int months){
	Scanner sc = new Scanner(System.in)
	int n;
	System.out.println("Number Of Persons Age is :");
	n=sc.nextint();
	years[] = new int [10];
	Systemm.out.println("Enter the  ages of Persons : ");
	for(int i=0 ; i<n ; i++){
	years[i]=sc.nextInt
	}
	months[] = new[10];
	for(int i=0;i<years.length ; i++){
	months[i]=years[i]*24
	}
	for(int i=0;i<months.length;i++){
	System.out.println("Age in months is");
	System.out.println(months[i]);
	}
	return months;

	
}
}