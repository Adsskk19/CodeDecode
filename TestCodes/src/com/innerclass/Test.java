package com.innerclass;

public class Test {
	
	public static void main(String[] args) {
		
		
		Vehicle bike = new Bike();
		bike.start();
		bike.stop();
		
		
		
		Vehicle car = new Vehicle() {
			
			@Override
			public void stop() {
				System.out.println("Car Started");
			}
			
			@Override
			public void start() {
				System.out.println("Car Stopped");
			}
		};
		
		car.start();
		car.stop();
		
		
	}

}
