package com.practise.rivision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamsMain {
	
	public static ArrayList<DocStreams> docList;

	public static void main(String[] args) {
		System.out.println("Hello World");
		docList = new ArrayList<DocStreams>();
		// TODO Auto-generated method stub
		for(int i=0; i<100; i++) {
			String name = "a";
			name += + i; 
			int exp = 5;
			exp += i;
			int price = 100;
			price += i;
			DocStreams d = new DocStreams(name, "", exp, price);
			docList.add(d);
		}
	
//		for (DocStreams doc : docList) {
//			
//			System.out.println(doc.name);
//			System.out.println(doc.price);
//			System.out.println(doc.experience);
//			System.out.println();
//		}
//		docList.remove(3);
//		docList.remove(6);
//		
//		SortedSet<DocStreams> sr = new TreeSet<DocStreams>(docList);
		
//			for (DocStreams doc : sr) {
//			
//			System.out.println(sr);
//			System.out.println(doc.price);
//			System.out.println(doc.experience);
//			System.out.println();
//		}
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(6);
		num.add(5);
		num.add(4);
		num.add(10);
		num.add(9);
		num.add(8);
		num.add(7);
		num.add(7);
		num.add(7);
		num.add(7);
		
		
		
		
		System.out.println(num.stream()
				.filter(a->a>=7)
				.distinct()
				.filter(n->n%2==0)
				.collect(Collectors.toList()));
		
				
//		filter,distinct,map,flatmap,reduce
		
		List<DocStreams> d = 
				docList.stream()
				.filter(n->n.price>=120)				
				.filter(a->a.experience > 36)
				.collect(Collectors.toList());
		
		for (DocStreams docStreams : d) {
			System.out.println(docStreams.name);
			System.out.println(docStreams.price);
			System.out.println(docStreams.experience);
			System.out.println();
		}
		
		List<String> updatedD = 
				docList.stream()
				.map(obj->obj.name = "Dr. " + obj.name)
				.collect(Collectors.toList());
		
		for (String string : updatedD) {
			System.out.println(string);
		}
	}
	
}