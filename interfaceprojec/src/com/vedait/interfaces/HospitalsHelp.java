package com.vedait.interfaces;
import java.util.*;
public class HospitalsHelp {

	
	public static LinkedList<Doctor>doctorsList=new LinkedList();
		 
		 static  void createDoctors() {
			 addDoctors("Dr.Mahi",100, "10:00AM--12:00PM", "Cardiologists","9876543210","mahi@gmail.com" );
			 addDoctors("Dr.Maruthi",101,"9:00AM--1:00PM", "Dermatologists","9876543210","maruthi@gmail.com" );
			 addDoctors("Dr.Maheswari",102,"11:00AM--3:00PM", "Endocrinologists","9987654321","mahe@gmail.com" );
			 addDoctors("Dr.Akshaya",103,"2:00PM--4:00PM", "Gastroenterologists","9987654456","akshay@gmail.com" );
			 addDoctors("Dr.Akshitha",104,"2:00PM--4:00PM", "Hematologists","9987654876","ashitha@gmail.com" );
			 addDoctors("Dr.Abhinaya",105,"1:00PM--4:00PM", "Nephrologists","9987654438","abhinaya@gmail.com" );
			 addDoctors("Dr.AbhiRam",106,"12:00PM--4:00PM", "Neurologists","99876544987","abhiram@gmail.com" );
			 addDoctors("Dr.VasuPradha",107,"10:00AM--4:00PM", "Obstetricians","998765095","vasu@gmail.com" );
			 addDoctors("Dr.Bheem",108,"2:00PM--8:00PM", "Oncologists","9987654345","bheem@gmail.com" );
			 addDoctors("Dr.Pavan",109,"1:00PM--9:00PM", "Ophthalmologists","9550454438","pavan@gmail.com");
			 
		 }
		 static void displayDoctorsList() {
				for(int i=0; i<doctorsList.size();i++) {
					Doctor doctors= HospitalsHelp.doctorsList.get(i);
					System.out.println(doctors.id + " " + doctors.name + " " + doctors.specialisation);
				}

			}

public static void addDoctors(String name,int id,String timings,String specialisation,String phoneNumber,String email){
	Doctor doctors = new Doctor(name,id,timings,specialisation,phoneNumber,email);
	doctorsList.add(doctors);
		}
		}