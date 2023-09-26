package DuplicatesNames;
import java.util.ArrayList;


public class duplicates {
	public static void main(String[] args) {
		int count;
		ArrayList<String> names = new ArrayList();
		names.add("Sunanda");
		names.add("Sindhu");
		names.add("Kavitha");
		names.add("Chandini");
		names.add("Satya");
		names.add("Chandini");
		names.add("Balaji");
		names.add("Satwik");
		names.add("Satwik");
		names.add("Satwik");
		names.add("Satish");
		names.add("Pavan");
		names.add("Lakki");
		names.add("Valli");
		names.add("Raki");
		names.add("Divakar");
		names.add("Divakar");
		names.add("Divakar");
		names.add("Pavan");
		names.add("Pavan");
			 for(int i = 0; i < names.size(); i++) {
	            for (int j = i + 1; j < names.size(); j++) {
	                if(names.get(i)==(names.get(j))) {  
				
					System.out.println(names.get(i));
					
					
	                }
			}
		}
	    		for(int i=0;i<names.size();i++) 
	    			 
	    			for(int j=i+1;j<names.size();j++) {
	    				if(names.get(i)== names.get(j)) {
	    					names.remove(j);
	    					j--;
	    				}
	    				
	    			}
	    		System.out.println();
	    		System.out.println("Removing Duplicate names :");
	    		for(int i=0; i<names.size(); i++) {
	    			System.out.println(names.get(i));
	    		}		
	}

	}

