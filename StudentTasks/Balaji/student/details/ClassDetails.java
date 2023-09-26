package com.vedait.institute.student.details;
import java.util.ArrayList;

public class ClassDetails {

	public static void main(String[] args) {

				String names[] = {"Balaji", "Chandini", "Divakar", "Kavitha", "Lakshman", "Mani", "Narendra", "Pavan", "RamaKrishna",
						"Sandeep", "Satish", "Sathwik", "Satya", "Siddu", "Sindhu", "Sunanda", "Sunil", "Valli", "Kalyan"};
				
				int age[] = {21, 21, 22, 21, 21, 21, 21, 21, 22, 22, 21, 21, 21, 22, 21, 21, 22, 21, 21};

				char gender[] = {'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'M', 'M'};

				String phnoNo[] = {"7326156924", "8293727432", "8747438473", "9849873484", "8924994383", "8929228226", "8994343344",
						"9974846384", "9745364433", "6372882273", "6301773737", "6429827172", "8653346226", "9526372627", "64219282282",
						"9784728734", "6438838784", "9654374373", "62028392837"};
				
				String email[] = {"balaji@gmail.com", "chandini@gmail.com", "divakar@gmail.com", "kavitha@gmail.com", "lakshman@gmail.com",
						"mani@gmail.com", "narendra@gmail.com", "pavan@gmail.com", "ramakrishna@gmail.com", "sandeep@gmail.com", "satish@gmail.com",
						"sathwik@gmail.com", "satya@gmail.com", "siddu@gmail.com", "sindhu@gmail.com", "sunanda@gmail.com","sunil@gmail.com", "valli@gmail..com",
						"kal@gmail.com"};
				
				String qualifications[] = {"Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech",
						"Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech", "Btech"};

				String address[]= {"KPHB","punjagutta","khairthabad","Hyderabad","Nalgonda","Guntur","Adilabad","Warangal","Chennai","Ananthapur","Tuni","Coimbathore","Raichur","Parchoor","Bangalore","Goa","Vijayawada","Tirupati","Chirala"};

				ArrayList<Properties>students = new ArrayList();
				for(int i=0; i<names.length; i++) {
					Properties student = new Properties(names[i], age[i], gender[i], phnoNo[i], email[i], qualifications[i], address[i]);
					students.add(student);
				}
					System.out.println("Total No.of Students: "+students.size()+"\nDetails of Students");
					
					for(int i=0; i<students.size(); i++) {
						System.out.println(students.get(i).toString());
					}
	}

}


