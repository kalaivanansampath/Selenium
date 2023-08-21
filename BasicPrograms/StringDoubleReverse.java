import java.util.LinkedList;

public class StringDoubleReverse {

	public static void RevereseString(String str) {
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println(reverse);
	}
	
	public static void RevereseSingleString(String str) {
	String[] strSplit = str.split("\\s");
	int strLength = strSplit.length;
	LinkedList<String> list = new LinkedList<String>();
	for (int i = 0; i < strLength; i++) {
		list.add(strSplit[i]);
	}

	for (int j = 0; j < list.size(); j++) {
		String str2 = list.get(j);
		String reverse = "";
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			reverse = ch + reverse;
		}
		System.out.print(reverse + " ");
	}
	
	}

	public static void main(String[] args) {
		String str = "This is kalaivanan";
		
		RevereseString(str);
		RevereseSingleString(str);
		

	}

}
