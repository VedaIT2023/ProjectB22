
import java.util.*;
public class OrdersWhile{
	public static void main(String[] args){
	int number[] = {23,12,45,19,43};
	int i=0;
	int temp;
	while(i < number.length){
		int j = i+1;
		while(j < number.length){
			if(number[i] > number[j]){
			temp = number[i];
			number[i] = number[j];
			number[j] = temp;
			}
			j++;
		}
		i++;
	}
	System.out.println("Assending Order:");
	int k=0;
	while(k<number.length){
		System.out.println(number[k] + " ");
			k++;
	}
	System.out.println("Desending Order:");
	int n=number.length-1;
	while(n>=0){
		System.out.println(number[n] + " ");
			n--;
	}
}
}