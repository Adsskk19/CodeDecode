package com.threads;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		EvenThread evenThread = new EvenThread();
		evenThread.start();
		evenThread.wait();
		
		
		OddThread oddThread = new OddThread();
		oddThread.start();
		
		
		
	}

}

class EvenThread extends Thread{
	
	public void run() {
		for(int i =0;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even: "+ i);
			}
		}
	}
}
class OddThread extends Thread{
	
	public void run() {
		for(int i =0;i<=10;i++) {
			if(i%2!=0) {
				System.out.println("Odd: "+ i);
			}
		}
	}
}