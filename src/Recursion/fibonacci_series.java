package Recursion;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fibo(10));
	}

	private static int fibo(int n) {
		// TODO Auto-generated method stub
		if(n==1 ||n==0) {
			return n;
		}
		int a=fibo(n-1);
		int b=fibo(n-2);
		return a+b;
		
	}

}
