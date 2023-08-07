package lec5;

import java.util.Scanner;

public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int divisor=sc.nextInt();
		int divident=sc.nextInt();
		while(divident%divisor!=0) {
			int rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println(divisor);
//		System.out.println(60%36);
//		System.out.println(36%60);
	}

}
