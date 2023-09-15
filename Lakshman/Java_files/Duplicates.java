public class Duplicates{
	public static void main(String[] args){
	int num[]={5,2,8,4,2,5,6,7,8};
	System.out.println("Duplicates are :");
	for(int i=0;i<num.length;i++){
         for(int j=i+1;j<num.length;j++){
            if(num[j]==num[i]){
		  System.out.println(j);
	}
	}
	}
	
}
}