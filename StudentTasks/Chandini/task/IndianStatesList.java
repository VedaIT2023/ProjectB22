import java.util.*;
public class IndianStatesList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter state code(ENTER IN CAPITAL LETTERS ONLY) : ");
        String code=sc.nextLine(); 
        String[][] indianStates = {
            {"AP", "Andhra Pradesh"},
            {"AR", "Arunachal Pradesh"},
            {"AS", "Assam"},
            {"BR", "Bihar"},
            {"CT", "Chhattisgarh"},
            {"GA", "Goa"},
            {"GJ", "Gujarat"},
            {"HR", "Haryana"},
            {"HP", "Himachal Pradesh"},
            {"JH", "Jharkhand"},
            {"KA", "Karnataka"},
            {"KL", "Kerala"},
            {"MP", "Madhya Pradesh"},
            {"MH", "Maharashtra"},
            {"MN", "Manipur"},
            {"ML", "Meghalaya"},
            {"MZ", "Mizoram"},
            {"NL", "Nagaland"},
            {"OR", "Odisha"},
            {"PB", "Punjab"},
            {"RJ", "Rajasthan"},
            {"SK", "Sikkim"},
            {"TN", "Tamil Nadu"},
            {"TG", "Telangana"},
            {"TR", "Tripura"},
            {"UP", "Uttar Pradesh"},
            {"UT", "Uttarakhand"},
            {"WB", "West Bengal"},
            {"AN", "Andaman and Nicobar Islands"},
            {"CH", "Chandigarh"},
            {"DN", "Dadra and Nagar Haveli and Daman and Diu"},
            {"DL", "Delhi"},
            {"LA", "Ladakh"},
            {"LD", "Lakshadweep"},
            {"PY", "Puducherry"}
        };
        for (int i = 0; i < indianStates.length; i++) {
            if(indianStates[i][0].equals(code)){
            String stateName = indianStates[i][1];
            System.out.println("State Name: " + stateName);
            }
        }
    }
}
