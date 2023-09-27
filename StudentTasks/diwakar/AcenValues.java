public class AcenValues {
    public static void main(String[] args) {
    
   int num[] = { 9,8,7,6,5,4,3,2,1};
   int Sc = 0;
   System.out.println( "enter original values");
   for(int i=0;i<num.length;i++){
   	System.out.println(num[i]+ " ");
}
	for(int i=0;i<num.length;i++){
 	for( int j=i+1;j<num.length;j++){
        	if(num[i] > num[j]){
		Sc =num[i];
                num[i] = num[j];
 		num[j] = Sc;
  }
}

  }
                System.out.println();

		System.out.println( "enter ascending order values");
                
  			for(int i=0;i<num.length;i++){

   				System.out.println(num[i]+ " ");
    }
  }
}