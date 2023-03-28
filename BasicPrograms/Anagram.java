package com.BasicPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "Race";
		String str2 = "Care2";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length()==str2.length()) {
			char[] tempArray1 = str1.toCharArray();
			char[] tempArray2 = str2.toCharArray();
	       
	        Arrays.sort(tempArray1);
	        Arrays.sort(tempArray2);
	        
	        System.out.println(tempArray1);
	        System.out.println(tempArray2);
	        
	        String str3 = new String(tempArray1);
	        String str4 = new String(tempArray2);
	        
	     if(str3.equals(str4)) {
	    	 System.out.println("Anangram");
	     }else {
	    	 System.out.println("Not Anangram");
	     }
	   	 	 
		}
		else {
			System.out.println("Not Anangram");
		}

	}

}
