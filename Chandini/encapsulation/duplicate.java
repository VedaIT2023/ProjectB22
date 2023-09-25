package collections;

import java.util.ArrayList;

public class duplicate {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<String>();
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
      ArrayList<String> names1 = new ArrayList<String>();

      for(int i=0;i<names.size();i++){
        int count=0;
        for(int j=i+1;j<names.size();j++){
                  
             if(names.get(i)==names.get(j)){
                 count=+1;
                
             }      
        }
             if(count==0){
                names1.add(names.get(i));
            }
         
      
    }
   
    System.out.println(names1);
    }
}
