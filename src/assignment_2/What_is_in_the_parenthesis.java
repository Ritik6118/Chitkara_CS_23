package assignment_2;

import java.util.Scanner;

public class What_is_in_the_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		soln(s,"");
	}

	static boolean flag=false;
	private static void soln(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']') {
			
			System.out.println(ans);
			return ;
		}
		if(flag==true) {
			soln(s.substring(1),ans+s.charAt(0));
		}
		else {
			if(s.charAt(0)=='('||s.charAt(0)=='{'||s.charAt(0)=='[') {
				flag=true;
			}
			soln(s.substring(1),ans);			
		}
	}

}
