//Find the number of occurrences of a character in a String?
package com;

public class Occurences {
	public static void main(String[] args) {

		repeatedLetter1();
		
		repeatedLetter();

	}

	private static void repeatedLetter1() {
		String str = "Hello Java";
		char ch = 'a';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}

		System.out.println("Total occurences: " + count);
	}

	public static void repeatedLetter() {
		
		String str = "geeksforgeeks";
		char c = 'e';
		int count =0;
		for(int i =0;i<str.length();i++) {
			if(c== str.charAt(i)) {
				count++;
			}
		}
		System.out.println("Total Ocuurences: "+count);
		

	}

}
