package com.vedait.institute;

public class Students {
	String studentName;
	int studentId;
	String eMail;
	String courseName;
	String batchTimings;
	String Instructor;
	
	public Students(String sName,int sId,String eMail,String cName,String Instructor,String batchTimings){
		this.studentName=sName;
		this.studentId=sId;
		this.eMail=eMail;
		this.courseName=cName;
		this.Instructor=Instructor;
		this.batchTimings=batchTimings;
	}

}
