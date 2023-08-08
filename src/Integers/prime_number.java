package Integers;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				fact++;
				break;
			}
		}
		if(fact==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
