package Function;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=555;
		System.out.println(isArmstrong(n));
	}

	public static boolean isArmstrong(int n) {
		// TODO Auto-generated method stub
		int d=digits(n);
		int arm=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			arm+=Math.pow(rem, d);
			n/=10;
		}
		if(arm==temp) {
			return true;
		}
		else {
			return false;
		}
	}

	public static int digits(int n) {
		// TODO Auto-generated method stub
		int c=0;
		while(n>0) {
			n/=10;
			c++;
		}
		return c;
	}

}
