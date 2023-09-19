package com.vedait.student;

import java.util.ArrayList;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  String name[]= {"Balaji","Chandini","Diwakar","Kavitha","Lakshman","Mani","Narendra","Pavan","Rama Krishna",
		"Sandeep","Satish","Satwik","Satya","Siddu","Sindhu","Sunanda","Sunil","Valli","Kalyan"};
  
   String email[]= {"balaji@gmail.com","chandini@gmail.com","diwakar@gmail.com","kavitha@gmail.com"
		   ,"lakshman@gmail.com","mani@gmail.com","narendra@gmail.com","pavan@gmail.com",
		   "ramakrishna@gmail.com","sandeep@gmail.com","satish@gmail.com","sathwik@gmail.com",
		   "satya@gmail.com","siddu@gmail.com","sindhu@gmail.com","sunanda@gmail.com",
		   "sunil@gmail.com","valli@gmail.com","kalyan@gmail.com"};
   
   int age[]= {20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20};
   
   String phoneNumber[]= {"1234567890","1223338767","9876543214","8901234567","7890123456,",
		   "6789012345","5678901234","4567890123","9765432108","9654321087","9543210876","9432108765"
		   ,"9321087654","9210876543","9108765432","8765432190","8901234567","6543217896","9398765432"};
   char gender[]= {'M','F','M','F','M','M','M','M','M','M','M','M','F','F','F','F','M','M','M'};
   
   int studentId[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
   
       ArrayList<Student>student=new ArrayList();
        for(int i=0;i<name.length;i++) {
	     Student std=new  Student(name[i], email[i], age[i], phoneNumber[i], gender[i], studentId[i]);
	       student.add(std);
	   }
   
     System.out.println("Number of Students:"+student.size());
   System.out.println("");
   
   		for(int i=0;i<student.size();i++) {
	     System.out.println("Names Of Students:"+student.get(i).name);
       }
   		
      System.out.println("");
   
      		for(int i=0;i<student.size();i++) {
      			System.out.println("Emails of the Students:"+student.get(i).email);
	   
   		}
	}

}
