package Function;

public class armstrong_in_a_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=500;i++) {
			if(isArmstrong(i)) {
				System.out.println(i);
			}
		}
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
