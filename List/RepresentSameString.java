package com.List;

public class RepresentSameString {

	public static void main(String args[]) {
		String word1[] = { "ab", "c" };
		String word2[] = { "ab", "c" };
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder(); 
		for (int i = 0; i < word1.length; i++) {
			sb1.append(word1[i]);
		}
		String str1 = sb1.toString();
		System.out.println(str1);

		for (int j = 0; j < word2.length; j++) {
			sb2.append(word2[j]);
		}
		String str2 = sb2.toString();
		System.out.println(str2);
		boolean result = false;

		if (str1.equals(str2)) {
			result = true;
		}
		System.out.println(result);
	}

}
