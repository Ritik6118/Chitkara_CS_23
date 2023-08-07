package TypeCasting;

public class Bin_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=101010;
		int ans=0;
		int mul=1;
//		int pos=0;
		while(n>0) {
			int rem=n%10;
			ans+=rem*mul;
//			ans+=rem*Math.pow(2, pos);
			mul*=2;
//			pos++;
			n/=10;
		}
		System.out.println(ans);
	}

}
