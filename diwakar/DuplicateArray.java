public class DuplicateArray{

	public static void main(String[] args){
		int arr[] = {12,56,43,12,43,89};
		int d [] = new int[arr.length];
		int count= 0;
		int c=0;
		for(int i=0; i<arr.length; i++){
			int a= arr[i];
			boolean is=false;
			for(int j=i+1; j<arr.length; j++){
				if(a==arr[j]){
				is=true;
}
}
		if(!is){
		d[count]=a;
		count++;
		}else{System.out.println("duplicate number"+a);
		c++;
}
		}
		System.out.println("number of duplicate"+c);
		for(int i=0; i<count; i++){
		System.out.println(d[i]+" ");
	}
}
}