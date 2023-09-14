
import java.util.ArrayList;

public class DataLogis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"Sindhu","Kavitha","Sunanda","Narendra","Lakshman"};
		String email[] = {"Sindhu@gmai","Kavitha@asgdh","Sunanda@gmail","nari@gmail.com","laki@gmail.com"};
		int age[] = {1,2,3,4,3};
		
		ArrayList<Employee> employees = new ArrayList(); 
		for(int i = 0; i<names.length ; i++) {
			Employee emp = new Employee(names[i],email[i],age[i]);
			employees.add(emp);
		}
		
		System.out.println(employees.size());
		
		for(int i=0;i<employees.size();i++) {
			System.out.println(employees.get(i).name);
		}
	}

}
