package Recursion;

public class print_count_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		print_count_inc(n);
	}

	private static void print_count_inc(int n) {
		// TODO Auto-generated method stub
		if(n<0) {
			return ;
		}
		print_count_inc(n-1);
		System.out.println(n);
	}

}
