package com.BasicPrograms;

public class DuplicateLetter {
	public static void main(String argu[]) {
		String str = "beautiful beach marina";
		char[] carray = str.toCharArray();

		System.out.println("The string is:" + str);
		System.out.print("Duplicate Characters in above string are: ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				Character ch1 = str.charAt(i);
				Character ch2 = str.charAt(j);
				// if (carray[i] == carray[j]) {
				if (ch1.equals(ch2)) {
					System.out.print(carray[j] + " ");
					break;
				}
			}
		}
	}

}
