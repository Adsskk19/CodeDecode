//10.How do you find the factorial of an integer?
package com;

public class Factorial {
	public static void main(String[] args) {
		int n =6;
		int factorial =1;
		for(int i=1;i<=n;i++) {
			factorial*=i;
		}
		System.out.println("factorial of given number is "+factorial);
		
	}

}
