package com.practise.rivision;

public class GenericClass<K> {

	K obj1;
	K obj2;
	
	GenericClass(K obj1, K obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;		
	}
	
	public void swapGeneric() {
		
		Object val1 = obj1;
		Object val2 = obj2;
		
		System.out.println("Before swapping " + val1 + " " + val2);
		
		Object temp = val1;
		val1 = val2;
		val2 = temp;
		
		System.out.println("Before swapping " + val1 + " " + val2);

	}

	
}
