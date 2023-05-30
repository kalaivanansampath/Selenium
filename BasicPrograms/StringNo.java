package com.BasicPrograms;

import java.util.Arrays;

public class StringNo {
	public static void main(String[] args) {

		String str = "aaaggbbbccddeeffff";
		char []arr = str.toCharArray();
        Arrays.sort(arr);
        String str2 = String.valueOf(arr);
        System.out.println(str2);
		int distinct = 0;
		String str3 = "";
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

	}

}
