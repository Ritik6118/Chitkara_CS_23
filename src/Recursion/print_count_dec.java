package Recursion;

public class print_count_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		count_dec(n);
	}

	private static void count_dec(int n) {
		// TODO Auto-generated method stub
		if(n<0) {
			return ;
		}
		System.out.println(n);
		count_dec(n-1);
	}

}
