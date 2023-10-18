package Question_Bank;

import java.util.ArrayList;

public class Recursive_text_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abababababab";
		ArrayList<Integer> li=new ArrayList<>();
		String st="ab";
		search(s,li,st,0);
		System.out.println(li);
	}

	private static void search(String s, ArrayList<Integer> li,String st,int idx) {
		// TODO Auto-generated method stub
		int len=st.length();
		if(idx==s.length()-len) {
			return;
		}
		if(s.substring(idx,idx+len).equals(st)) {
			li.add(idx);
		}
		search(s,li,st,idx+1);
	}

}
