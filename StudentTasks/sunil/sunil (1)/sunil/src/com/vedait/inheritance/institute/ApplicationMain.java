package com.vedait.inheritance.institute;

public class ApplicationMain {

	public static void main(String[] args) {
		Student sunil= new Student("Sunil", "Java Full Stack", "Male", "Morning 7-9 Batch", "sunildadepogu038@gmail.com", 6305040295L, 20000);
		Student divakar=new Student("Divakar", "Java Full Stack", "Male", "Morning 7-9 Batch", "divakar@gmail.com", 123654789L, 20000);
		Student ramarishna=new Student("Rama Krishna", "Java Full Stack", "Male", "Morning 7-9 Batch", "ramakrishan@gmail.com", 123654789L, 20000);
		Student valli=new Student("Valli", "Java Full Stack", "Male", "Morning 7-9 Batch", "divakalliar@gmail.com", 123654789L, 20000);
		
		Student[] students= {sunil,divakar,ramarishna,valli};

		Teacher dinesh = new Teacher("Dinesh ", "dinesh@gmail", "Java Full Stack", "Male", 132456987L, 10);
		Teacher kanna = new Teacher("Kanna ", "kanna@gmail", "Java Full Stack", "Male", 132456987L, 10);
		Teacher anil = new Teacher("Anil ", "anil@gmail", "Java Full Stack", "Male", 132456987L, 10);
		Teacher rajesh = new Teacher("Rajesh ", "rajesh@gmail", "Java Full Stack", "Male", 132456987L, 10);
		
		Teacher[] teachers= {dinesh,kanna,anil,rajesh};
		
		Employe kiran = new Employe("KIran", "Male", "Sale Executive", 25, 20000);
		Employe sidhhu = new Employe("Sidhu", "Male", "Sale Executive", 25, 20000);
		Employe vijaya = new Employe("Vijaya", "Female", "Receptionist ", 25, 20000);
		Employe chandini = new Employe("handini", "Female", " Receptionist", 25, 20000);
		
		Employe[] employe= {kiran,sidhhu,vijaya,chandini };
		
		Institute vedait = new Institute(null, null, 0, 0, 0, 0, 0, teachers, students, employe);
		
		System.out.println("Name of the first Student : "+sunil.name);
		System.out.println(vedait.students.length);


	}

}
