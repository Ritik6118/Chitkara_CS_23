package Recursion;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int m=0;
		System.out.println(pow(n,m));
	}

	private static int pow(int n, int m) {
		// TODO Auto-generated method stub
		if(m==0) {
			return 1;
		}
		return n*pow(n,m-1);
	}

}
