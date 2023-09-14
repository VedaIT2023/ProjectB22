package ConceptsOfJava;

public class Organisation {
	String name, coursesOffered, emailid;
	int phno, estd;
	long strength;
	double fee;
	Employees emp[];
	Teachers ts[];
	Students st[];
	Organisation(String name,String emailid, String coursesOffered, int phno, int estd, long strength, double fee, Employees emp[],
			Teachers ts[], Students st[]){
		this.name = name;
		this.coursesOffered = coursesOffered;
		this.emailid = emailid;
		this.estd = estd;
		this.strength = strength;
		this.fee = fee;
		this.phno = phno;
		this.emp = emp;
		this.ts = ts;
		this.st = st;
	}
	public String OrganisationDetails() {
        return "Name of the Organisation : " + name + "\nEmail : " + emailid 
                + "\nCourses Offered : " + coursesOffered + "\nPhone Number: " + phno + "\nESTD : " + estd + "\nStrength : " + strength 
                + "\nFEE Struture : " + fee ;
	}
}
