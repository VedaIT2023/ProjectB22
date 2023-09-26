package com.Vedait.Student.Chart;
import java.util.ArrayList;
public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = {"Balaji", "Chandini", "Divakar", "Kavitha", "Lakshman", "Mani", "Narendra", "Pavan", "RamaKrishna",
				"Sandeep", "Satish", "Sathwik", "Satya", "Siddu", "Sindhu", "Sunanda", "Sunil", "Valli", "Kalyan"};
		String email[] = {"bal@gmail.com", "chan@gmail.com", "div@gmail.com", "kav@gmail.com", "lak@gmail.com",
				"mani@gmail.com", "nar@gmail.com", "pav@gmail.com", "ram@gmail.com", "sun@gmail.com", "sat@gmail.com",
				"sath@gmail.com", "satya@gmail.com", "sid@gmail.com", "sin@gmail.com", "sun@gmail.com", "sinil@gamil.com","valli@gmail..com",
				"kal@gmail.com"};
		String qualification[] = {"Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech",
				"Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech"};
		String stream[] = {"ECE", "CSE", "ECE", "ECE", "ECE", "CSE", "CSE", "ECE", "ECE", "CSE", "ECE", "ECE", "ECE",
				"ECE", "ECE", "ECE", "ECE", "ECE", "ECE"};
		String phno[] = {"7326156924", "8293727432", "8747438473", "9849873484", "8924994383", "8929228226", "8994343344",
				"9974846384", "9745364433", "6372882273", "6301773737", "6429827172", "8653346226", "9526372627", "64219282282",
				"9784728734", "6438838784", "9654374373", "62028392837"};
		int age[] = {21, 21, 22, 21, 21, 21, 21, 21, 22, 22, 21, 21, 21, 22, 21, 21, 22, 21, 21};
		char gender[] = {'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'M', 'M'};
		System.out.println(name.length);
		System.out.println(email.length);
		System.out.println(qualification.length);
		System.out.println(stream.length);
		System.out.println(phno.length);
		System.out.println(age.length);
		System.out.println(gender.length);
		ArrayList<Students>student = new ArrayList();
		for(int i=0; i<name.length;i++) {
			Students st = new Students(name[i], qualification[i], stream[i], email[i], phno[i], age[i], gender[i]);
			student.add(st);
		}
		for(int i=0 ; i< student.size();i++) {
		System.out.println(student.get(i).StudentDetails());
		System.out.println("");
		}
	}
}


