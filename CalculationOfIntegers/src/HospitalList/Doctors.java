package HospitalList;

public class Doctors {
		String name, specialist, qualification, email, phno, timings;
		int age;
		char gender;
	
		Doctors(String name,  String specialist, String timings, String qualification,
				String email, String phno, int age, char gender){
			this.name = name;
			this.specialist = specialist;
			this.timings = timings;
			this.qualification = qualification;
			this.email = email;
			this.phno = phno;
			this.age = age;
			this.gender = gender;
		}
		
		public String DoctorDetails() {
	        return "Name of the Doctor : " + name + "\nSpecialist : " + specialist + "\nDoctor Timings :" +timings+
	        		"\nQualification : " +qualification + "\nEmail : " + email + "\nPhone Number: " + phno
	                + "\nAge: " + age + "\nGender: " + gender;
		}

		public String getname() {
			// TODO Auto-generated method stub
			return name;
		}
		public String getSpecialization() {
			return specialist;
		}
		public String getTimings() {
			return timings;
		}
		

	}
