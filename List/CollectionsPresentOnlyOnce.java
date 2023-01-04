package com.List;

import java.util.ArrayList;
import java.util.List;

public class CollectionsCharactersUniqueStrings {
	/*
	 * Given a string array words, return an array of all characters that show up in
	 * all strings within the words (including duplicates). You may return the
	 * answer in any order. Example 1: Input: words = ["bella","label","roller"]
	 * Output: ["e","l","l"]
	 */

	public static void main(String[] args) {
		String[] str = { "bella", "label", "roller" };

		List<String> list2 = new ArrayList<String>();;
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}
		
		char[] charArray = list.get(0).toCharArray();
		
		for (int i = 1; i < list.size(); i++) {
			for (int j = 0; j < charArray.length; j++) {
				String s = String.valueOf(charArray[j]);
				
				if (list.get(i).contains(s)) {
					String replaceFirst = list.get(i).replaceFirst(s, "");
					list.set(i, replaceFirst);
					
					if (list.get(i + 1).contains(s)) {
						String replaceSecond = list.get(i + 1).replaceFirst(s, "");
						list.set(i + 1, replaceSecond);
						list2.add(s);
					}
				}
			}
		}System.out.println(list2);
	}
}
