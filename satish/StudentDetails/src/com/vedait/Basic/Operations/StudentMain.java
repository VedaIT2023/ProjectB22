package com.vedait.Basic.Operations;
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Name :");
		String name = sc.nextLine().toLowerCase();
		
		HashMap<String,Student> studentMap = new HashMap<>();
		Student student1 = new Student("Sunanda", "12345", "Bachelor's", "ECE", "6983811231", "Sunandha@gamil.com", 21, 'F');
		studentMap.put(student1.name.toLowerCase(), student1);
		Student student2 = new Student("Sindhu", "12732", "Bachelor's", "CSE", "9173718372", "sindu@gmail.com",21,'F');
		studentMap.put(student2.name.toLowerCase(), student2);
		Student student3 = new Student("Kavitha", "87214", "Bachelor's", "ECE", "9837837182", "kavitha@gmail.com",21,'F');
		studentMap.put(student3.name.toLowerCase(), student3);
		Student student4 = new Student("Chandini", "36726", "Bachelor's", "CSE", "937837729", "Chandini@gamil.com", 21, 'F');
		studentMap.put(student4.name.toLowerCase(), student4);
		Student student5 = new Student("Satya", "4787", "Bachelor's", "ECE", "8273872837", "Satya@gamil.com", 21, 'F');
		studentMap.put(student5.name.toLowerCase(), student5);
		Student student6 = new Student("Balaji", "23728", "Bachelor's", "ECE", "8886622007", "Balaji@gamil.com", 21, 'M');
		studentMap.put(student6.name.toLowerCase(), student6);
		Student student7 = new Student("Satish", "8347", "Bachelor's", "ECE", "7036156924", "satish@gamil.com", 21, 'M');
		studentMap.put(student7.name.toLowerCase(), student7);
		Student student8 = new Student("Lakshman", "84721", "Bachelor's", "ECE", "9839727322", "lucky@gamil.com", 21, 'M');
		studentMap.put(student8.name.toLowerCase(), student8);
		Student student9 = new Student("Pavan", "9274", "Bachelor's", "ECE", "8273872832", "pavan@gamil.com", 21, 'M');
		studentMap.put(student9.name.toLowerCase(), student9);
		Student student10 = new Student("Sathwik", "8721", "Bachelor's", "ECE", "927372738", "sathwik@gamil.com", 21, 'M');
		studentMap.put(student10.name.toLowerCase(), student10);
		Student student11 = new Student("Diwakar", "8748", "Bachelor's", "ECE", "892497272", "diwakar@gamil.com", 21, 'M');
		studentMap.put(student11.name.toLowerCase(), student11);
		Student student12 = new Student("Narendra", "94893", "Bachelor's", "CSE", "7787282732", "narendra@gamil.com", 21, 'M');
		studentMap.put(student12.name.toLowerCase(), student12);
		Student student13 = new Student("Valli", "8397", "Bachelor's", "ECE", "901803031", "valli@gamil.com", 21, 'M');
		studentMap.put(student13.name.toLowerCase(), student13);
		Student student14 = new Student("RamaKrishna", "64376", "Bachelor's", "ECE", "6301731973", "ramakrishna@gamil.com", 21, 'M');
		studentMap.put(student14.name.toLowerCase(), student14);
		Student student15 = new Student("Kalyan", "9874", "Bachelor's", "ECE", "6764726262", "kalyan@gamil.com", 21, 'M');
		studentMap.put(student15.name.toLowerCase(), student15);
		Student student16 = new Student("Mani", "6436", "Bachelor's", "ECE", "982372742", "mani@gamil.com", 21, 'M');
		studentMap.put(student16.name.toLowerCase(), student16);
		Student student17 = new Student("Sunil", "74835", "Bachelor's", "ECE", "6437138378", "sunil@gamil.com", 21, 'M');
		studentMap.put(student17.name.toLowerCase(), student17);
		Student student18 = new Student("Sidhu", "83893", "Bachelor's", "ECE", "927827227", "sidhu@gamil.com", 21, 'M');
		studentMap.put(student18.name.toLowerCase(), student18);
		Student student19 = new Student("Deepika", "93435", "Bachelor's", "ECE", "789824982", "deepika@gamil.com", 21, 'F');
		studentMap.put(student19.name.toLowerCase(), student19);
	
		Student candidate = studentMap.get(name);
        
        if (candidate != null) {
            System.out.println("Student Found:");
            System.out.println(candidate.StudentDetails());
        } else {
            System.out.println("Student with name '" + name + "' not found.");
        }
	
   		
	}
}
