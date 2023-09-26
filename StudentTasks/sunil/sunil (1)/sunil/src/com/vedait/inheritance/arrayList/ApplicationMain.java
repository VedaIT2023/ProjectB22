package com.vedait.inheritance.arrayList;
import java.util.ArrayList;

public class ApplicationMain {
	public static void main(String[] args) {
		
		String[] names= {"Balaji","Chandini","Divakar","Kavitha","Lakshman","Mani","Narendra","Pavan","Rama Krishna","Sandeep","Satish","Satwik","Satya","Siddu","Sindhu","Sunanda","Sunil","Valli","Kalyan"};
		String[] email= {"Balaji@gmail.com","Chandini@gmail.com","Divakar@gmail.com","Kavitha@gmail.com","Lakshman@gmail.com","Mani@gmail.com","Narendra@gmail.com","Pavan@gmail.com","Rama Krishna@gmail.com","Sandeep@gmail.com","Satish@gmail.com","Satwik@gmail.com","Satya@gmail.com","Siddu@gmail.com","Sindhu@gmail.com","Sunanda@gmail.com","Sunil@gmail.com","Valli@gmail.com","Kalyan@gmail.com"};
		String mobileNumber[]= {"123654789","123654789","123654789","123654789","123654789","123654789","123654789","123654789","123654789","123654789","123654789","123654789","123654789","123654789","123654789","123654789","123654789","123654789","123654789"};
		int age[]= {22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,};
		String gender[]= {"M","F","M","F","M","M","M","M","M","M","M","M","F","M","F","F","M","M","M",};
		String coures[]= {"Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack",};
	
		ArrayList<Student>student=new ArrayList();
		ArrayList<Employee> empArrayList=new ArrayList();
		Amazon amzn=new Amazon(empArrayList, student);

		
		for(int i=0;i<names.length;i++) {
			Student std=new Student(names[i],email[i],mobileNumber[i],age[i],gender[i],coures[i]);
			student.add(std);
		}
		for(int i=0;i<student.size();i++) {
			System.out.println("Name : "+student.get(i).names+"\n"+"Email : "+student.get(i).email+"\n"+"Mobile Number : "+student.get(i).moblieNumber+"\n"+"Age : "+student.get(i).age+"\n"+"Gender : "+student.get(i).gender+"\n"+"Course : "+student.get(i).course+"\n\n");

		}

		Student kanna=new Student("Kanna", "kanna@gmail.com", "124578963", 22, "M", "Java Full Stack");
		student.add(kanna);
		System.out.println(student.size());
		int n=student.size();
		System.out.println("Name : "+student.get(n-1).names+"\n"+"Email : "+student.get(n-1).email+"\n"+"Mobile Number : "+student.get(n-1).moblieNumber+"\n"+"Age : "+student.get(n-1).age+"\n"+"Gender : "+student.get(n-1).gender+"\n"+"Course : "+student.get(n-1).course+"\n\n");

		//System.out.println(amzn.student.get(5).names);
		
	Employee sunil=new Employee("Sunil", "sunil@gmail.com", "4578963114", "B22-1");
	Employee ramakrishna=new Employee("Rama Krishna", "ramakrishna@gmail.com", "4578963114", "B22-2");
	Employee divakar=new Employee("Divakar", "divakar@gmail.com", "4578963114", "B22-3");
	Employee vali=new Employee("Vali", "vali@gmail.com", "4578963114", "B22-4");
	Employee pavan=new Employee("pavan", "pavan@gmail.com", "4578963114", "B22-5");
	
	
	
	empArrayList.add(sunil);
	empArrayList.add(ramakrishna);
	empArrayList.add(divakar);
	empArrayList.add(vali);
	empArrayList.add(pavan);
	
	
	
	Employee satish=new Employee("Satish", "satish@gmail.com", "4587123694", "B22-6");
	
	System.out.println(amzn.employee.get(2).name);
	

}
	}


