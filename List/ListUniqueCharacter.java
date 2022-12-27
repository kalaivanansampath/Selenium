package com.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListUniqueCharacter {
	// PrintUniqueCharacter
	/*
	 * Problem * a) Take your name as input b) Print all unique characters only (any order)* 
	 * Input: babu Output: a u
	 */

	/*
	 * Psuedocode
	 * 
	 * a) Convert String to Character array b) Create a new Set -> HashSet c) Add
	 * each character to the Set and if it is already there, remove it d) Finally,
	 * print the set
	 * 
	 */

	public static void main(String[] args) {
		String str = "kalaivanan";

		char[] charArray = str.toCharArray();
		Set<Character> setUnique = new HashSet<Character>();
		Set<Character> setDuplicate = new HashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {
			if (!(setUnique.add(charArray[i]))) {
				setDuplicate.add(charArray[i]);
			}
		}

		List<Character> listUnique = new ArrayList<Character>(setUnique);
		List<Character> listDuplicate = new ArrayList<Character>(setDuplicate);

		for (int j = 0; j < listUnique.size(); j++) {

			for (int k = 0; k < listDuplicate.size(); k++) {

				if (listUnique.get(j) == listDuplicate.get(k)) {
					listUnique.remove(j);
				}
			}
		}
		Collections.sort(listUnique);
		System.out.println(listUnique);
		
	}
}
