package com.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapLuckyInteger {

	public static void main(String[] args) {
		int[] no = { 2, 2, 3, 4 };

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i = 0; i < no.length; i++) {
			if (map.containsKey(no[i])) {
				Integer existingcount = map.get(no[i]);
				map.put(no[i], existingcount + 1);
			} else {
				map.put(no[i], 1);
			}
		}

		boolean luckyNumber = true;
		Set<Integer> set = new TreeSet<>();

		for (Map.Entry<Integer, Integer> entry : map.entrySet())
			if (entry.getKey() == entry.getValue()) {
				set.add(entry.getValue());
			}

		if (set.isEmpty()) {
			luckyNumber = false;
			System.out.println(luckyNumber + " : Lucky Number is not avaialble ");
		} else {
			int listSize = set.size();
			List<Integer> list = new ArrayList<>(set);
			System.out.println(luckyNumber + " : Lucky Number is avaialble and Key is = " + list.get(listSize - 1));
		}

	}
}
