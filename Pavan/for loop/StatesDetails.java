public class StatesDetails{
	public static void main(String[] args){
	String States[]= {"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};

	String Capitals[]= {"Amaravathi","Itanagar","Dispur","Patna","Raipur","Panaji","GandhiNagar","Chandigarh","Shimla","Ranchi","Bengaluru","Thiruvananthapuram","Bhopal","Mumbai","Imphal","Shillong","Aizawal","Kohima","Bhubaneswar","Chandigarh","Jaipur","Gangtok","Chennai","Hyderabad","Agartala","Lucknow","Dehradun","Kolkata"};

	long Area[]={162968,83743,78438,94163,135191,3702,196024,44212,55673,79714,191791,38863,308245,307713,22327,22429,21081,16579,155707,50362,342239,7096,130058,112077,10486,240928,53483,88752};

	long Population[]={91702478,1711947,35998752,128500364,32199722,1521992,70400153,28900667,7503010,40100376,69599762,34698876,85002417,124904071,3436948,3772103,1308967,2073074,47099270,30501026,79502477,658019,83697770,38157311,4184959,231502578,11700099,100896618};

	System.out.println("-------------------------------------------------------------------------------------");
	System.out.println("|   STATES\t    |     CAPITALS       |     AREA(in Sqkm)    |    POPULATION     |");
	System.out.println("-------------------------------------------------------------------------------------");
	for(int i=0;i<States.length;i++){
		System.out.printf("| %-17s | %-18s |  %-18d  | %-18d|%n",States[i],Capitals[i],Area[i],Population[i]);
}
	System.out.println("-------------------------------------------------------------------------------------");
}
}