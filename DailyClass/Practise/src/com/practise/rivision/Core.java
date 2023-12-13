package com.practise.rivision;

public class Core {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer myNameString = new StringBuffer();
		myNameString.append(false);
		myNameString.append(" This is string buffer");
		myNameString.replace(0, 5, "replaced");
				
		System.out.println(myNameString.capacity());
		
		String name = "Hello Java";
		name = name + "Hey";
					
		AnnotClass ann = new AnnotClass();
		ann.deprecatedMethod();			

	}

}
