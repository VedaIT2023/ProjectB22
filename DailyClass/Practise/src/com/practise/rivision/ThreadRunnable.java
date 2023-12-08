package com.practise.rivision;

public class ThreadRunnable implements Runnable {

	private boolean even;
	
	
	public void run() {
		
		for(int i=1;i<=10;i++) {
			if(this.even) {
				if(i%2==0) {
					System.out.println("Even number " + i);
				}
			}else {
				if(i%2!=0) {
					System.out.println("Odd number " + i);
				}
			}
			
		}
		
	}
	
	ThreadRunnable(boolean even){
		this.even = even;
	}
	
	
	
}
