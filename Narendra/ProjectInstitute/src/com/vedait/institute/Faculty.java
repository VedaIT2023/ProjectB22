package com.vedait.institute;

public class Faculty {
	String fName;
	int fId;
	String eMail;
	String cName;
	int batchesAlloted;
	String classTiming;
	int eachClassDuration;
	
	public Faculty(String fName,int fId,String eMail,String cName,int batchesAlloted,String classTiming,int eachClassDuration){
		this.fName=fName;
		this.fId=fId;
		this.eMail=eMail;
		this.cName=cName;
		this.batchesAlloted=batchesAlloted;
		this.classTiming=classTiming;
		this.eachClassDuration=eachClassDuration;
		
	}
}
