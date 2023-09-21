package assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Dictionary_order_larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] arr=s.toCharArray();
		Arrays.sort(arr);
		String st="";
		for(int i=0;i<arr.length;i++) {
			st+=arr[i];
		}
		dict(st,"",s);
	}

	private static void dict(String s, String ans,String st) {
		// TODO Auto-generated method stub
		if(s.length()==0 && ans.compareTo(st)>0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<s.length();i++) {
			dict(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i),st);
		}
	}

}
