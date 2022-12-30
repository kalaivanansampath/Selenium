package com.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapLuckyInteger {

	public static void main(String[] args) {
		int[] no = {2,2,3,4};

		Map<Integer, Integer> iterationNo = new TreeMap<Integer, Integer>();

		for (int i = 0; i < no.length; i++) {
			if (iterationNo.containsKey(no[i])) {
				Integer existingcount = iterationNo.get(no[i]);
				iterationNo.put(no[i], existingcount + 1);
			} else {
				iterationNo.put(no[i], 1);
			}
		}
		
		Set<Integer> set1 = new TreeSet<>(iterationNo.values());
		List<Integer> list1 = new ArrayList<>(set1);
		Set<Integer> set2 = new TreeSet<>();
		int setSize = set1.size();

		boolean luckyNumber = true;

		for (Map.Entry<Integer, Integer> entry : iterationNo.entrySet())
			if (entry.getKey() == entry.getValue()) {
				set2.add(entry.getValue());
			}
		

		if (set2.isEmpty()) {
			luckyNumber = false;
			System.out.println(luckyNumber + " : Lucky Number is not avaialble ");
		} else {
			int listSize = set2.size();
			List<Integer> list2 = new ArrayList<>(set2);
			System.out.println(luckyNumber + " : Lucky Number is avaialble and Key is = " + list2.get(listSize - 1));
		}

	}
}
