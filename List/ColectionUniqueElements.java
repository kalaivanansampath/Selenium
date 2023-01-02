package com.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ColectionUniqueElements {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 2 };
		Set<Integer> setData = new TreeSet<Integer>();
		Set<Integer> setData1 = new TreeSet<Integer>();
		/*
		 * You are given an integer array nums. The unique elements of an array are the
		 * elements that appear exactly once in the array. Return the sum of all the
		 * unique elements of nums. Example 1: Input: nums = [1,2,3,2] Output: 4
		 * Explanation: The unique elements are [1,3], and the sum is 4.
		 * 
		 */
		for (int i = 0; i < data.length; i++) {
			if (!(setData.add(data[i]))) {
				setData1.add(data[i]);
			}
		}

		List<Integer> listData = new ArrayList<Integer>(setData);
		List<Integer> listData1 = new ArrayList<Integer>(setData1);
		for (int j = 0; j < listData1.size(); j++) {
			for (int k = 0; k < listData.size(); k++) {
				if (listData1.get(j) == listData.get(k)) {
					listData.remove(k);
				}
			}
		}

		if (listData.isEmpty()) {
			System.out.println("There is no Unique element");
		} else {

			int count = 0;
			for (int l = 0; l < listData.size(); l++) {
				count = count + listData.get(l);
			}

			System.out.println("There is Unique element" + listData + " and Sum of unique value is : " + count);
		}
	}

}
