package Recursion;

public class Board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int f=3;
//		path(n,f,"");
		outcomes(n,"");
//		System.out.println("     "+c);
	}
	private static void outcomes(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(n<0) {
			return;
		}
		outcomes(n-1,ans+"1");
		outcomes(n-2,ans+"2");
		outcomes(n-3,ans+"3");
	}
	static int c=0;

	
	private static void path(int n, int f, String ans) {
		// TODO Auto-generated method stub
		if(n<0) {
			return;
		}
		if(n==0) {
			c++;
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=f;i++) {
			path(n-i,f,ans+i);
		}
	}

}
