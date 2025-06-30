package seleniumPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class removeduplicate {

	public static void main(String[] args) {
		String str = "kalaivanan";
		String result =  ""; 
		
		char[] chararrr = str.toCharArray();
		
		Set<Character> removeduplicate = new HashSet<>();
		
		for(int i=0; i<chararrr.length; i++) {
			if(!removeduplicate.add(chararrr[i])) {
				result += chararrr[i];
			}
		}
		
		System.out.println(result);
		
		Set<Character> removeduplicate1 = new TreeSet<>();
		for(int i=0; i<chararrr.length; i++) {
			removeduplicate1.add(chararrr[i]);
		}
		
		List<Character> charList = new LinkedList<>(removeduplicate1);
		System.out.println(charList);
		
		
		Map<Character, Integer> characterMap = new HashMap<>();
		
		for(char Characetr:chararrr) {
			if(characterMap.containsKey(Characetr)) {
				characterMap.put(Characetr, characterMap.get(Characetr)+1);
				
			}
			else {
				characterMap.put(Characetr,1);
			}
		}
		
		System.out.println(characterMap);
		
		String str1 = "kalaivanan is a good boy";
	      String[] splitt = str1.split("\\s");
	      String actualReverse = "";
	      
	      for(String ss:splitt){
	      String rev = "";
	      
	      for(int i=ss.length()-1; i>=0 ; i--){
	          rev = rev+ss.charAt(i);
	      }
	      actualReverse = actualReverse+rev+" ";
	      }
	      System.out.println(actualReverse);
		
		
	      
	     
	    	        String input = "A2B3C5D1";
	    	        String result11 = "";

	    	        for (int i = 0; i < input.length(); i += 2) {
	    	            char ch = input.charAt(i);        // letter
	    	            int count = Character.getNumericValue(input.charAt(i + 1)); // number

	    	            for (int j = 0; j < count; j++) {
	    	                result11 += ch;
	    	            }
	    	        }

	    	        System.out.println("Output: " + result11);  // Output: AABBBCCCCCD
	    	 
		

	}

}
