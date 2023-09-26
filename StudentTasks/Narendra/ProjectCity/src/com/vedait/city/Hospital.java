package com.vedait.city;
import java.util.ArrayList;
import java.util.List;
public class Hospital {
	String name;
	String location;
	List<String> speciality = new ArrayList<>();
	List<String> branches = new ArrayList<>();
	int beds;
	int staff;
	Hospital(String name,String location,List<String> speciality ,List<String> branches ,int beds,int staff){
		this.name=name;
		this.location=location;
		this.speciality=speciality;
		this.branches=branches;
		this.beds=beds;
		this.staff=staff;
		
	}
	
}
	

