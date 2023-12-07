package com.practise.rivision;

public class MyThread extends Thread {

	private String name;
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(this.name + " " + i);
		}
	}
	
	MyThread(String name){
		this.name = name;
	}
	
}
