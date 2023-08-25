package Bit_Masking;

import java.util.Scanner;

public class check_set_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=sc.nextInt();
		System.out.println(isSet(n,i));
	}

	private static boolean isSet(int n, int i) {
		// TODO Auto-generated method stub
		int mask=1<<i;
		if((mask&n)!=0) {
			return true;
		}
		return false;
	}
	
}
