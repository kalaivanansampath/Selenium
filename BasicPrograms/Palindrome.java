package com.BasicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(String text) {
		// Remove non-alphanumeric characters and convert to lowercase
		String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		// Check if the cleanedText is the same forward and backward
		int length = cleanedText.length();
		for (int i = 0; i < length / 2; i++) {
			if (cleanedText.charAt(i) != cleanedText.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean RevereseString(String str) {
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println(reverse);
		
		if (reverse.equals(str)) {
			return true;
		}else {
	
	return false;}
	}
	
	public static String reverse(String s)
		{
		String rev="";
		for(int j=s.length();j>0;--j)
		{
		rev=rev+(s.charAt(j-1)); 
		}
	return rev;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word or phrase: ");
		String word = scanner.nextLine();
		scanner.close();

		try {
			if (RevereseString(word)) {
				System.out.println(word + " is a palindrome!");
			} else {
				System.out.println(word + " is not a palindrome.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
