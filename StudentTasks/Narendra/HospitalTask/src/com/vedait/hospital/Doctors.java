package com.vedait.hospital;

import java.util.*;

public class Doctors {
	
	String name;
	String id;
	String Specialization;
	List<String> availableTime= new ArrayList<>();
	int c;
	Doctors(String name,String id,String Specialization,List<String> availableTime,int c){
		this.name=name;
		this.id=id;
		this.Specialization=Specialization;
		this.availableTime=availableTime;
		this.c=c;
	}
	 
	 
}
