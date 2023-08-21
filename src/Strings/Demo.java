package Strings;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		int[] arr2= {1,2,3,4};
////		System.out.println(arr==arr2);
//		String s1="abc";
//		String s2=new String("abc");
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		//		equals(arr,arr2);
//		String s="   H e l l o  ";
//		String s2="Hello";
//		
//		System.out.println(s.endsWith(" "));	
		String str="abc@def@ghi@jkkl@@mno@pqr@stu@vwx@yz";
		String [] arrr=str.split("@");
		for(int i=0;i<arrr.length;i++) {
			System.out.println(arrr[i]+" ");
		}
//		String s="123";
//		int i=Integer.parseInt(s);
//		System.out.println(i);
//		String s = "helloThisIsA1234Sample";
//		s = s.replaceAll("[^1-9]","");
//		System.out.println(s);
		
//		String s = "hello"
//		String s1 = new String("hello");
//		String s2 = "hello";
//		String s3 = new String("hello");
//		String s4 = s3;
//		System.out.println(s1);
//		System.out.println(s == s1);
//		System.out.println(s3 == s1);
//		System.out.println(s2 == s);
//		System.out.println(s.charAt(2));
//		System.out.println(s1.length());
//		System.out.println(equals(s, s2));
//		System.out.println(equals(s, s1));// apna wala 
//		System.out.println(s.equals(s1));//  java wala
//		String s = "hello";
//		s = s + "bye";
//		String s1 = new String("hello");
//		s1 = s1 + "bye";
//		System.out.println(s1);
//
//		String s2 = "hello" + "bye";
//		String s3 = s2;
//		s2 = s2 + "okay";
//		System.out.println(s2 == s3);
//		System.out.println(s2);
//		System.out.println(s3);

	}
	
	
	
	
	

	private static boolean equals(int[] arr, int[] arr2) {
		// TODO Auto-generated method stub
		if(arr.length!=arr2.length) {
			return false;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
		
	}






	public static boolean equals(String s1, String s2) {
		if(s1==s2) {
			return true;
		}
		if(s1.length()!=s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;


	}
}
