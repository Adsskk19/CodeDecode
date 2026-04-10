//4.How to find out if the given two strings are anagrams or not?
package com;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String str = "silent";
		String str1 = "listen";
		//String str2 = "listonn";
		isAnagram(str,str1);
			
			
		
		
		
	}

	private static void isAnagram(String str,String str1) {
		
		
		
			if(str.length()==str1.length()) {
				char[] char1 = str.toCharArray();
				char[] char2 = str1.toCharArray();
				Arrays.sort(char1);
				Arrays.sort(char2);	
				
				boolean isAnagram = Arrays.equals(char1,char2);
				System.out.println("is Given Strings are Anagrams: "+ isAnagram); 
				
			}else {
				System.out.println("false: Given Strings are Not Anagrams!");
			}
	}

}
