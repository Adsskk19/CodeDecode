package com.coding.problems;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		// 1.Reversing a String
		// reverseString("Kiran");
		
		StringBuffer str = new StringBuffer("Kumar");
		System.out.println(str.reverse());
		
	}

	private static void reverseString(String input) {
		String result = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			result = result + input.charAt(i);

		}

		System.out.println(result);
	}
	
	//2. Find Duplicate Characters in a String
	public static void findDuplicates(String input) {
		char[] charArray = input.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		
		
		
	}
	
	
	

}
