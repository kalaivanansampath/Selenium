package com.List;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ListNumberOfOccurrencesUnique {

	/*
	 * Example 1: Input: arr = [1,2,2,1,1,3] Output: true Explanation: The value 1
	 * has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of
	 * occurrences.
	 */

	public static void main(String[] args) {
		int[] arrNo = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arrNo.length; i++) {
			if (map.containsKey(arrNo[i])) {
				Integer existingcount = map.get(arrNo[i]);
				map.put(arrNo[i], existingcount + 1);
			} else {
				map.put(arrNo[i], 1);
			}
		}

		boolean result = true;
		Set<Integer> set = new HashSet<Integer>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (!(set.add(entry.getValue()))) {
				result = false;
			}
		}
		System.out.println(result);
	}

}
