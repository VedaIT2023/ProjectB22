package com.City.task;

public class Collage {
	String name;
	int floors;
	int libraries;
	int classes;
	int students;
	int staffmembers;
	
	
		void Collagetime() {
			System.out.println(this.name +"collage will start at 9:am");
		}
		void classtimings() {
			System.out.println(this.classes +"6 classes per day");
		}
		
			Collage(String name,int floors,int libraries,int classes,int students,int staffmembers){
				this.name=name;
				this.floors=floors;
				this.libraries=libraries;
				this.classes=classes;
				this.students=students;
				this.staffmembers=staffmembers;
				
			   }
}
