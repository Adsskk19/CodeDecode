//1.How do you reverse a string in Java?
package com;

public class ReverseString {
	public static void main(String[] args) {
		
		
		String str = "Hello Welcome";
		System.out.println(str.length());
		
		for(int i =str.length()-1;i>=0 ;i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
		System.out.println();
		
		StringBuffer stb = new StringBuffer("Kiran Kumar");
		
		System.out.println(stb.reverse());
		
		
	}

}
