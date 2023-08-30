package Recursion;

public class fact_tail_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fact(30));	
		System.out.println(fact_tail(30,1));
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 1;
		}
		int f=fact(n-1);
		return n*f;
	}
	private static int fact_tail(int n,int ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			return ans;
		}
		return fact_tail(n-1,ans*n);
	}

}
