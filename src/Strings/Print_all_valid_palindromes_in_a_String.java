package Strings;

public class Print_all_valid_palindromes_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcba";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				if(isPalindrome(s.substring(i,j))==true) {
					System.out.println(s.substring(i,j));
				}
			}
		}
	}

	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
