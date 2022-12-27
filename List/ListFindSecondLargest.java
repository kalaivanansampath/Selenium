package com.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListFindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		// output= 7;

		Set<Integer> setData = new TreeSet<Integer>();
		/*
		 * Pseudo Code: a) Create a empty Set Using TreeSet b) Declare for loop iterator
		 * from 0 to data.length and add into Set c) converted Set into List d) Print
		 * the second last element from List
		 * 
		 * 
		 */

		for (int i = 0; i < data.length; i++) {
			setData.add(data[i]);
		}
		System.out.println("Treeset: " + setData);
		List<Integer> listData = new ArrayList<Integer>(setData);
		int s = listData.size();
		System.out.println("Second largest: " + listData.get(s - 2));
	}

}
