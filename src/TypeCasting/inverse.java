package TypeCasting;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=32145;
		int ans=0;
		int pos=1;
		while(n>0) {
			int rem=n%10;
			ans+=pos*Math.pow(10,rem-1);
			pos++;
			n/=10;
		}
		System.out.println(ans);
	}

}
