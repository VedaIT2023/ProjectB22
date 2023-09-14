package ConceptsOfJava;

public class Employees {
	String name, emailid, role;
	int idno;
	long phno;
	double salary;
	char gender;
	void decisionMaking() {
		System.out.println(name + " To Take the Right Decision while Verifying the Tasks ");
	}
	void problemSolving() {
		System.out.println(name + " It the act of defining a problem and determining the cause of the problem");
	}
	Employees(String name, String emailid, String role, int idno, long phno, double salary, char gender){
		this.name = name;
		this.emailid = emailid;
		this.role = role;
		this.idno = idno;
		this.phno = phno;
		this.salary = salary;
		this.gender = gender;
	}
	public String EmployeeDetails() {
        return "Name of the Employee : " + name + "\nEmail : " + emailid 
                + "\nID NO : " + idno + "\nRole : " + role + "\nPhone Number: " + phno
                + "\nSalary: " + salary + "\nGender: " + gender;
		
	}
}