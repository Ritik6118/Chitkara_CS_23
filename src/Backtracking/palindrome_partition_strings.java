package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class palindrome_partition_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aman";
		List<String> li=new ArrayList<>();
		List<List<String>> l2=new ArrayList<>();
		partition(s,"",li,l2);
		System.out.println(l2);
	}

	private static void partition(String s, String ans, List<String> li, List<List<String>> l2) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
//			System.out.println(ans);
//			System.out.println(li);
//			System.out.println(li);
			l2.add(new ArrayList(li));
			return;
		}
		for(int i=1;i<=s.length();i++) {
			String st=s.substring(0,i);
			if(ispalindrome(st)) {
				li.add(st);
				partition(s.substring(i),ans+st+"|",li,l2);
				li.remove(li.size()-1);
			}
		}
	}

	private static boolean ispalindrome(String st) {
		// TODO Auto-generated method stub
		int i=0;
		int j=st.length()-1;
		while(i<j) {
			if(st.charAt(i)!=st.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
