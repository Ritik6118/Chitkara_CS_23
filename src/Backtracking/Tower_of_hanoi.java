package Backtracking;

public class Tower_of_hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		toh(n,"T1","T2","T3");
	}

	private static void toh(int n, String src, String hlp, String des) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		toh(n-1,src,des,hlp);
		System.out.println(n+"th disk from "+src+" to "+des);
		toh(n-1,hlp,src,des);
	}
}
