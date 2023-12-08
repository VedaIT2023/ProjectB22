package com.practise.rivision;

public class MyThread extends Thread {

	private String name;
	
	public void run() {
		this.runaLoop();
	}
	
	public void runaLoop() {
		for(int i=0;i<10;i++) {
			System.out.println(this.name + " " + i);
		}
	}
	
	
	
	MyThread(String name){
		this.name = name;
	}
	
}
