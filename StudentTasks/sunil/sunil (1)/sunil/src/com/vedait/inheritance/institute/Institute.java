package com.vedait.inheritance.institute;

public class Institute {
	String name,courses;
	int rooms,labs,faculty,staff,floor;
	Teacher[] teachers;
	Student[] students;
	Employe[] employe;
	
	Institute(String name,String courses,int floor,int rooms,int labs,int faculty,int staff,Teacher[] teachers,Student[] students,Employe[] employe){
		this.name=name;
		this.floor=floor;
		this.courses=courses;
		this.rooms=rooms;
		this.labs=labs;
		this.faculty=faculty;
		this.staff=staff;
		this.teachers=teachers;
		this.students=students;
		this.employe=employe;
	}
}
