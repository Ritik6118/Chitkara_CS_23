package Strings;

import java.util.Iterator;

public class Sort_String_Array_Lexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "ritik", "aman", "abhishek", "abhi", "nitin", "puneet", "tarun", "yash" };
		sort(arr);
		display(arr);
	}  

	private static void display(String[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void sort(String[] arr) {
		// TODO Auto-generated method stub
		for (int pass = 1; pass < arr.length; pass++) {
			for (int i = 0; i < arr.length - pass; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					swap(arr, i, i + 1);
				}
			}
		}
	}

	private static void swap(String[] arr, int i, int j) {
		// TODO Auto-generated method stub
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
