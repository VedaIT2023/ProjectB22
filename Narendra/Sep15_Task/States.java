package Sep15_Task;
import java.util.*;

public class States{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> StatesList = new ArrayList<>();
        System.out.print("Enter the state code : ");
        String stateCode=sc.nextLine();
        stateCode=stateCode.toUpperCase();
        StatesList.add(new String[]{"AP", "Andhra Pradesh"});
        StatesList.add(new String[]{"AR", "Arunachal Pradesh"});
        StatesList.add(new String[]{"AS", "Assam"});
        StatesList.add(new String[]{"BR", "Bihar"});
        StatesList.add(new String[]{"CT", "Chhattisgarh"});
        StatesList.add(new String[]{"GA", "Goa"});
        StatesList.add(new String[]{"GJ", "Gujarat"});
        StatesList.add(new String[]{"HR", "Haryana"});
        StatesList.add(new String[]{"HP", "Himachal Pradesh"});
        StatesList.add(new String[]{"JH", "Jharkhand"});
        StatesList.add(new String[]{"KA", "Karnataka"});
        StatesList.add(new String[]{"KL", "Kerala"});
        StatesList.add(new String[]{"MP", "Madhya Pradesh"});
        StatesList.add(new String[]{"MH", "Maharashtra"});
        StatesList.add(new String[]{"MN", "Manipur"});
        StatesList.add(new String[]{"ML", "Meghalaya"});
        StatesList.add(new String[]{"MZ", "Mizoram"});
        StatesList.add(new String[]{"NL", "Nagaland"});
        StatesList.add(new String[]{"OR", "Odisha"});
        StatesList.add(new String[]{"PB", "Punjab"});
        StatesList.add(new String[]{"RJ", "Rajasthan"});
        StatesList.add(new String[]{"SK", "Sikkim"});
        StatesList.add(new String[]{"TN", "Tamil Nadu"});
        StatesList.add(new String[]{"TG", "Telangana"});
        StatesList.add(new String[]{"TR", "Tripura"});
        StatesList.add(new String[]{"UP", "Uttar Pradesh"});
        StatesList.add(new String[]{"UT", "Uttarakhand"});
        StatesList.add(new String[]{"WB", "West Bengal"});
        StatesList.add(new String[]{"AN", "Andaman and Nicobar Islands"});
        StatesList.add(new String[]{"CH", "Chandigarh"});
        StatesList.add(new String[]{"DN", "Dadra and Nagar Haveli and Daman and Diu"});
        StatesList.add(new String[]{"DL", "Delhi"});
        StatesList.add(new String[]{"LA", "Ladakh"});
        StatesList.add(new String[]{"LD", "Lakshadweep"});
        StatesList.add(new String[]{"PY", "Puducherry"});
        for (String[] stateInfo : StatesList) {
            if(stateCode.equals(stateInfo[0])){
            String stateName = stateInfo[1];
            System.out.println("State Name: " + stateName);
            }
        }
        sc.close();
    }
}

