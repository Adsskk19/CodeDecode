//8. How would you swap two numbers without using a third variable?
package com;

public class Swapping {

	public static void main(String[] args) {
	
		swapNumbers();

	}

	private static void swapNumbers() {
		int a = 5, b = 10;
		System.out.println("Before swapping: " + "a: " + a + " b: " + b);
		a = a + b;// a=15
		b = a - b;// b=5
		a = a - b;// 15-5 = 10
		System.out.println("After swapping: " + "a: " + a + " b: " + b);
	}

}
