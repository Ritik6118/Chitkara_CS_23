package Bit_Masking;

public class Count_set_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		System.out.println(set_bits(n));
	}

	private static int set_bits(int n) {
		// TODO Auto-generated method stub
		int c=0;
		while(n!=0) {
			if((n&1)==1) {
				c++;
			}
			n>>=1;
		}
		return c;
	}
	private static int set_bits_fast(int n) {
		// TODO Auto-generated method stub
		int c=0;
		while(n!=0) {
			c++;
			n&=(n-1);
		}
		return c;
	}

}
