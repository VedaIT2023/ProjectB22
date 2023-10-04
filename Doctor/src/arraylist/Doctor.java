package arraylist;
import java.util.ArrayList;

public class Doctor {
    String name, specialisation, timings, id, age;

    static ArrayList<Doctor> doctorList;

    Doctor(String name, String specialisation, String timings, String id, String age) {
        this.name = name;
        this.specialisation = specialisation;
        this.timings = timings;
        this.id = id;
        this.age = age;
    }

    public void displayDoctorInfo() {
        System.out.println("Name of the Doctor: " + name);
        System.out.println("ID No: " + id);
        System.out.println("Specialisation: " + specialisation);
        System.out.println("Timings: " + timings);
        System.out.println("Age: " + age);
    }

    public static void doctorDetails() {
        doctorList = new ArrayList<>();

        doctorList.add(new Doctor("Sathwik", "Cardiologist", "11AM to 3PM", "11", "22"));
        doctorList.add(new Doctor("Balaji", "Neurologist", "9AM to 12PM", "12", "23"));
        doctorList.add(new Doctor("Satish", "Kidney Specialist", "10AM to 2PM", "13", "22"));
        doctorList.add(new Doctor("Lakshman", "Liver Specialist", "4PM to 8PM", "14", "22"));
        doctorList.add(new Doctor("Pavan", "Psychiatrist", "2PM to 5PM", "15", "21"));
        doctorList.add(new Doctor("Kalyan", "Radiologist", "5PM to 9PM", "16", "22"));
        doctorList.add(new Doctor("Dileep", "Neurologist", "3PM to 6PM", "17", "23"));
        doctorList.add(new Doctor("Tejaswini", "Dermatologist", "10AM to 4PM", "18", "23"));
        doctorList.add(new Doctor("SaiLakshmi", "Oncologist", "4PM to 9PM", "19", "23"));
        doctorList.add(new Doctor("Prasanthi", "Neurologist", "6PM to 10PM", "20", "24"));

        for (int i = 0; i < doctorList.size(); i++) {
            Doctor doctors = doctorList.get(i);
            doctors.displayDoctorInfo();
            System.out.println("");
        }

    }
    public String getId() {
        return id;
    }
}

