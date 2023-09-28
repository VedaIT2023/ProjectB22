package AppointmentForm;

public class Patients {
	String name, problem,condition,department,email,phno;
	int age;
	char gender;
	Patients(String name, String problem, String condition, String department, String email, 
				String phno, int age, char gender){
		this.name = name;
		this.problem = problem;
		this.condition = condition;
		this.department = department;
		this.email = email;
		this.phno = phno;
		this.age = age;
		this.gender = gender;
		}
		
		public String PatientDetails() {
	        return "Name of the Name : " + name + "\nProblem : " + problem + "\nCondition : " +
		condition + "\nDepartment : " + department + "\nEmail : " + email + "\nPhone Number: " + phno + "\nAge: " + age + "\nGender: " + gender;
		}

		public String getName() {
			return name;
		}
		public String getProblem() {
			return problem;
		}

}
