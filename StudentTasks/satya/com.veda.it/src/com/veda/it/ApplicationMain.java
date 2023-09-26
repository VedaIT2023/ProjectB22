package com.veda.it;
import java.util.ArrayList;
public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		String[] names = {"saika","venkat","anil"};
		char[] gender = {'F','M','M'};
		double[] salary = {10000,10000,50000};
		String[] emails = {"saika@gmail.com","venkat@gmail.com","anil@gmail.com"};
		int[] id= {123,146,178};
		String[] address = {"kakinada","vijayawada","hyderabad"};
		ArrayList<Employee> employee = new ArrayList(); 
		for(int i=0;i<gender.length;i++) {
			Employee details = new Employee (names[i], gender[i], id[i], salary[i], address[i],emails[i]);
			employee.add(details);
		
	   }
		System.out.println(employee.size());
		for(int i=0;i<employee.size();i++) {
			System.out.println(employee.get(i).name);
		}
	 }
}