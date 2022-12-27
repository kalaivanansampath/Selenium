package com.List;

import java.util.ArrayList;
import java.util.List;

public class ListLetterAppearedTwice {

	public static void main(String[] args) {
		String str = "abccbaacz";
		char[] charArray = str.toCharArray();

		List<Character> list = new ArrayList<Character>();

		for (int i = 0; i < charArray.length; i++) {
			list.add(charArray[i]);
		}

		for (int j = 0; j < list.size(); j++) {
			if (list.get(j) == list.get(j + 1)) {
				System.out.println("First Letter Appeared Twice is: " + list.get(j));
				break;
			}
		}
	}

}
