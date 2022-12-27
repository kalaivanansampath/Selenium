package com.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListShuffledSentence {

	public static void main(String[] args) {
		String str = "Myself2 Me1 I4 and3";

		String[] strSplit = str.split("\\s");

		Set<String> set = new TreeSet<String>();

		for (int i = 0; i < strSplit.length; i++) {
			char[] charArray = strSplit[i].toCharArray();

			int length = charArray.length;
			char char1 = charArray[length - 1];

			String str2 = char1 + strSplit[i];
			set.add(str2);

		}
		String array[] = new String[set.size()];
        array = set.toArray(array);

		String[] arr = set.stream().toArray(String[]::new);

		List<String> list = new ArrayList<String>();

		for (int j = 0; j < array.length; j++) {
			String strSet2 = arr[j].replaceAll("\\d", "");
			list.add(strSet2);
		}

		System.out.println(list);

	}

}
