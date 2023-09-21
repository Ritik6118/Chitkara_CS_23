package assignment_2;

import java.util.Scanner;

public class generate_binary_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			bin_string(s,"");
			System.out.println();
		}
	}

	private static void bin_string(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		if(s.charAt(0)=='?') {
			bin_string(s.substring(1),ans+'0');
			bin_string(s.substring(1),ans+'1');
		}
		else {
			bin_string(s.substring(1), ans+s.charAt(0));
		}
	}	

}
