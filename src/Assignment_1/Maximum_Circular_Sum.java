package Assignment_1;

import java.util.Scanner;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			max_circular_sum(arr);
		}
	}

	private static void max_circular_sum(int[] arr) {
		// TODO Auto-generated method stub
		
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<2*arr.length-1;i++) {
			sum+=arr[i%arr.length];
			ans=Math.max(ans, sum);
			if(sum>ans) {
				ans=sum;
			}
			System.out.print(arr[i%arr.length]+" ");
			if(sum<0) {
				sum=0;
				System.out.println();
			}
		}
		System.out.println(ans);
	}

}
