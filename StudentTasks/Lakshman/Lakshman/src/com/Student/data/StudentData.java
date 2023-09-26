package com.Student.data;

import java.util.*;

public class StudentData {
	public static void main(String[] args) {
	String name[] = {"Balaji","Chandini","Divakar","Kavitha","Lakshman","Mani","Narendra","Pavan","Rama Krishna","Sandeep","Satish","Satwik","Satya","Siddu","Sindhu","Sunanda","Sunil","Valli","Kalyan"};
	int age[]= {21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21};
	String email[] = {"balaji@gmail.com","chandini@gmail.com","divakar2gmail.com","kavitha@mail.com","lakshman@gmail.com","mani@gmail.com","narendra@gmail.com","pavan@gmail.com","ramakrishna@gmail.com","sandeep@gmail.com","sathishn2gmail.com","sathwick@gmail.com","satya@gamil.com","siddu@gmail.com","sindhu@gmail.com","sunanda@gmail.com","sunil@gmail.com","valli@gmail.com","kalyan@gmail.com"};
	String course[]= {"JFS","Python","core java","python","JFS","HTML","AWS","Devops",".NET","Python","JFS","UI/UX","frontend","pythan","AWS","Java","UI/UX","frontend","python"};
	String address[]= {"KPHB","punjagutta","khairthabad","Hyderabad","Nalgonda","Guntur","Adilabad","Warangal",".Chennai","Ananthapur","Tuni","Coimbathore","Raichur","Parchoor","Bangalore","Goa","Vijayawada","Tirupati","Chirala"};
	String mobileno[]= {"9985963259","7784596315","8874596254","6354896325","8974593215","9254946321","7157412245","7825742331","9998574121","9988745632","7745879632","8875496321","6395287415","7488579632","7448596321","9948577632","6636578742","9414855269","8814852569"};
	
	ArrayList<Data>students = new ArrayList();
	
	for (int i=0;i<name.length;i++) {
		
		Data info = new Data(name[i], age[i], email[i], course[i], address[i], mobileno[i]);
		students.add(info);
		
	}
	for(int i=0;i<students.size();i++){
		System.out.println(students.get(i).name+"\n"+students.get(i).age+students.get(i).email+"\n"+students.get(i).course+"\n"+students.get(i).address+"\n"+students.get(i).mobileno+"\n");
		}
	}
}