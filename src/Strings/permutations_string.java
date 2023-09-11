package Strings;

public class permutations_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutations("abc","");
	}
	public static void permutations(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String s1 = s.substring(0, i);
			String s2 = s.substring(i + 1);
			permutations(s1 + s2, ans + ch);
		}

	}

}
