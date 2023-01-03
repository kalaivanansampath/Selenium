package com.BasicPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		/*
		 * number = 1234 
		 * remainder = 1234 % 10 = 4 
		 * reverse = 0 * 10 + 4 = 0 + 4 = 4
		 * number = 1234 / 10 = 123
		 */
		int number = 987654, reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

}
