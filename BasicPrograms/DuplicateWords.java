package com.BasicPrograms;

public class DuplicateWords {
	
	public static void main(String[] args) {
		String str = "This Improvement ticket is not closed still QA blocked so should not create a new ticket";
		String[] strSplit = str.split("\\s");

		for(int i=0;i<strSplit.length; i++) {
			for(int j=i+1;j<strSplit.length; j++) {
				if(strSplit[i].equals(strSplit[j])) {
					System.out.println(strSplit[i]);
				}
			}
		}
	}

}
