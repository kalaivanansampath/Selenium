package com.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListMissingNumber {

	public static void main(String[] args) {
		/*
		 * Problem
		 * 
		 * There will be running number between 1 to 10 One of the unique number will be
		 * missing Find the missing number
		 * 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set b) Make sure the set is in the ascending
		 * order c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */

		int[] data = { 21, 22, 23, 24, 25, 27, 28, 29, 30 };
		Set<Integer> setData = new TreeSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			setData.add(data[i]);
		}
		System.out.println(setData);

		List<Integer> listData = new ArrayList<Integer>(setData);

		for (int j = 0; j < listData.size(); j++) {
			if ((listData.get(j + 1) - listData.get(j)) == 1) {
				j++;
			} else {
				System.out.println("Missing Value is: " + (listData.get(j) + 1));
			}
		}

	}

}