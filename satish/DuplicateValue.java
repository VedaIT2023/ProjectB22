package com.vedait.Basic.Operations;
import java.util.*;

public class DuplicateValue {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
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

        ArrayList<String> duplicateNames = new ArrayList();
        ArrayList<Integer> index = new ArrayList();
        

        for (int i = 0; i < names.size(); i++) {
            int count = 0;
            
            for (int j = i+1; j < names.size(); j++) {
                if (names.get(i)==names.get(j)) {
                    count++;
                    index.add(j);
                    break;
                }
            }
            
            if (count==1) {
                duplicateNames.add(names.get(i));
            }
        }

        for (int i =0; i<duplicateNames.size(); i++) {
        	System.out.println("Name:" +duplicateNames.get(i)+"\nIndex Value : "+index.get(i));
        }
    }
}
