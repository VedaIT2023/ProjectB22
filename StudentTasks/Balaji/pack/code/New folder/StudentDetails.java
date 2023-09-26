package com.pack.code;

import java.util.HashMap;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Name of the Student: ");
		String name = scanner.nextLine().toLowerCase();
		
		HashMap <String, Student> details = new HashMap();
		details.put("sunanda", new Student("Sunanda", 21, 'F', "sunanda23@gmail.com", "9133456734", "Java Full Stack"));
		details.put("sindhu", new Student("Sindhu", 21, 'F', "sindhu123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("kavitha", new Student("Kavitha", 21, 'F', "kavitha123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("chandini", new Student("Chandini", 21, 'F', "chandini123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("satya", new Student("Satya", 21, 'F', "satya123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("balaji", new Student("Balaji", 21, 'M', "balaji123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("satwik", new Student("Satwik", 21, 'M', "satwik123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("satish", new Student("Satish", 21, 'M', "satish123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("pavan", new Student("Pavan", 21, 'M', "pavan123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("lakshman", new Student("Lakshman", 21, 'M', "lakshman123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("valli", new Student("Valli", 21, 'M', "valli123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("raki", new Student("Raki", 21, 'M', "raki123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("divakar", new Student("Divakar", 21, 'M', "divakar123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("sunil", new Student("Sunil", 21, 'M', "sunil123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("siddu", new Student("Siddu", 21, 'M', "siddu123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("kalyan", new Student("Kalyan", 21, 'M', "kalyan123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("ramakrishna", new Student("Ramakrishna", 21, 'M', "ramakrishna123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("sundeep", new Student("Sundeep", 21, 'M', "sundeep123@gmail.com", "9133456734", "Java Full Stack"));
		details.put("mani", new Student("Mani", 21, 'M', "mani123@gmail.com", "9133456734", "Java Full Stack"));
		
		System.out.println("\nStudent Details");
		Student detail = details.get(name);
		if(detail!=null) {
			System.out.println(details.get(name).toString());
		}
		
	}

}
