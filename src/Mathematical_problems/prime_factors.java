package Mathematical_problems;

import java.util.ArrayList;

public class prime_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=55555;
		ArrayList<Integer>li=new ArrayList<>();
		for(int i=2;i<=n;i++) {
			while(n%i==0) {
				n/=i;
				li.add(i);
			}
		}
		System.out.println(li);
	}

}
