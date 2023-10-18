package Question_Bank;

import java.util.Scanner;

public class grocery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[] fresh=new int[n];
		int[] cost=new int[n];
		for(int i=0;i<n;i++) {
			fresh[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			cost[i]=sc.nextInt();
		}
		solution(fresh,cost,x);
		
	}

	private static void solution(int[] fresh, int[] cost,int threshold) {
		// TODO Auto-generated method stub
		int ans=0;
		for(int i=0;i<fresh.length;i++) {
			if(fresh[i]>=threshold) {
				ans+=cost[i];
			}
		}
	}

}
