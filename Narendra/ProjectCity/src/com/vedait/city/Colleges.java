package com.vedait.city;

import java.util.List;

public class Colleges {
    String name;
    String location;
    String dean;
    int facultyCount;
    List<String> coursesOffered;
    String accreditation;
    double campusSize;
    double tutionFees;
    
    Colleges(String name,String location,String dean,int facultyCount,List<String> coursesOffered,String accreditation,
         double campusSize, double tutionFees){
    	
    	this.name=name;
    	this.location=location;
    	this.dean=dean;
    	this.facultyCount=facultyCount;
    	this.coursesOffered=coursesOffered;
    	this.accreditation=accreditation;
    	this.campusSize=campusSize;
    	this.tutionFees=tutionFees;
    	
    }
}
