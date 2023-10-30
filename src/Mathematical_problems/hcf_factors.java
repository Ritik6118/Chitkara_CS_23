package Mathematical_problems;

import java.util.ArrayList;

public class hcf_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=52;
		int b=76;
		ArrayList<Integer>l1=new ArrayList<>();
		ArrayList<Integer>l2=new ArrayList<>();
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				l1.add(i);
			}
		}
		for(int i=2;i<=b;i++) {
			if(b%i==0) {
				l2.add(i);
			}
		}
		for(int i=l1.size()-1;i>=0;i--) {
			for(int j=l2.size()-1;j>=0;j--) {
				if(l1.get(i)==l2.get(j)) {
					System.out.println(l2.get(j));
					return;
				}
			}
		}
	}

}
