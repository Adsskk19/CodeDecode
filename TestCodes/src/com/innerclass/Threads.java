package com.innerclass;

public class Threads {
	
	public static void main(String[] args) {
//		Thread1 thread1 = new Thread1();
//		Thread t = new Thread(thread1);
//		t.start();
		
		Runnable thread2 = new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("Thread-Ankam---My second thread");
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread t2= new Thread(thread2);
		t2.start();
		
		Runnable thread3 =  ()-> {
			
		
			Thread.currentThread().setName("Thread-Durga---My Third thread");
			System.out.println(Thread.currentThread().getName());
			
		};
		Thread t3= new Thread(thread3);
		t3.start();
		
	}

}










class Thread1 implements Runnable{

	@Override
	public void run() {
		Thread.currentThread().setName("Thread-Kiran---");
		System.out.print(Thread.currentThread().getName());
		System.out.println("My first thread");
	}
	
}