package com.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ClosestOccurrence {

	/*
	 * Java Problem (20/20)* Given a string s and a character c that occurs in s,
	 * return an array of integers answer where answer.length == s.length and
	 * answer[i] is the distance from index i to the closest occurrence of character
	 * c in s. The distance between two indices i and j is abs(i - j), where abs is
	 * the absolute value function. Example 1: Input: s = "aaab", c = "b" Output:
	 * [3,2,1,0]
	 */

	public static void main(String[] args) {
		String S = "aaab";
		char X = 'b';
		// Find distance from occurrences of X
		// appearing before current character.
		int prev = Integer.MAX_VALUE;
		List<Integer> ans = new ArrayList<Integer>();

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == X)
				prev = i;
			if (prev == Integer.MAX_VALUE)
				ans.add(Integer.MAX_VALUE);
			else
				ans.add(i - prev);
		}

		// Find distance from occurrences of X
		// appearing after current character and
		// compare this distance with earlier.
		prev = Integer.MAX_VALUE;
		for (int i = S.length() - 1; i >= 0; i--) {
			if (S.charAt(i) == X)
				prev = i;
			if (prev != Integer.MAX_VALUE)
				ans.set(i, Math.min(ans.get(i), prev - i));
		}

		for (Integer val : ans)
			System.out.print(val + " ");
	}
}
