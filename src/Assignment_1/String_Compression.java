package Assignment_1;

import java.util.Scanner;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int c=1;
		String ans="";
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++;
			}
			else {
				if(c<2) {
					ans+=(s.charAt(i));
				}
				else {
					ans+=(s.charAt(i))+""+c;
				}
				c=1;					
			}
		}
		if(c<2) {
			ans+=(s.charAt(s.length()-1));
		}
		else {
			ans+=(s.charAt(s.length()-1))+""+c;
		}
		System.out.println(ans);
	}

}
