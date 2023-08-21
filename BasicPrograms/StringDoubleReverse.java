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

	public static void RevereseMinus(String s) {

		String rev = "";
		for (int j = s.length(); j > 0; --j) {
			rev = rev + (s.charAt(j - 1));
		}
		System.out.println();
		System.out.println("minus: " + rev);
	}

	public static void Reverese(String str) {

		String[] strSplit = str.split("\\s");
		int strLength = strSplit.length;
		LinkedList<String> list = new LinkedList<String>();
		for (int i = 0; i < strLength; i++) {
			list.add(strSplit[i]);
		}

		for (int j = 0; j < list.size(); j++) {
			String s = list.get(j);
			String rev1 = "";
			for (int j1 = s.length(); j1 > 0; --j1) {
				rev1 = rev1 + (s.charAt(j1 - 1));
			}
			System.out.print(rev1 + " ");
		}

	}
	
	

	public static void ReveresewithoutCollection(String str) {

		String[] strSplit = str.split("\\s");
		int strLength = strSplit.length;
		
		System.out.println();
		for (int j = 0; j < strLength; j++) {
			String s = strSplit[j];
			String rev1 = "";
			for (int j1 = s.length(); j1 > 0; --j1) {
				rev1 = rev1 + (s.charAt(j1 - 1));
			}
			
			System.out.print(rev1 + " ");
		}

	}

	public static void main(String[] args) {
		String str = "This is kalaivanan";

		RevereseString(str);
		RevereseSingleString(str);
		RevereseMinus(str);
		Reverese(str);
		ReveresewithoutCollection(str);

	}

}
