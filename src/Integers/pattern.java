package lec5;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int val=1;
		while(row<=2*n-1) {
			int st=1;
			while(st<=star) {
				System.out.print(val+" ");
				if(st!=star) {
					System.out.print("* ");					
				}
				st++;
			}
			if(row<n) {
				val++;
				star++;
			}
			else {
				val--;
				star--;
			}
			row++;
			System.out.println();
		}
	}

}
