public class ListOfIndia {
	public static void main(String[] args) {
	
	String States[] = {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat","Jammu and Kashmir", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"};
	String Capitals[] = {"Amaravathi", "Itanagar", "Dispur", "Patna", "Raipur", "Panaji", "Gandinagar", "Srinagar", "Chandigarh", "Shimla", "Ranchi", "Bangalore", "Thiruvunanthapuram", "Bhopal", "Mumbai", "Imphal","Shillong", "Aizwal","Kohima", "Bhubaneswar","Chandigarh", "Jaipur", "Gangtok", "Chennai", "Hyderabad", "Agarthala", "Lucknow", "Dehradun", "kolkata"};
	long Area[] = {162968, 83743, 78438, 94163, 135192, 3702, 196244, 42241, 44212, 55673, 79716, 191791, 38852, 308252, 307713, 22327, 22429, 21081, 16579, 155707, 50362, 342239, 7096, 130060, 112077, 10486, 240928, 53483, 88752};
	long Population[] = {91702478, 1711947, 35998752, 128500364, 1158040, 1521992, 70400153, 14999397, 28900667, 7503010, 40100376, 69599762, 34698876, 85002417, 124904071, 34369483, 772103, 1308967, 2073074, 47099270, 30501026, 79502477, 658019, 83697770, 38157311, 4184959, 231502578, 11700099, 100896618};
	System.out.println("No of States in India is:" + States.length);
    	System.out.println("No of Capitals in India is:" + Capitals.length);
   	System.out.println("=========LIST OF INDIAN STATES AND CAPITALS POPULATION BY THEIR AREA IN SQKM========");
		
	
	System.out.println("------------------------------------------------------------------------------------");
	System.out.println("| STATES\t    | CAPITALS\t\t | AREA(sqkm)\t      | POPULATION\t   |");
	System.out.println("------------------------------------------------------------------------------------");
	for (int i=0;i<States.length;i++) {
		System.out.printf("| %-17s | %-18s | %-18d | %-18d |%n",States[i],Capitals[i],Area[i],Population[i]);
		
	
	}
	System.out.println("------------------------------------------------------------------------------------");
	long a1 = 0;
	for(int i=0;i<Area.length;i++) {
		a1 = Area[i] + a1;
	}
	System.out.println("Total Area in Sqkm is :" + a1);
	long b1 = 0;
	for(int i=0;i<Population.length;i++) {
		b1 = Population[i] + b1;
		}
	System.out.println("Total Population of India is:" + b1);
    }
}