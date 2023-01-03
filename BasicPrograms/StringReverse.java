package com.BasicPrograms;

public class StringReverse {
	
	public  void Reverese(String str)
    {
       StringBuilder input1 = new StringBuilder();
  
        // append a string into StringBuilder input1
        input1.append(str);
  
        // reverse StringBuilder input1
        input1.reverse();
  
        // print reversed String
        System.out.println(input1);
    }

	public static void main(String[] args) {
		String str = "Java Application is used in Automation";
		String reverse ="";
		
		StringReverse obj = new StringReverse();
		obj.Reverese(str);
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			reverse = ch+ reverse;
		}
		System.out.println(reverse);
	}
	
}