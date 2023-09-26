package com.vedait.studentdetails.arraylist;

import java.util.ArrayList;

public class ApplicationMain {

	public static void main(String[] args) {
		
		String name[] = {"Pavan", "Balaji", "Chandini", "Divakar", "Kavitha", "Lakshman", "Mani", "Narendra", "Rama Krishna", "Sandeep",
				"Satish", "Satwik", "Satya", "Siddu", "Sindhu", "Sunanda", "Sunil", "Valli", "Kalyan"};
		
		String email[] = {"Pavan@gamil.com", "Balaji@gamil.com", "Chandini@gamil.com", "Divakar@gamil.com", "Kavitha@gamil.com", "Lakshman@gamil.com", "Mani@gamil.com", "Narendra@gamil.com", "Rama Krishna@gamil.com", "Sandeep@gamil.com",
				"Satish@gamil.com", "Satwik@gamil.com", "Satya@gamil.com", "Siddu@gamil.com","Sunanda@gamil.com", "Sindhu@gamil.com",  "Sunil@gamil.com", "Valli@gamil.com", "Kalyan@gamil.com"};

		String phno[] = {"934576802","93457695342","844576802","854576802","934533802","9243336802","9932483108","864576802","934545802","934572302","884576802","934546802","9343456802",
				"774576802","734576802","934434302","9340954802","9393485902","9309258302"};
		
		int age[] = {22,21,21,21,22,21,22,22,21,21,22,21,22,21,21,21,22,22,21};
		
		char gender[]= {'M','M','F','M','F','M','M','M','M','M','M','M','F','M','F','F','M','M','M'};
		
		int idno [] = {1215,1201,1203,1202,1205,1206,1204,1208,1209,1207,1210,1212,1211,1213,1216,1214,1217,1219,1218};
		
		ArrayList<Students>stu = new ArrayList();
		
		for(int i = 0; i<name.length ; i++) {
			Students student = new Students(name[i],email[i],phno[i],age[i],gender[i],idno[i]);
			stu.add(student);
		}
		
		System.out.println("Total Students : " + stu.size());
		System.out.println("  ");
		
		for(int i=0; i<stu.size();i++) {
			
			System.out.println("Student Name : " + stu.get(i).name);
			System.out.println("Email Id : " + stu.get(i).email);
			System.out.println("Phone Number : " +stu.get(i).phno);
			System.out.println("Age : " + stu.get(i).age);
			System.out.println("Gender : " + stu.get(i).gender);
			System.out.println("Id Number : " + stu.get(i).idno);
			System.out.println(" ");
		}

	}

}
