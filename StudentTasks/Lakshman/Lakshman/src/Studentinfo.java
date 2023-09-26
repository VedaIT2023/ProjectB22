package com.OOPS.polymorphism;
import java.util.*;
public class Studentinfo {

			 String name,idno,email,course;
			 int age;
			 char gender;
			
			 Studentinfo(String name,String idno,String email,String course,int age,char gender){
				this.name = name;
				this.idno = idno;
				this.email = email;
				this.course = course;
				this.age = age;
				this.gender = gender;
				
			}
			
			 public String details() {
				    return "Name: " + this.name + "\n" +
				           "IdNo: " + this.idno + "\n" +
				           "Email: " + this.email + "\n" +
				           "Course: " + this.course + "\n" +
				           "Age: " + this.age + "\n" +
				           "Gender: " + this.gender;
				}

		
	}


