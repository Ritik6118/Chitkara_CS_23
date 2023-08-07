package TypeCasting;

import java.util.Scanner;

public class Decimal_To_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int ans=0;
		int mul=1;
		while(n>0) {
			int rem=n%2;
			ans+=rem*mul;
			mul*=10;
			n/=2;
		}
		System.out.println(ans);
	}

}
