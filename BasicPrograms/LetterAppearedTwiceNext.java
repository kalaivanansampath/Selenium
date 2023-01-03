package com.BasicPrograms;

import java.util.ArrayList;
import java.util.List;

public class LetterAppearedTwiceNext {
	
	public void DuplicateLetter(String str) {
		
		char[] charArray = str.toCharArray();

		List<Character> list = new ArrayList<Character>();

		for (int i = 0; i < charArray.length; i++) {
			list.add(charArray[i]);			
		}
		for (int j = 0; j < list.size(); j++) {
			for(int k=1;k<list.size();k++) {
				if (list.get(j) == list.get(k)) {
					System.out.print(list.get(j));
					break;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		String str = "abccbaacz";
		char[] charArray = str.toCharArray();
		
		LetterAppearedTwiceNext obj = new LetterAppearedTwiceNext();
		obj.DuplicateLetter(str);

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
