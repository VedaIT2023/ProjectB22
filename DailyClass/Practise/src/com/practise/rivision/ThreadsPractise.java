package com.practise.rivision;

import java.util.ArrayList;

public class ThreadsPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t1 = new MyThread("Thread 1");
		t1.start();
		
		MyThread t2 = new MyThread("Thread 2");
		t2.start();
		
		
		
	}
	

}
