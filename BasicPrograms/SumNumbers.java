package com.BasicPrograms;

public class SumNumbers {
	/*
	 * Sum the numbers until it becomes a single digit
	 */
	public static void main(String[] args) {
		String str = "123";

		char[] charArray = str.toCharArray();
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			int a = Integer.parseInt(String.valueOf(charArray[i]));
			count = count + a;
		}
		if (count > 9) {
			char[] charArray2 = ("" + count).toCharArray();
			int updatedCount = 0;
			for (int j = 0; j < charArray2.length; j++) {
				int b = Integer.parseInt(String.valueOf(charArray2[j]));
				updatedCount = updatedCount + b;
			}
			System.out.println(updatedCount);
		}
		else {
			System.out.println(count);
		}

	}

}
