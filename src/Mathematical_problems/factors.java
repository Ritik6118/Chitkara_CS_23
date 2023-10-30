package Mathematical_problems;

import java.util.ArrayList;

public class factors {
	public static void main ( String [] args) {
		int n=36;
		ArrayList<Integer> li=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				li.add(i);
			}
		}
		System.out.println(li);
		
	}
}
