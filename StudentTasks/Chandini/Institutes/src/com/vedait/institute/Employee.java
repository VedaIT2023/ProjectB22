package com.vedait.institute;

public class Employee {
	String employeeName;
	int employeeId;
	String eMail;
	String courseName;
	int batchesAlloted;
	String classTiming;
	int eachClassDuration;
	
	public Employee(String fName,int fId,String eMail,String cName,int batchesAlloted,String classTiming,int eachClassDuration){
		this.employeeName=fName;
		this.employeeId=fId;
		this.eMail=eMail;
		this.courseName=cName;
		this.batchesAlloted=batchesAlloted;
		this.classTiming=classTiming;
		this.eachClassDuration=eachClassDuration;
		
	}

}
