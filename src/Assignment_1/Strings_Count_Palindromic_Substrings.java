package Assignment_1;

import java.util.Scanner;

public class Strings_Count_Palindromic_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		palindromes_count(s);
	}

	private static void palindromes_count(String s) {
		// TODO Auto-generated method stub
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if (isPalindrom(s.substring(i, j))) {
					c++;
					System.out.println(s.substring(i, j));
				}
			}
		}
		System.out.println(c);
	}

	private static boolean isPalindrom(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
