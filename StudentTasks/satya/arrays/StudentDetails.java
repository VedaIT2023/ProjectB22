package com.name.arrays;
import java.util.HashMap;
public class StudentDetails {

	public static void main(String[] args) {
	
		        HashMap<Integer, Student> studentDetails = new HashMap<>();

		     
		        studentDetails.put(1, new Student(1917, "satyasri", "Java Full Stack"));
		        studentDetails.put(2, new Student(1818, "kavitha", "Java FUll Stack"));
		        studentDetails.put(3, new Student(8931, "Sunanda", "Java Full Stack"));
		        studentDetails.put(4, new Student(7418, "Sindhu", "Java Full Stack"));
		        studentDetails.put(5, new Student(7629, "Chandhini", "Java Full Stack"));
		        studentDetails.put(6, new Student(9354, "Deepika", "Java Full Stack"));
		        studentDetails.put(7, new Student(1678, "Ram", "Java Full Stack"));
		        studentDetails.put(8, new Student(1980, "Vali", "Java Full Stack"));
		        studentDetails.put(9, new Student(1456, "Diwakar", "Java Full Stack"));
		        studentDetails.put(10, new Student(1108, "Narendra", "Java Full Stack"));

		        
		        for (Student student : studentDetails.values()) {
		            System.out.println("Name: " + student.getName());
		            System.out.println("Course: " + student.getCourse());
		            System.out.println("studentid:"+student.getStudentID());
		        }
		    }
		}

		class Student {
		    private int studentID;
		    private String name;
		    private String course;
		    

		    public Student(int studentID, String name, String course) {
		        this.studentID = studentID;
		        this.name = name;
		        this.course = course;
		        
		    }

		    public int getStudentID() {
		        return studentID;
		    }

		    public String getName() {
		        return name;
		    }

		    public String getCourse() {
		        return course;
		    }
		}
