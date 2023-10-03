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

        ArrayList<String> duplicateNames = new ArrayList<>();
        ArrayList<ArrayList<Integer>> duplicateIndices = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            boolean isDuplicate = false;

            for (int j = i + 1; j < names.size(); j++) {
                if (name.equals(names.get(j))) {
                    isDuplicate = true;

                    if (!duplicateNames.contains(name)) {
                        duplicateNames.add(name);
                        ArrayList<Integer> indices = new ArrayList<>();
                        indices.add(i);
                        indices.add(j);
                        duplicateIndices.add(indices);
                    } else {
                        int index = duplicateNames.indexOf(name);
                        duplicateIndices.get(index).add(j);
                    }
                }
            }

            if (isDuplicate && !duplicateNames.contains(name)) {
                duplicateNames.add(name);
                ArrayList<Integer> indices = new ArrayList<>();
                indices.add(i);
                duplicateIndices.add(indices);
            }
        }

        // Print duplicates and their indices
        for (int i = 0; i < duplicateNames.size(); i++) {
            System.out.println("Name: " + duplicateNames.get(i) + "\nIndex Values: " + duplicateIndices.get(i));
        }
    }
}
