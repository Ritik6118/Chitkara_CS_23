package assignment_2;

import java.util.Scanner;

public class Recursion_Ascii_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("\n"+subseq(s,""));
	}

	private static int subseq(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.print(ans+" ");
			return 1;
		}
		
		int a=subseq(s.substring(1),ans);
		int b=subseq(s.substring(1),ans+s.charAt(0));
		int c=subseq(s.substring(1),ans+(int)(s.charAt(0)));
		
		return a+b+c;
	}

}
