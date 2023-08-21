package Strings;

public class compare_two_strings_lexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Compare("aab","abc"));
	}
	
	public static int Compare(String s1, String s2) {

		int len = Math.min(s1.length(), s2.length());
		for (int i = 0; i < len; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		return s1.length() - s2.length();

	}

}
