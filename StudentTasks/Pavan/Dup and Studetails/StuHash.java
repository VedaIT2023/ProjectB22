package com.vedait.dup.stuhash;
import java.util.*;
public class StuHash {

	public static void main(String[] args) {
		
		HashMap<String,StudentDetails> students = new HashMap();
		
			students.put("pavan", new StudentDetails("Pavan", "2345", "pavan@gmail.com", "FS Java", 22, 'M'));
	        students.put("lakshman", new StudentDetails("Lakshman", "5678", "lakshman@gmail.com", "FS Java", 22, 'M'));
	        students.put("satish", new StudentDetails("Satish", "9012", "satish@gmail.com", "FS Java", 23, 'M'));
	        students.put("balaji", new StudentDetails("Balaji", "3456", "balaji@gmail.com", "FS Java", 22, 'M'));
			students.put("satwik", new StudentDetails("satwik", "8347", "satwik@gmail.com", "FS Java", 23, 'M'));
			students.put("kalyan", new StudentDetails("Kalyan", "2309", "kalyan@gmail.com", "FS Java", 22, 'M'));
			students.put("narendra", new StudentDetails("Narendra", "9584", "narendra@gmail.com", "FS Java", 23, 'M'));
			students.put("valli", new StudentDetails("Valli", "0494", "valli@gmail.com", "FS Java", 22, 'M'));
			students.put("sunil", new StudentDetails("Sunil", "9484", "sunil@gmail.com", "FS Java", 23, 'M'));
			students.put("sandeep", new StudentDetails("Sandeep", "1254", "sandeep@gmail.com", "FS Java", 22, 'M'));
			students.put("siddu", new StudentDetails("Siddu", "0495", "siddu@gmail.com", "FS Java", 23, 'M'));
			students.put("ramakrishna", new StudentDetails("RamaKrishna", "4095", "krishna@gmail.com", "FS Java", 22, 'M'));
			students.put("mani", new StudentDetails("Mani", "9356", "mani@gmail.com", "FS Java", 23, 'M'));
			students.put("divakar", new StudentDetails("Divakar", "4958", "divakar@gmail.com", "FS Java", 22, 'M'));
			students.put("chandini", new StudentDetails("Chandini", "4522", "chandini@gmail.com", "FS Java", 23, 'F'));
			students.put("sindhu", new StudentDetails("Sindhu", "7575", "sindhu@gmail.com", "FS Java", 22, 'F'));
			students.put("satya", new StudentDetails("Satya", "4545", "satya@gmail.com", "FS Java", 23, 'F'));
			students.put("kavitha", new StudentDetails("Kavitha", "5342", "kavitha@gmail.com", "FS Java", 22, 'F'));
			students.put("sunanda", new StudentDetails("Sunanda", "2346", "sunanda@gmail.com", "FS Java", 23, 'F'));

			System.out.println("Total No of Students :" + students.size() + "\n");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Student Name :");
			String input = sc.nextLine().toLowerCase();
			StudentDetails stu = students.get(input);
			
			if(stu!=null) {
				System.out.println(stu.details());
				}
	}
}
