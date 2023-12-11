package com.practise.rivision;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Regular Expressions practise");
		
		
		
	    
		
       

		String userName = "username@domain.abc";
		
		String userNamePattern =  "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";;
		
		Pattern pattern = Pattern.compile(userNamePattern);
		
	    Matcher matcher = pattern.matcher(userName);

		System.out.println(matcher.matches());
		
		
		Army arm = new Army();
		
		if((arm instanceof SpecialPermissions)) {
			System.out.println("Eligible to defend the country");
		}
//		https://www.vogella.com/tutorials/JavaRegularExpressions/article.html#quantifier
		
//		{}
//		$
//		*
//		[^]
//		.
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
		}
		
		DateTimeFormatter formater =  DateTimeFormatter.ofPattern("\"EEE, MMM d, ''yy\"");
		
		
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date.format(formater));
		
//		https://help.gooddata.com/cloudconnect/manual/date-and-time-format.html
		
		
//		Lambda Expression 
		

		ArrayList<String> namesSet = new ArrayList<String>();
		namesSet.add("Satya");
		namesSet.add("Kavitha");
		namesSet.add("Chandini");
		namesSet.add("Divakar");
		namesSet.add("RamaKrishna");
		namesSet.add("Charan");
		namesSet.add("Satish");
		namesSet.add("Satwik");
		namesSet.add("Balaji");
		namesSet.add("Pavan");
		namesSet.add("Lakshman");
		namesSet.add("Valli");
		
		for(int i=0; i<namesSet.size();i++) {
			
		}
		
		for (String string : namesSet) {
			
		}
		
		namesSet.forEach(str->{
			System.out.println();
		});
		
		
		TreeMap<Integer, String> namesTree = new TreeMap<Integer, String>();
		namesTree.put(3, "Kavitha");
		namesTree.put(4, "Balaji");
		namesTree.put(2, "Lakshman");

		namesTree.forEach((k,v)->{
			System.out.println(v);
		});
		
		
	}

}
