package com.vedait.institute;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
			Teacher dinesh=new Teacher("Dinesh", "Java Full Stack",2, 'M', "VEDAIT in KPHB");
			Teacher ravi=new Teacher("Ravi", "Java Full Stack",2, 'M', "VEDAIT in KPHB");
			Teacher sandhya=new Teacher("Sandhya Rani", "Data Analytics Science",2, 'F', "VEDAIT in KPHB");
			Teacher jyotshna=new Teacher("Jyotshna RamiReddy", "Python Full Stack",2, 'F', "VEDAIT in KPHB");

			Employee saika=new Employee("Saika", 'F', 23, 10000, "VEDAIT in KPHB");
			Employee venkat=new Employee("Venkat", 'M', 24, 12000, "VEDAIT in KPHB");
			Employee meghana=new Employee("Meghana", 'F', 25, 11000, "VEDAIT in KPHB");
			
			Student kavitha=new Student("R", "Kavitha", "JAVA CLASS", 12);
			Student satya=new Student( "Satya","Sri", "JAVA CLASS", 11);
			Student ram=new Student("Rama", " Krishna", "JAVA CLASS", 10);
			Student diwakar=new Student("Y", "Diwakar", "JAVA CLASS", 9);
			Student aravind=new Student("Aravind", "Babu", " DATA ANALYTICS", 3);
			Student sindu=new Student( "Satya","Sindu", "JAVA CLASS", 11);
			
			Teacher teachers[]= {dinesh,ravi,sandhya,jyotshna};
			Employee employee[]= {saika,venkat,meghana};
			Student students[]= {kavitha,satya,ram,diwakar,aravind,sindu};
			
			Institute vedait=new Institute("VEDAIT", teachers, employee, students);
			
			System.out.println("No of the Teacher in VedaIt:"+ vedait. teachers.length);
			System.out.println("No of the Employee in VedaIt:"+ employee.length);
			System.out.println("No of the Student in VedaIt:"+ students.length);
			System.out.println(" ");
			for(int i=0;i<teachers.length;i++) {
			System.out.println("Name Of The Teacher:"+teachers[i].name);
			}
			System.out.println(" ");
			
			int teacherIndexToPrint = 1;
			if (teacherIndexToPrint >= 0 ) {
			    System.out.println("Name Of The Teacher: " + vedait.teachers[teacherIndexToPrint].name);
			} else {
			    System.out.println("Invalid teacher index.");
			}
			
			System.out.println(" ");
			
			System.out.println("Name Of The SubjectTeacher:"+vedait.teachers[0].subname);
			System.out.println("Name Of The SubjectTeacher:"+vedait.teachers[1].subname);
			System.out.println("Name Of The SubjectTeacher:"+vedait.teachers[2].subname);
			System.out.println("Name Of The SubjectTeacher:"+vedait.teachers[3].subname);

			System.out.println(" ");
			
			System.out.println("Gender Of The Teacher :"+vedait.teachers[0].gender);
			System.out.println("Gender Of The Teacher:"+vedait.teachers[1].gender);
			System.out.println("Gender Of The Teacher:"+vedait.teachers[2].gender);
			System.out.println("Gender Of The Teacher:"+vedait.teachers[3].gender);
			
			System.out.println(" ");
			System.out.println("Name Of The Employee:"+vedait.employee[0].name);
			System.out.println("Name Of The Employee:"+vedait.employee[1].name);
			System.out.println("Name Of The Employee:"+vedait.employee[2].name);
			
			System.out.println(" ");
			
			System.out.println("Name of the Student in VedaIt:"+  vedait.students[0].lastName);
			System.out.println("Name of the Student in VedaIt:"+  vedait.students[1].lastName);
			System.out.println("Name of the Student in VedaIt:"+  vedait.students[2].lastName);
			System.out.println("Name of the Student in VedaIt:"+  vedait.students[3].lastName);
			System.out.println("Name of the Student in VedaIt:"+  vedait.students[4].firstName);
			System.out.println("Name of the Student in VedaIt:"+  vedait.students[5].lastName);
			
			System.out.println(" ");
			
			System.out.println("Name of the  StudentClass in VedaIt:"+  vedait.students[0].className);
			System.out.println("Name of the  StudentClass in VedaIt:"+  vedait.students[1].className);
			System.out.println("Name of the StudentClass in VedaIt:"+  vedait.students[2].className);
			System.out.println("Name of the StudentClass in VedaIt:"+  vedait.students[3].className);
			System.out.println("Name of the StudentClass in VedaIt:"+  vedait.students[4].className);
			System.out.println("Name of the StudentClass in VedaIt:"+  vedait.students[5].className);
			
			
		
		

	}

}
