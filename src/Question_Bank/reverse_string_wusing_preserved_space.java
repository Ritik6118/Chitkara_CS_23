package Question_Bank;

import java.util.*;


public class reverse_string_wusing_preserved_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is a long string with spaces in between all words.";
		reverse(s);
	}

	private static void reverse(String s) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<>();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				q.add(i);
			}
			else {
				st.push(s.charAt(i));
			}
		}
		String str="";
		while(!st.isEmpty()) {
			if(!q.isEmpty() && str.length()==q.peek()) {
				str+=" ";
				q.poll();
			}
			str+=st.pop();
		}
		System.out.println(str);
	}

}
