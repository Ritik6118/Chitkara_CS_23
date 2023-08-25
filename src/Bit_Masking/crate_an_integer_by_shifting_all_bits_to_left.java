package Bit_Masking;

public class crate_an_integer_by_shifting_all_bits_to_left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=55;
//		110111
//		111110
		int on=0;
		int off=0;
		while(n!=0) {
			if((n&1)==1) {
				on++;
			}
			else {
				off++;
			}
			n>>=1;
		}
		System.out.println(on+" "+off);
		int ans=0;
		while(on>0) {
			ans<<=1;
			ans|=1;
			on--;
		}
		while(off>0) {
			ans<<=1;
			off--;
		}
		System.out.println(ans);
	}

}
