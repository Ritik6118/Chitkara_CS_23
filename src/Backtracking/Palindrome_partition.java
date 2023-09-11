package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitin";
		List<String> li=new ArrayList<>();
		List<List<String>> list=new ArrayList<>();
		plaindromes(s,"",li,list);
		System.out.println(list);
	}

	private static void plaindromes(String s, String ans, List<String> li, List<List<String>> list) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			list.add(new ArrayList<>(li));
			return;
		}
		for(int i=1;i<=s.length();i++) {
			String st=s.substring(0,i);
			if(isplaindrome(st)) {
				li.add(st);
				plaindromes(s.substring(i),ans+st+" | ",li,list);
				li.remove(li.size()-1);
			}
		}
	}

	private static boolean isplaindrome(String st) {
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
