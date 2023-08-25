package Bit_Masking;

public class nth_magic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		System.out.println(nth_magic_number(n));
	}

	private static int nth_magic_number(int n) {
		// TODO Auto-generated method stub
		int mul=5;
		int ans=0;
		while(n>0) {
			if((n&1)==1) {
				ans+=mul;
			}
			mul*=5;
			n>>=1;
		}
		return ans;
	}

}
