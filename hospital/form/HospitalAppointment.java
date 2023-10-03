package com.hospital.form;

import java.util.*;

public class HospitalAppointment {

    public static void main(String[] args) {

        AllDetails doctor = new AllDetails();
        

        List<DoctorsDetails> doctorList = new ArrayList<>(doctor.doctors.values());

        System.out.println("These are the doctors in this Hospital\n");
        for(int i = 0; i < doctorList.size(); i++) {
            System.out.println("Doctor.Id:"+(i+1)+"\nName: "+doctorList.get(i).name);
            System.out.println("Specialization: "+doctorList.get(i).specialization+"\n");
        }

        Random random = new Random();
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);

        String drname = "";
        String dayp = "";
        String timep = "";
        String amOrPm = "";
        boolean doctorFound = false;
        List<CommonProperties> patients = new ArrayList<>(); // Initialize outside the loop

        while (true) {
            System.out.println("Enter the name of the doctor: ");
            String nameDr = scanner.next();

            for (int i = 0; i < doctorList.size(); i++) {

                if (nameDr.equalsIgnoreCase(doctorList.get(i).name)) {

                    drname = doctorList.get(i).name;
                    dayp = daysOfWeek[random.nextInt(7)];
                    int hour = random.nextInt(8) + 9;
                    amOrPm = (hour < 12) ? "AM" : "PM";
                    hour = (hour <= 12) ? hour : hour - 12;

                    int minute = random.nextInt(60);
                    timep = String.format("%d:%02d %s", hour, minute, amOrPm);

                    System.out.println("\n" + doctorList.get(i).details());
                    doctorFound = true;
                    break;
                }
            }

            if (!doctorFound) {
                System.out.println(nameDr + " Doctor not found");

            } else {
                while (true) {
                    System.out.println("Do you want to book the Appointment for " + drname + " type yes or no");
                    String ap = scanner.next().toLowerCase();

                    while (!ap.equals("yes") && !ap.equals("no")) {
                        System.out.println("Please enter 'yes' or 'no'.");
                        ap = scanner.next().toLowerCase();
                    }

                    if (ap.equals("yes")) {
                        System.out.println("Enter your Name: ");
                        String namep = scanner.next();

                        System.out.println("Enter your age: ");
                        int agep = scanner.nextInt();

                        scanner.nextLine();
                        System.out.println("Enter your Gender (M/F): ");
                        char genderp = scanner.next().charAt(0);

                        System.out.println("To Confirm the Appointment type yes or no :");
                        String apoint = scanner.next().toLowerCase();
                        while (!apoint.equals("yes") && !apoint.equals("no")) {
                            System.out.println("Please enter 'yes' or 'no'.");
                            apoint = scanner.next().toLowerCase();
                        }

                        if (apoint.equals("yes")) {
                            System.out.println("You book the Appointment with " + drname);
                            System.out.println("Day: " + dayp);
                            System.out.println("Time: " + timep);
                            System.out.println("Patient Name: " + namep);
                            System.out.println("Age: " + agep);
                            System.out.println("Gender: " + genderp);

                            patients.add(new CommonProperties(namep, agep, genderp, dayp, timep));

                            while (true) {
                                System.out.println("Do you want to view the appointment type yes or no: ");
                                String view = scanner.next().toLowerCase();
                                while (!view.equals("yes") && !view.equals("no")) {
                                    System.out.println("Please enter 'yes' or 'no'.");
                                    view = scanner.next().toLowerCase();
                                }
                                if (view.equals("yes")) {
                                    for (CommonProperties patientDetails : patients) {
                                        System.out.println(patientDetails.details() + "\n");
                                    }
                                }
                                System.out.println("Do you want to cancel the appointment: ");
                                String cancel = scanner.next().toLowerCase();
                                while (!cancel.equals("yes") && !cancel.equals("no")) {
                                    System.out.println("Please enter 'yes' or 'no'.");
                                    cancel = scanner.next().toLowerCase();
                                }
                                if (cancel.equals("yes")) {

                                    System.out.println("Do you want to cancel the recent appointments Or clear the appointments type recent or clear: ");
                                    String delete = scanner.next().toLowerCase();
                                    while (!delete.equals("recent") && !delete.equals("clear")) {
                                        System.out.println("Please enter 'recent' or 'clear'.");
                                        delete = scanner.next().toLowerCase();
                                    }

                                    if (delete.equals("recent")) {

                                        if (patients.size() > 0) {
                                            patients.remove(patients.size() - 1);
                                            System.out.println("Do you want to view the appointment type yes or no: ");
                                            String look = scanner.next().toLowerCase();
                                            while (!look.equals("yes") && !look.equals("no")) {
                                                System.out.println("Please enter 'yes' or 'no'.");
                                                look = scanner.next().toLowerCase();
                                            }
                                            if (look.equals("yes"))
                                                if (patients.size() == 0) {
                                                    System.out.println("No appointments are booked");
                                                } else {
                                                    for (CommonProperties patientDetails : patients) {
                                                        System.out.println(patientDetails.details() + "\n");
                                                    }
                                                }
                                        }
                                    } else if (delete.equals("clear")) {
                                        patients.clear();
                                        System.out.println("All the appointments are cleared");
                                    }
                                } else if (cancel.equals("no")) {

                                }
                                System.out.println("Do you want to Select the doctor again type yes or no: ");
                                String exit = scanner.next().toLowerCase();
                                while (!exit.equals("yes") && !exit.equals("no")) {
                                    System.out.println("Please enter 'yes' or 'no'.");
                                    exit = scanner.next().toLowerCase();
                                }
                                if (exit.equals("no")) {
                                    System.out.println("Thank You! ");
                                    break;
                                } else if (exit.equals("yes")) {
                                    doctorFound = false;
                                    break;
                                } else {
                                    System.out.println("Please enter yes or no.");
                                }
                            }
                            break;
                        } else if (apoint.equals("no")) {
                            while (true) {
                                System.out.println("Do you want to Select the doctor again type yes or no: ");
                                String cancel = scanner.next().toLowerCase();
                                while (!cancel.equals("yes") && !cancel.equals("no")) {
                                    System.out.println("Please enter 'yes' or 'no'.");
                                    cancel = scanner.next().toLowerCase();
                                }
                                if (cancel.equals("no")) {
                                    System.out.println("Thank You!");
                                    break;
                                } else if (cancel.equals("yes")) {
                                    doctorFound = false;
                                    break;
                                } else {
                                    System.out.println("Please enter yes or no.");
                                }
                            }
                            break;
                        }
                    } else if (ap.equals("no")) {
                        System.out.println("Do you want to Re-Select the doctor yes or no: ");
                        String re = scanner.next();
                        while (!re.equals("yes") && !re.equals("no")) {
                            System.out.println("Please enter 'yes' or 'no'.");
                            re = scanner.next();
                        }
                        if (re.equals("yes")) {
                            doctorFound = false;
                            break;
                        } else {
                            System.out.println("Thank You");
                            break;
                        }
                    }
                }
            }
            if (doctorFound) {
                break;
            }
            System.out.print("Re-");
        }
    }
}
