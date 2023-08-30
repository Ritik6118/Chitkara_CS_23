package Assignment_1;

import java.util.*;

public class Array_target_sum_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		target_pair(arr,t);
	}

	private static void target_pair(int[] arr, int t) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j]==t) {
				System.out.println(arr[i]+" and "+arr[j]);
				i++;
			}
			else if(arr[i]+arr[j]>t) {
				j--;
			}
			else {
				i++;
			}
		}
	}

}
