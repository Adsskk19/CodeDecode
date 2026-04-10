package com.innerclass;

public interface Vehicle {
	
	void start();
	void stop();
	public default void horn() {
		System.out.println("Horn Horn side please!");
	}

}
