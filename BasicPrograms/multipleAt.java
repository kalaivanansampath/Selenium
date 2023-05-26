package com.BasicPrograms;

import java.util.ArrayList;

public class CatString {

	public static String printCat(String str, int n) {

		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + str;
		}

		return result;
	}

	public static String replaceAt(String result) {
		String resultReplace = result.replaceAll("c", "@");
		return resultReplace;
	}

	public static String replaceMultipleAt(String str1) {

		ArrayList<String> List = new ArrayList<String>();
		String[] strSplit = str1.split("\\s");
		for (int i = 0; i < strSplit.length; i++) {
			List.add(strSplit[i]);
		}
		
		String result = "";
		String at = "@";
		for (int j = 0; j < List.size(); j++) {
			String strList = List.get(j);

			String replaceAll = strList.replaceAll("c", at);
			at = at + "@";
			result = result + replaceAll;
		}
		return result;
	}

	public static void main(String[] args) {

		String str = "cat";
		String str1 = "cat cat cat";
		int numberOfTimes = 3;

		String result = printCat(str, numberOfTimes);
		System.out.println("The String Repeated " + numberOfTimes + " times is : ");
		System.out.println(result);

		String resultReplace = replaceAt(result);
		System.out.println(resultReplace);

		String resultMultipleAt = replaceMultipleAt(str1);
		System.out.println(resultMultipleAt);

		ArrayList<String> List = new ArrayList<String>();
		String[] strSplit = str1.split("\\s");
		for (int i = 0; i < strSplit.length; i++) {
			List.add(strSplit[i]);
		}
		String at = "@";
		for (int j = 0; j < List.size(); j++) {
			String strList = List.get(j);

			String replaceAll = strList.replaceAll("c", at);
			at = at + "@";
			System.out.print(replaceAll);
		}
	}
}

