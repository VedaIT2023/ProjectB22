package com.OOPS.polymorphism;
import java.util.*;

public class StudentData {

public static void main(String[] args) {
			
	HashMap<String,Studentinfo> students = new HashMap();
			
		students.put("pavan", new Studentinfo("Pavan", "2345", "pavan@gmail.com", "FS Java", 22, 'M'));
	    students.put("lakshman", new Studentinfo("Lakshman", "5678", "lakshman@gmail.com", "FS Java", 22, 'M'));
		students.put("satish", new Studentinfo("Satish", "9012", "satish@gmail.com", "FS Java", 23, 'M'));
		students.put("balaji", new Studentinfo("Balaji", "3456", "balaji@gmail.com", "FS Java", 22, 'M'));
		students.put("satwik", new Studentinfo("satwik", "8347", "satwik@gmail.com", "FS Java", 23, 'M'));
		students.put("kalyan", new Studentinfo("Kalyan", "2309", "kalyan@gmail.com", "FS Java", 22, 'M'));
		students.put("narendra", new Studentinfo("Narendra", "9584", "narendra@gmail.com", "FS Java", 23, 'M'));
	    students.put("valli", new Studentinfo("Valli", "0494", "valli@gmail.com", "FS Java", 22, 'M'));
		students.put("sunil", new Studentinfo("Sunil", "9484", "sunil@gmail.com", "FS Java", 23, 'M'));
		students.put("sandeep", new Studentinfo("Sandeep", "1254", "sandeep@gmail.com", "FS Java", 22, 'M'));
		students.put("siddu", new Studentinfo("Siddu", "0495", "siddu@gmail.com", "FS Java", 23, 'M'));
		students.put("ramakrishna", new Studentinfo("RamaKrishna", "4095", "krishna@gmail.com", "FS Java", 22, 'M'));
		students.put("mani", new Studentinfo("Mani", "9356", "mani@gmail.com", "FS Java", 23, 'M'));
		students.put("divakar", new Studentinfo("Divakar", "4958", "divakar@gmail.com", "FS Java", 22, 'M'));
		students.put("chandini", new Studentinfo("Chandini", "4522", "chandini@gmail.com", "FS Java", 23, 'F'));
		students.put("sindhu", new Studentinfo("Sindhu", "7575", "sindhu@gmail.com", "FS Java", 22, 'F'));
	    students.put("satya", new Studentinfo("Satya", "4545", "satya@gmail.com", "FS Java", 23, 'F'));
		students.put("kavitha", new Studentinfo("Kavitha", "5342", "kavitha@gmail.com", "FS Java", 22, 'F'));
		students.put("sunanda", new Studentinfo("Sunanda", "2346", "sunanda@gmail.com", "FS Java", 23, 'F'));
		
		Scanner lucky = new Scanner(System.in);
		System.out.println("Enter the Student Name :");
		String input = lucky.nextLine().toLowerCase();
		Studentinfo student = students.get(input);
				
		if(student != null) {
		   System.out.println(student.details());
					}
		}

	}


