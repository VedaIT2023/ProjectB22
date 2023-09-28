package AppointmentForm;

public class Doctors {
		String name, id, specialist, qualification, email, phno, timings;
		int age;
		char gender;
	
		Doctors(String name, String id, String specialist, String timings, String qualification,
				String email, String phno, int age, char gender){
			this.name = name;
			this.id = id;
			this.specialist = specialist;
			this.timings = timings;
			this.qualification = qualification;
			this.email = email;
			this.phno = phno;
			this.age = age;
			this.gender = gender;
		}
		
		public String DoctorDetails() {
	        return "Name of the Doctor : " + name + "Doctor ID :" +id+ "\nSpecialist : " + specialist + "\nDoctor Timings :" +timings+
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
