package Recursion;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		
		int f=fact(n-1);
		return f*n;
	}


}
