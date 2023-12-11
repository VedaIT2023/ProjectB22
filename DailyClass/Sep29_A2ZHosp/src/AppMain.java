
import java.util.ArrayList;
import java.util.Scanner;

public class AppMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList();
		
		System.out.println("This is a sample program" + names.get(0));

		
		HospitalHelper.displayDoctorsList();
		HospitalHelper.createDoctors();
		showOptions();
	}
	
	
	public static void showOptions() {
		System.out.println("Choose an option to proceed\n");
		System.out.println("1.Book an appointment");
		System.out.println("2.Delete an appointment");
		System.out.println("3.View appointment");
		int option = 0;
		while(option<=0) {
			try {
				option = sc.nextInt();
				switch(option) {
				case 1:
					bookAnAppointement();
					break;
				case 2:
					deleteAnAppointement();
					break;
				case 3:
					viewAllAppointements();
					break;
					
				default:
					System.out.println("Pleas enter a valid option");
					showOptions();
					break;
					
				}
			}catch(Exception e) {
				String err = sc.nextLine();
				System.out.println("Please enter a valid input\n");

			}
		}		
	}
	
	public static void bookAnAppointement() {
		System.out.println("Appointment Booked\n");
		showOptions();
	}
	
	public static void deleteAnAppointement() {
		System.out.println("Appointment Deleted\n");
		showOptions();
	}

	public static void viewAllAppointements() {	
		System.out.println("Appointment List\n");
		showOptions();
	}
}
