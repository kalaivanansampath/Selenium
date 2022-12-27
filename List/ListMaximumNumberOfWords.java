package com.List;

import java.util.Map.Entry;
import java.util.TreeMap;

public class ListMaximumNumberOfWords {

	public static void main(String[] args) {
		/**
		 * Java Problem (13/20)* A sentence is a list of words that are separated by a
		 * single space with no leading or trailing spaces. You are given an array of
		 * strings sentences, where each sentences[i] represents a single sentence.
		 * Return the maximum number of words that appear in a single sentence. Example
		 * 1: Input: sentences = ["alice and bob love leetcode", "i think so too", "this
		 * is great thanks very much"] Output: 6 Explanation: - The first sentence,
		 * "alice and bob love leetcode", has 5 words in total. - The second sentence,
		 * "i think so too", has 4 words in total. - The third sentence, "this is great
		 * thanks very much", has 6 words in total. Thus, the maximum number of words in
		 * a single sentence comes from the third sentence, which has 6 words.
		 */

		// String[] str = { "alice and bob love leetcode", "this is great thanks very
		// much alone", "i think so too",
		// "this is great thanks very much" };

		String[] str = { "alice and bob love leetcode", "this is great thanks very much alone", "i think so too",
				"this is great thanks very much", "thanks very much" };

		TreeMap<String, Integer> map = new TreeMap<String, Integer>();

		for (int i = 0; i < str.length; i++) {

			String[] strSplit = str[i].split("\\s");
			int strLength = strSplit.length;
			map.put(str[i], strLength); 
		}
		Entry<String, Integer> lastEntry = map.lastEntry();
		System.out.println("maximum number of words that appear in a single sentence: " + lastEntry.getValue());

	}
}
