package DuplicatesNames;
import java.util.HashMap;
import java.util.Scanner;

import StudentDetails.Student;

public class Details {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student name: ");
		String name = sc.nextLine();
		HashMap<String,StudentDetails>student= new HashMap();
		student.put("sathwik" ,new StudentDetails("Sathwik","123","sathwik123@gmail.com","Java FullStack",'M'));
		student.put("balaji" , new StudentDetails("Balaji","124","balai1002@gmail.com","Java FullStack",'M'));
		student.put("satish" , new StudentDetails("Satish","125","satish2001@gmail.com","Java FullStack",'M'));
		student.put("pavan" , new StudentDetails("Pavan","126","pavan143@gmail.com","Java FullStack",'M'));
		student.put("lucky" , new StudentDetails("Lucky","127","lucky1432@gmail.com","Java FullStack",'M'));
		student.put("kalyan" , new StudentDetails("Kalyan","128","kalyan07@gmail.com","Java FullStack",'M'));
		student.put("divakar" , new StudentDetails("Divakar","129","divakar@32gmail.com","Java FullStack",'M'));
		student.put("valli" , new StudentDetails("Valli","130","valli21@gmail.com","Java FullStack",'M'));
		student.put("ramakrishna" , new StudentDetails("Ramakrishna","131","rk3311@gmail.com","Java FullStack",'M'));
		student.put("sunil" , new StudentDetails("Sunil","132","sunil22@gmail.com","Java FullStack",'M'));
		student.put("sandeep" , new StudentDetails("Sandeep","133","sandeep43@gmail.com","Java FullStack",'M'));
		student.put("narendra" , new StudentDetails("Narendra","134","narendra22@gmail.com","Java FullStack",'M'));
		student.put("siddu" , new StudentDetails("Siddu","135","siddu09@gmail.com","Java FullStack",'M'));
		student.put("mani" , new StudentDetails("Mani","136","mani4567@gmail.com","Java FullStack",'M'));
		student.put("kavitha" , new StudentDetails("Kavitha","137","kavitha23@gmail.com","Java FullStack",'F'));
		student.put("satya" , new StudentDetails("Satya","138","satya89@gmail.com","Java FullStack",'F'));
		student.put("sindhu" , new StudentDetails("Sindhu","139","sindhu32@gmail.com","Java FullStack",'F'));
		student.put("sunandha" , new StudentDetails("Sunandha","140","sunandha234@gmail.com","Java FullStack",'F'));
		student.put("chandini" , new StudentDetails("Chandini","141","chandini67@gmail.com","Java FullStack",'F'));
		
		StudentDetails value = student.get(name);
		if(value!=null) {
			System.out.println(value.Details());
		}
			
}

}