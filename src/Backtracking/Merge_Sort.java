package Backtracking;

import java.util.Arrays;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 2, 1, 2, 3, 5, 6, 78, 4, 3, 2, 45 };
		int[] ans=mergesort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] mergesort(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		if(lo==hi) {
			int[] ans=new int[1];
			ans[0]=arr[lo];
			return ans;
		}
		int mid = (lo + hi) / 2;
		int[] arr1 = mergesort(arr, lo, mid);
		int[] arr2 = mergesort(arr, mid + 1, hi);
		return merge(arr1, arr2);
	}

	private static int[] merge(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int[] arr = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(j<arr1.length && k<arr2.length) {
			if(arr1[j]<arr2[k]) {
				arr[i]=arr1[j];
				i++;
				j++;
			}
			else {
				arr[i]=arr2[k];
				i++;
				k++;
			}
		}
		while(j<arr1.length) {
			arr[i]=arr1[j];
			i++;
			j++;
		}
		while(k<arr2.length) {
			arr[i]=arr2[k];
			i++;
			k++;
		}
		return arr;
	}

}
