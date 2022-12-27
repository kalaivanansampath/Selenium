package com.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapFindMostDuplicateNumber {
	// Find the most duplicate number -> First most duplicate
	/*
	 * input: abbaba output: b
	 * Psuedocode:
	 * 
	 * a) Map -> HashMap b) String -> ch[] -> Get all the character -> occurance c)
	 * Keep comparing the occurance with other values -> max value -> character * 
	 */

	public static void main(String[] args) {
		String str = "abbabaccb";
		char[] charArray = str.toCharArray();

		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (map.containsKey(charArray[i])) {
				Integer existingcount = map.get(charArray[i]);
				map.put(charArray[i], existingcount + 1);
			} else {
				map.put(charArray[i], 1);
			}
		}
		System.out.println(map);

		Set<Integer> set1 = new TreeSet<>(map.values());
		List<Integer> list1 = new ArrayList<>(set1);
		int setSize = set1.size();
		int setMax = list1.get(setSize - 1);
		System.out.println(setMax);

		for (Map.Entry<Character, Integer> entry : map.entrySet())
			if (entry.getValue() == setMax) {
				System.out.println("Most Duplicate Key = " + entry.getKey() + ", Most no of occurence = " + entry.getValue());
			}
	}

}
