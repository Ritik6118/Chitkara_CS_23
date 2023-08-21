package Strings;

public class print_all_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		print_substring(s);
//		print_substring_len_wise(s);
	}
	private static void print_substring(String s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}
	public static void print_substring_len_wise(String s) {
		for(int len=1;len<=s.length();len++) {
			for(int j=len;j<=s.length();j++) {
				int i=j-len;
				System.out.println(s.substring(i,j));
			}
		}
	}

}
