package com.walkin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Test {
	
	public static void main(String[] args) {
//		String str = reverseString();
//		nonRepeatedChar();
//		splitArray();
		
		
		
		
	}

	private static void splitArray() {
		//3.split the array
		String s = "Hi this is java class";
		String[] splitArray = s.split(" ");
		System.out.println(Arrays.toString(splitArray));
	}
	private static void nonRepeatedChar() {
		//2.Find first non-repeated character
		
	}
	private static String reverseString() {
		//1.Reverse a string without using built-in methods
		String str = "KiranKumar";
		for(int i =str.length()-1; i>=0;i--) {
			char a = str.charAt(i);
			System.out.print(a);
		}
		return str;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
