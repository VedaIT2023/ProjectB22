package ConceptsOfJava;

public class Teachers {
	String name, emailid, role, qualification;
	long phno;
	double salary;
	char gender;
	void doubtClarification(){
		System.out.println(name + " Solving the Doubts to the students ");
	}
	void assesment() {
		System.out.println(name + " Send the Assesments to the Students ");
	}
	Teachers(String name, String emailid, String role, double salary, String qualification,long phno, char gender){
		this.name = name;
		this.emailid = emailid;
		this.role = role;
		this.salary = salary;
		this.qualification = qualification;
		this.phno = phno;
		this.gender = gender;	
	}
	public String LecturerDetails() {
        return "Name of the Lecturer : " + name + "\nEmail : " + emailid 
                +  "\nRole : " + role + "\nPhone Number: " + phno
                + "\nSalary: " + salary + "\nGender: " + gender;
	}
	
}
