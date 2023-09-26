package StudentDetails;

import java.util.*;

public class Details {
	public static void main(String[] args) {
		String name[] ={"Sathwik","Balaji","Satish","Pavan","Lakshaman","kalyan","Chandini","Divakar","Kavitha","Mani","Narendra",
						 "Rama Krishna","Sandeep","Satya","Siddu","Sindhu","Sunanda","Sunil","Valli"};
		
		String email[]= {"sathwik21@gmail.com","balaji22@gmail.com","satish112@gmail.com","pavan32@gmail.com","lakshman12@gmail.com","kalyan07@gmail.com",
				         "chandini44@gmail.com", "divakar27@gmail.com", "kavitha44@gmail.com","mani44@gmail.com","narendra45@gmail.com","ramakrishna232@gmail.com",
				         "sandeep56@gmail.com","satya45@gmail.com","siddu123@gmail.com","sindhu57@gmail.com", "sunanda32@gmail.com","sunil75@gmail.com","valli44@gmail.com"};
		
		
		String phno[]= {"2347239490","6596285822","9298447242","9259275237","9275223474","9783250283","6329791112",
						"6522923309","8432938753","7529971434","6278932734","7382937422","8927355234","4757290359",
						"2375927523","5937593274","7329543453","8429740275","6825262345"};
		
		String qualification[] = {"B.TECH","B.TECH","B.TECH","B.TECH","B.TECH","B.TECH","B.TECH","B.TECH","B.TECH","B.TECH","B.TECH","B.TECH",
								  "B.TECH","B.TECH","B.TECH","B.TECH","B.TECH","B.TECH","B.TECH",};
		
		int age[] = {22,22,22,22,22,22,21,23,13,24,21,22,23,22,20,22,21,22,23};
		
		char gender[]= {'M','M','M','M','M','M','F','M','F','M','M','M','M','F','M','F','F','M','M'};
		
		


		ArrayList<constructionclass>students = new ArrayList();
		
		for(int i=0;i<name.length;i++) {
			constructionclass stud =new constructionclass(name[i], email[i], phno[i], qualification[i], age[i], gender[i]);
			students.add(stud);
		}	
		
		System.out.println("Class Strength:"+students.size());
		System.out.println();
		
		for(int i=0;i<students.size();i++) {
			System.out.println("Student Name:"+students.get(i).name);
			System.out.println("Email:"+students.get(i).email);
			System.out.println("Phone no:"+students.get(i).phno);
			System.out.println("Qualification:"+students.get(i).qualification);
			System.out.println("Age:"+students.get(i).age);
			System.out.println("Gender:"+students.get(i).gender);
			
			System.out.println();

			
		}
	
	}

}
