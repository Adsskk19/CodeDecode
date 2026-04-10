// How do you determine if a string is a palindrome?
package com;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str = "level";
		String str1 ="";
		for(int i =str.length()-1;i>=0;i--) {
			char result = str.charAt(i);
			str1+=result; //concatenation
			
		}
		System.out.println(str1);
		
		if(str.equals(str1)) {
			System.out.println("It is palindrome:  "+ str.equals(str1));
		}else {
			System.out.println("Given String Not a palindrome");
		}
		
	}

}
