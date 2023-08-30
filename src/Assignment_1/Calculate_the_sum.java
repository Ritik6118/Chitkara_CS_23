package Assignment_1;

import java.util.Arrays;
import java.util.Scanner;

public class Calculate_the_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int m=1000000007;
		int t=sc.nextInt();
		while(t-->0) {
			int x=sc.nextInt();
//			System.out.println(Arrays.toString(arr));
			arr=operation(arr,x);
//			System.out.println(Arrays.toString(arr));
//			System.out.println();

		}
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans+=arr[i]%m;
		}
		System.out.println(ans);
			
		
	}

	private static int[] operation(int[] arr, int x) {
		// TODO Auto-generated method stub
		int n=arr.length-x;
		int [] arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+"+"+arr[(i+n)%arr.length]+" ");
			arr2[i]+=arr[(i+n)%arr.length]+arr[i];
		}
//		System.out.println();
		return arr2;
	}

}
