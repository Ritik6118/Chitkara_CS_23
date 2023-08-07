package Arrays;

import java.util.Iterator;

public class product_except_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] arr= {1,2,3,4};
			int[] ans=product(arr);
			display(ans);
	}

	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	private static int[] product(int[] arr) {
		// TODO Auto-generated method stub
		int prod=1;
		int[] left=new int[arr.length];
		for (int i = 0; i < left.length; i++) {
			left[i]=prod;
			prod*=arr[i];
		}
		prod=1;
		int[] right=new int[arr.length];
		for (int i = right.length-1; i >= 0; i--) {
			right[i]=prod;
			prod*=arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i]=right[i]*left[i];
		}
		return arr;
	}

}
