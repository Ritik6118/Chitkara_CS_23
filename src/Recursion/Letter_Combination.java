package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combination {
	static String[] arr= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="23";
		outcomes(s,"");
	}
	private static void outcomes(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=s.charAt(0);
		int idx=ch-'0';
		String st=arr[idx];
		for(int i=0;i<st.length();i++) {
			outcomes(s.substring(1),ans+st.charAt(i));
		}
	}

}
