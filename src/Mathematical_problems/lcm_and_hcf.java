package Mathematical_problems;

public class lcm_and_hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor=23;
		int divident=41;
		int a=divisor;
		int b=divident;
		while(divident%divisor!=0) {
			int rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println("hcf is "+divisor);
		System.out.println("lcm is "+ (a*b)/divisor);
	}

}
