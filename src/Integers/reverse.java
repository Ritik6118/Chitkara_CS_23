package Integers;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		int rev=0;
		while(n>0) {
			rev*=10;
			rev+=n%10;
			n/=10;
		}
		System.out.println(rev);
	}

}
