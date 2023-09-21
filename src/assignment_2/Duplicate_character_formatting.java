package assignment_2;

import java.util.Scanner;

public class Duplicate_character_formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		format(s,"");
	}

	private static void format(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		if(ans.length() !=0 && s.charAt(0)==ans.charAt(ans.length()-1)) {
			ans+="*";
		}
		format(s.substring(1),ans+s.charAt(0));
	}

}
