public class Aug21 {
	public static void main(String[] args){
		int a[] = {15,54,55,44,55,22,11,23,22,5,47,47,69,58,78,};
		int b[] = {};	
		for(int i=0; i<a.length;i++){
		for(int j=1; j<b.length;j++){
			if (a[i] == a[j]){
		b[j].add(a[j]);
		}
  }
}
		System.out.println(b);		
		
	}
}