import java.util.*;
public class Orders{
	public static void main(String[] args){
	int[] a = {5,7,3,8,29,23};
	int temp;
	for(int i=0;i<a.length;i++){
		for(int j=i;j<a.length;j++){
		if(a[i] > a[j]) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			}
		}
	}
	System.out.println("Assending Order:" + Arrays.toString(a));
	for(int i=0;i<a.length;i++){
		for(int j=i;j<a.length;j++){
		if(a[i] < a[j]) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			}
		}
	}
	System.out.println("Desending Order:" + Arrays.toString(a));
}
}