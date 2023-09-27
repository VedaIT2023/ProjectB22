public class IntegersArray{
   public static void main(String[] args){
    int rollnos[]={34,49,56,7,33,7,18,45,84,9,62,23,7,5,8,3,2,30,107,003};
    System.out.print("Even array is:");
    for(int i=0;i<rollnos.length;i++){
       if(rollnos[i]%2==0)
          System.out.print(rollnos[i]+" ");
    }
    System.out.println();
    System.out.print("odd array is:");
     for(int i=0;i<rollnos.length;i++){
        if(rollnos[i]%2!=0)   
          System.out.print(rollnos[i]+" ");      
    }
}
}