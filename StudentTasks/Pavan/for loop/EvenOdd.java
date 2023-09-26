public class EvenOdd{
    public static void main(String[] args){
    int rollnumbers[] = {34,49,56,7,33,7,18,45,84,9,62,23,7,5,8,3,2,30,107,003};
    int a=rollnumbers.length;


    System.out.println("size of array:" +a);
    System.out.println("Even numbers:");
    for(int i=0;i<a;i++){
        if(rollnumbers[i]%2==0){
            System.out.println(rollnumbers[i]);
          } 
     }


    System.out.println("Odd numbers:");
    for(int i=0;i<a;i++){
        if(rollnumbers[i]%2!=0){ 
             System.out.println(rollnumbers[i]);
          }

    }

	
}
}