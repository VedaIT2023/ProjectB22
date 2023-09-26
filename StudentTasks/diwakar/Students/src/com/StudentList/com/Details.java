package com.StudentList.com;

import java.util.ArrayList;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"Balaji","Chandini","Divakar","Kavitha","Lakshman","Mani","Narendra","Pavan","Rama Krishna","Sandeep","Satish","Satwik","Satya","Siddu","Sindhu","Sunanda","Sunil","Valli","Kalyan"};
		String emails[] = {"balaji@gmail.com","chandini@gmail.com","divakar2gmail.com","kavitha@mail.com","lakshman@gmail.com","mani@gmail.com","narendra@gmail.com","pavan@gmail.com","ramakrishna@gmail.com","sandeep@gmail.com","sathishn2gmail.com","sathwick@gmail.com","satya@gamil.com","siddu@gmail.com","sindhu@gmail.com","sunanda@gmail.com","sunil@gmail.com","valli@gmail.com","kalyan@gmail.com"};
		String phonenumber[]= {"7485963259","7984596315","6874596254","7754896325","8974593215","8054946321","6857412245","9685742331","6698574121","9988745632","7745879632","8875496321","6395287415","7488579632","7448596321","9448577632","9336578742","7114855269","9876543219"};
		int age[]= {21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21};
		String course[]= {"Java fullstack","Backend","frontend","pythan","Java fullstack","Java fullstack","Backend","frontend","pythan","Java fullstack","Java fullstack","Backend","frontend","pythan","Java fullstack","Java fullstack","Backend","frontend","pythan"};
		int fee[]= {20000,16000,17000,19000,21000,20000,16000,17000,19000,21000,20000,16000,17000,19000,21000,20000,16000,17000,18000};
		
		ArrayList<Student>student = new ArrayList();
		  for(int i=0; i<names.length; i++){
			 
			
			Student std=new Student(names[i],emails[i],phonenumber[i],age[i],course[i],fee[i]);
			 
			  student.add(std);
			}
				System.out.println(student.size());
				
					for(int i=0; i<student.size(); i++) {
						System.out.println("Name of the student :"+student.get(i).name);
					}
					 System.out.println(" ");
						for(int i=0; i<student.size(); i++) {
							System.out.println("Email of the student :"+student.get(i).email);
				}
						System.out.println(" ");
						for(int i=0; i<student.size(); i++) {
							System.out.println("Mobile Number :"+student.get(i).phonenumber);
				}
						System.out.println(" ");
						for(int i=0; i<student.size(); i++) {
							System.out.println("Age of Student :"+student.get(i).age);
				}
						System.out.println(" ");
						for(int i=0; i<student.size(); i++) {
							System.out.println("Course :"+student.get(i).course);
				}
						System.out.println(" ");
						for(int i=0; i<student.size(); i++) {
							System.out.println("Fee :"+student.get(i).fee);
						}
						
	}

}
