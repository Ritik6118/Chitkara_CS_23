package Question_Bank;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor=4;
		int divident=6;
		int a=divisor;
		int b=divident;
		while(divident%divisor!=0) {
			int rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		int hcf=divisor;
		int lcm=(a*b)/hcf;
		System.out.println(lcm);
	}

}
