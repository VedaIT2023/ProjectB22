import java.util.*;


public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("Raki");
		names.add("valli");
		names.add("Divakar");
		
		try {
			int num = 10;
			System.out.println(names.get(0));
			System.out.println(names.get(3));
		}catch(Exception e) {
			System.out.println(e.toString());
		}
				
		System.out.println("Code Completed");
		
				
	}

}
