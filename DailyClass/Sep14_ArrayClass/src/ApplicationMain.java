import java.util.ArrayList;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Employee sindhu = new Employee("Sindhu","sindhu@gmail.com",20);
		Employee kavitha = new Employee("Kavitha","kavi@gmail.com",20);
		Employee sunanda = new Employee("Sunanda","sun@gmail.com",20);
		Employee pavan = new Employee("Pavan","pav@gmail.com",20);
		Employee satish = new Employee("Satish","sat@gmail.com",20);		
		
		ArrayList<Employee> empArrayList = new ArrayList();
		
		
		empArrayList.add(sindhu);
		empArrayList.add(kavitha);
		empArrayList.add(sunanda);
		empArrayList.add(pavan);
		empArrayList.add(satish);
		
		
		Amgo amg = new Amgo(empArrayList);
		
		System.out.println("No of Employees in AMG " + amg.employees.size());
		
		
		
		
		Employee valli = new Employee("Valli","valli@gmail.com",20);
		
		Employee divakar = new Employee("divakar","divakar@gmail.com",20);
		
		
		amg.employees.add(valli);	
		
		System.out.println("No of Employees in AMG after 1 Month " + amg.employees.size());
		
		
		for(int i=0; i<amg.employees.size();i++) {
			System.out.println(amg.employees.get(i).name);
		}
		
		
		
		System.out.println("\n\n");
		
		for(int i=0; i<amg.employees.size();i++) {
			if(amg.employees.get(i).name == "Valli") {
				amg.employees.remove(i);
			}
			System.out.println(amg.employees.get(i).name);
		}
			
		
		amg.employees.add(2, divakar);
		
		amg.employees.clear();
		System.out.println(amg.employees.size());
		
		
	}

}
