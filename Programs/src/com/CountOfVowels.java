//5.How do you calculate the number of vowels and consonants in a String?
package com;

public class CountOfVowels {
	
	public static void main(String[] args) {
		String str = "Hello World";
		vowelCount(str);
	}
	private static void vowelCount(String str) {
		int vowels = 0 , consonants = 0;
		for(int i =0; i<str.length();i++) {
			char ch = Character.toLowerCase(str.charAt(i));
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}else if(ch>='a' && ch<='z'){
				consonants++;
			}
		}
		System.out.println("Count of Vowels: "+vowels);
		System.out.println("Count of Consonants: "+consonants);
	}

}
