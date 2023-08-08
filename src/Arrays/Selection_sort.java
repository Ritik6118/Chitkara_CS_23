package Arrays;

import java.util.Iterator;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,2,6,3,5};
		sort(arr);
		display(arr);
	}

	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			int min_idx=min_idx(arr,i);
			swap(arr,i,min_idx);
		}
	}

	private static void swap(int[] arr, int i, int min_idx) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[min_idx];
		arr[min_idx]=temp;
	}

	private static int min_idx(int[] arr, int i) {
		// TODO Auto-generated method stub
		int min=arr[i];
		int min_idx=i;
		for (; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
				min_idx=i;
			}
		}
		return min_idx;
	}

}
