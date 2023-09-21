package assignment_2;

import java.util.Scanner;

public class Maze_path_d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("\n"+solve(0,0,n,""));
	}

	private static int solve(int cr, int cc, int n, String ans) {
		// TODO Auto-generated method stub
		if(cr==n-1 && cc==n-1) {
			System.out.print(ans+" ");
			return 1;
		}
		if(cr>=n||cc>=n) {
			return 0;
		}
		int v=solve(cr+1,cc,n,ans+"V");
		int h=solve(cr,cc+1,n,ans+"H");
		int d=0;
		if(cr==cc || cr+cc==n-1) {
			d=solve(cr+1,cc+1,n,ans+"D");			
		}
		return v+h+d;
	}

}
