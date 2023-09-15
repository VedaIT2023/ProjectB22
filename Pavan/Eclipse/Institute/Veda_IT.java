package com.vedait.Institute;

public class Veda_IT {

public static void main(String[] args) {
		
		System.out.println("Welcome to veda-IT\n");
	
		Teachers Teacher1 = new Teachers("Dinesh sir","dinesh@gmail.com",'M',9384997504l,"FS Java");
		Teachers Teacher2 = new Teachers("Anil sir","anil@gmail.com",'M',7936575649l,"Python");
		Teachers Teacher3 = new Teachers("Anusha madam","anusha@gmail.com",'F',8957480565l,"AWS");
		Teachers Teacher4 = new Teachers("Ramesh sir","ramesh@gmail.com",'M',8947058957l,"UI/UX");
		Teachers Teacher5 = new Teachers("Kavitha madam","kavitha@gmail.com",'F',7510575745l,"Java");
		
		Employees employee1 = new Employees("Shankar","shankar@gmail.com","System Operator",'M',7892573480L,15000);
		Employees employee2 = new Employees("Sanjay","sanjay@gmail.com","Receptionist ",'M',7894543570L,15000);
		Employees employee3 = new Employees("Sridevi","sridevi@gmail.com","Accountant",'F',7892573480L,12000);
		Employees employee4 = new Employees("Lucky","lucky@gmail.com","Attender",'M',7942756455L,5000);
		Employees employee5 = new Employees("Shanthi","shanthi@gmail.com","Sweper",'F',7892573480L,3000);
		
		Students student1 = new Students("Pavan","pavan@gmail.com",'M',9344896900l,1215,"FS java",25000);
		Students student2 = new Students("Lakshman","lakshman@gmail.com",'M',9783496904l,1209,"FS java",25000);
		Students student3 = new Students("Satish","satish@gmail.com",'M',7036156925l,1211,"java",5000);
		Students student4 = new Students("Balaji","balaji@gmail.com",'M', 7937232931l,1215,"FS python",25000);
		Students student5 = new Students("Satwik","satwik@gmail.com",'M',8309988325l,1207,"UI/UX",20000);
		
		Teachers tc[] = {Teacher1,Teacher2,Teacher3,Teacher4,Teacher5};
		Employees emp[] = {employee1,employee2,employee3,employee4,employee5};
		Students st[] = {student1,student2,student3,student4,student5};
		
		Institute vedait = new Institute("Veda-IT","vedait@gmail.com","JAVAFS",5786349578L,tc,emp,st);
		System.out.println("Number of Teachers in Institute :" + vedait.tc.length);
		System.out.println("Number of Employees in Institute :" + vedait.emp.length);
		System.out.println("Number of Students in Institute :" + vedait.st.length);
		
		System.out.println("\nDetails of Teachers :");
		for(Teachers teachers : tc) {
			System.out.println(teachers.teachers());
			System.out.println();
			}
			Teacher1.douts();
			Teacher3.teach();
			System.out.println();
		
		System.out.println("Details of Employees :");
		for(Employees employees : emp) {
				System.out.println(employees.employees());
				System.out.println();
				}
			employee1.detail();
			employee3.payment();
			System.out.println();
			
		System.out.println("Student Details :");	
		for(Students students : st) {
            System.out.println(students.students());
            System.out.println();
		}
		student2.attendence();
		student1.learn();   
        
		
	}
}
