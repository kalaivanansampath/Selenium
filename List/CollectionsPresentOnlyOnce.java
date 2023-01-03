package com.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsPresentOnlyOnce {
	public static void main(String[] args) {

		/*
		 * Java Problem (18/20)* A distinct string is a string that is present only once
		 * in an array. Given an array of strings arr, and an integer k, return the kth
		 * distinct string present in arr. If there are fewer than k distinct strings,
		 * return an empty string "". Note that the strings are considered in the order
		 * in which they appear in the array. Example 1: Input: arr =
		 * ["d","b","c","b","c","a"], k = 2 Output: "a" Explanation: The only distinct
		 * strings in arr are "d" and "a". "d" appears 1st, so it is the 1st distinct
		 * string. "a" appears 2nd, so it is the 2nd distinct string.
		 */

		String[] arr = { "d", "b", "c", "b", "c", "a" };
		int k = 2;

		Set<String> setData = new LinkedHashSet<String>();
		Set<String> setData1 = new LinkedHashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			if (!(setData.add(arr[i]))) {
				setData1.add(arr[i]);
			}
		}

		List<String> listData = new ArrayList<String>(setData);
		List<String> listData1 = new ArrayList<String>(setData1);

		for (int j = 0; j < listData1.size(); j++) {
			for (int l = 0; l < listData.size(); l++) {
				if (listData1.get(j) == listData.get(l)) {
					listData.remove(l);
				}
			}
		}
		if (listData.size() < k) {
			System.out.println("Empty Data");
		} else {
			System.out.println(listData.get(k - 1));
		}

	}
}
