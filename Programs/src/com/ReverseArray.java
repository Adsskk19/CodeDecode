//7.How do you reverse an array?
package com;

public class ReverseArray {

	public static void main(String[] args) {
		
		reverseArray();
	}

	private static void reverseArray() {
		int [] arr1 = {1,2,3,4,5};
		System.out.println("Reversed Array");
		for(int i=arr1.length-1;i>=0;i--) {
			System.out.print(arr1[i]+" ");
		}

	}

}
