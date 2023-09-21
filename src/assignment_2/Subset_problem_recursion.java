package assignment_2;

import java.util.Scanner;

public class Subset_problem_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		System.out.println("\n"+solve(arr,0,"",t));
	}

	private static int solve(int[] arr, int idx, String ans, int t) {
		// TODO Auto-generated method stub
		if(idx==arr.length && t==0) {
			System.out.print(ans+" ");
			return 1;
		}
		if(t<0 || idx>=arr.length) {
			return 0;
		}
		int a=solve(arr,idx+1,ans+arr[idx]+" ",t-arr[idx]);
		int b=solve(arr,idx+1,ans,t);
		return a+b;
	}

}
