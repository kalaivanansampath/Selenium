package com.BasicPrograms;

import java.util.Map;
import java.util.TreeMap;

public class SameCharactersCount {
	
	public void CharacterCount(String str, int distinct) {
		int j = 0;
		while (j < str.length()) {
			for (int k = 0; k < str.length(); k++) {
				if (str.charAt(j) == str.charAt(k)) {
					distinct++;
				}
			}
			System.out.println(str.charAt(j) + "" + distinct);
			String str1 = Character.toString(str.charAt(j));
			str = str.replaceAll(str1, "");
			distinct = 0;

		}
	}

	public void CharacterCountMap(String str, int distinct) {
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
		System.out.println("MAP" + map);
	}
	
	public void characterCountWithoutremove(String str, int distinct){
	
	char []arr = str.toCharArray();
        Arrays.sort(arr);
        String str2 = String.valueOf(arr);
        System.out.println(str2);
	int j = 0;
		while (j < str.length()) {
			for (int k = 0; k < str.length(); k++) {
				if (str.charAt(j) == str.charAt(k)) {
					distinct++;
				}
			}
			System.out.println(str.charAt(j) + "" + distinct);
			//String str1 = Character.toString(str.charAt(j));
			//str = str.replaceAll(str1, "");
			
			
			j=j+distinct;
			distinct = 0;
	}

	public static void main(String[] args) {
		String str = "kalaivanan";
		int distinct = 0;

		SameCharactersCount obj = new SameCharactersCount();
		obj.CharacterCount(str, distinct);
		obj.CharacterCountMap(str, distinct);

	}

}
