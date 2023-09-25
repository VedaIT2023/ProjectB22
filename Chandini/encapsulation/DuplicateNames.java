package encapsulation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateNames {
    public static void main(String[] args) {
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

        Map<String, ArrayList<Integer>> nameIndexMap = new HashMap<>();

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (!nameIndexMap.containsKey(name)) {
                nameIndexMap.put(name, new ArrayList<Integer>());
            }
            nameIndexMap.get(name).add(i);
        }
        for (Map.Entry<String, ArrayList<Integer>> entry : nameIndexMap.entrySet()) {
            String name = entry.getKey();
            ArrayList<Integer> indexes = entry.getValue();
            if (indexes.size() > 1) {
                System.out.println(name + " : " + indexes);
            }
        }
    }
}
