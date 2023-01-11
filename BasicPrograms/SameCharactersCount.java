package com.BasicPrograms;

import java.util.Map;
import java.util.TreeMap;

public class SameCharactersCount {
	
	public void CharacterCount(String str, int distinct) {
		
	
		for (int j = 0; j < str.length(); j++) {

			for (int k = 0; k < str.length(); k++) {

				if (str.charAt(j) == str.charAt(k)) {
					distinct++;

				}
			}
			System.out.println(str.charAt(j) + "--" + distinct);
			// String str1=String.valueOf(str.charAt(j)).trim();
			String str1 = Character.toString(str.charAt(j));
			str = str.replaceAll(str1, "");
			distinct = 0;
	}}
	
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
		System.out.println("MAP"+map);		
	}
	
	public static void main(String[] args) {
		String str = "kalaivanan";
		int distinct = 0;
		
		SameCharactersCount obj = new SameCharactersCount();
		obj.CharacterCount(str, distinct);
		obj.CharacterCountMap(str, distinct);

		for(int i=0; i<str.length(); i++) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					distinct++;
				}}
				System.out.println(str.charAt(i) + "--"+ distinct);
				String str2 = Character.toString(str.charAt(i));
				 str = str.replaceAll(str2, "");
				 distinct=0;
			
		}

		

	}

}
