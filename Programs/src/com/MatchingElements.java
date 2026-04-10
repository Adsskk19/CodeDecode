//6.How do you get the matching elements in an integer array?
package com;

import java.util.HashSet;

public class MatchingElements {

	public static void main(String[] args) {

		matchingElements();
	}

	private static void matchingElements() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 5, 6, 7 };

		HashSet<Integer> set = new HashSet<>();

		for (int num : arr1) {
			set.add(num);
		}

		System.out.println("matching elements are:  ");
		for (int num : arr2) {

			if (set.contains(num)) {

				System.out.print(num + " ");
			}

		}

	}

}
