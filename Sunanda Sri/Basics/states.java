  public class indiastates {
    public static void main(String[] args) {
    String states[]={"Andhra Pradesh","Telangana","Goa","Haryana","Kerala"};
    String capital[]={"Amaravati","Hyderabad","Panaji","Chandigarh","Thiruvananthapuram"};
    double area[]={162975.0, 112077.0,3702.0,44212.0,38863};
    long population[]={53903393,39362732,154203,28204692,36475649}; 
    System.out.println("STATES and CAPITAL and AREA and POPULATION: ");
    for(int i = 0; i < states.length; i++) {
         System.out.println(states[i]+"-"+capital[i]+"-"+area[i]+"-"+population[i]);  
        }
    }
}