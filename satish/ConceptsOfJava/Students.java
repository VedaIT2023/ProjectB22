package ConceptsOfJava;

public class Students {
	String name, emailid, qualification, course;
	long idno, phno;
	char gender;
	void progress() {
		System.out.println(name + " Checking the Progress Of Student Overall Performance ");
	}
	void tasks() {
		System.out.println(name + " Complete the Tasks within the Given Time ");
	}
	Students(String name, String emailid, String qualification, String course, long idno, long phno, char gender){
		this.name = name;
		this.emailid = emailid;
		this.qualification = qualification;
		this.course = course;
		this.idno = idno;
		this.phno = phno;
		this.gender = gender;
	}
	public String StudentDetails() {
        return "Name of the Student : " + name + "\nEmail : " + emailid 
                + "\nID NO : " + idno + "\nqualification : " + qualification + "\ncourse : " + course + "\nPhone Number: " + phno
                + "\nGender: " + gender;
	}
}
