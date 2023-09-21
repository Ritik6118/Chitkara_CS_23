package assignment_2;

import java.util.Scanner;

public class nth_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		System.out.println(n*(n+1)/2);
		System.out.println(triangle(n));
	}

	private static int triangle(int n) {
		// TODO Auto-generated method stub
		if (n == 1) {
			return 1;
		}
		return triangle(n - 1) + n;
	}

}
