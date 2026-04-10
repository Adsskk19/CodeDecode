//9. Print a Fibonacci series using recursion?
package com;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10;

		for (int i = 0; i <= n; i++) {
			System.out.print(fibonacci(i)+" ");
		}
		System.out.println();
		oldMethod(n);
	}

	public static int fibonacci(int n) {
		if (n <= 1) 	return n;
		return fibonacci(n - 1) + fibonacci(n - 2);

	}

	
	
	
	public static void oldMethod(int n){
		
		int num1=0,num2=1;
		for(int i=0;i<=n;i++) {
			System.out.print(num1+",");
			int num3=num1+num2;
			num1 = num2;
			num2 = num3;
			
		}
		
		
		
	}
	
	
}
