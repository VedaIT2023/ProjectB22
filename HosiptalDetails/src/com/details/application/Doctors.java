package com.details.application;

public class Doctors extends Person {
	
	    private String specialization;

	    public Doctors(String name, int id, String specialization) {
	        super(name, id);
	        this.specialization = specialization;
	    }

	    public String getSpecialization() {
	        return specialization;
	    }

	    @Override
	    public String toString() {
	        return "Doctors [" + super.toString() + ", Specialization: " + specialization + "]";
	    }
	}


