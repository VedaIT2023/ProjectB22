package com.details.application;
import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        AppointmentManager manager = new AppointmentManager();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Book Appointment");
            System.out.println("2. Delete Appointment");
            System.out.println("3. List Appointments");
            System.out.println("4. List Patients");
            System.out.println("5. List Doctors");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
            case 1:
                System.out.print("Enter patient name: ");
                String patientName = scanner.nextLine();
                System.out.print("Enter patient ID: ");
                int patientId = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                System.out.print("Enter doctor name: ");
                String doctorName = scanner.nextLine();
                System.out.print("Enter doctor ID: ");
                int doctorId = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                System.out.print("Enter doctor specialization: ");
                String specialization = scanner.nextLine();
                System.out.print("Enter appointment date: ");
                String date = scanner.nextLine();
                Patients patient = new Patients(patientName, patientId);
                Doctors doctor = new Doctors(doctorName, doctorId, specialization);
                manager.bookAppointment(patient, doctor, date);
                break;
            case 2:
                System.out.print("Enter the index of the appointment to delete: ");
                int index = scanner.nextInt();
                manager.deleteAppointment(index);
                break;
            case 3:
                manager.listAppointments();
                break;
            case 4:
                manager.listPatients();
                break;
            case 5:
                manager.listDoctors();
                break;
            case 6:
                System.out.println("Exitingg..");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

	}

}
