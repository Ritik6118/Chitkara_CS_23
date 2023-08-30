package Assignment_1;

import java.util.Scanner;

public class Strings_remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		remove_duplicate(s);
//		aabccba
	}

	private static void remove_duplicate(String s) {
		// TODO Auto-generated method stub
		String ans = "";
		if (s.length() <= 1) {
			System.out.println(s);
			return;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				ans += s.charAt(i);
			}
		}
		ans += s.charAt(s.length() - 1);
		System.out.println(ans);
	}

}
