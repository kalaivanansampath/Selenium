package com.List;

import java.util.Map;
import java.util.TreeMap;

public class MapFindNumberOfOccurances {
	// Assignment2: FindNumbersOccurances

	/*
	 * * Input array numbers, each occurances
	 * 
	 * input: {2,3,5,6,3,2,1,4,2,1,6,-1}; output: 2 -> 3 , 3 -> 2, 4 -> 1 * Order:
	 * Ascending Order
	 */

	/*
	 * * Psuedcode: * a) Create Map -> TreeMap b) For loop -> each number -> add to
	 * the map c) If it is exist -> update it with + 1 Else -> new entry with 1 as
	 * value
	 **/

	public static void main(String[] args) {
		int[] no = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };

		Map<Integer, Integer> iterationNo = new TreeMap<Integer, Integer>();

		for (int i = 0; i < no.length; i++) {
			if (iterationNo.containsKey(no[i])) {
				Integer existingcount = iterationNo.get(no[i]);
				iterationNo.put(no[i], existingcount + 1);
			} else {
				iterationNo.put(no[i], 1);
			}
		}
		System.out.println(iterationNo);
	}
}