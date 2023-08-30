package Assignment_1;

import java.util.Scanner;

public class Rotate_matrix_by_90_degrees_clockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		transpose(arr);
		row_reverse(arr);
		display(arr);
	}

	private static void display(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void row_reverse(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			rev(arr[i]);
		}
	}

	private static void rev(int[] arr) {
		// TODO Auto-generated method stub
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	
	}

	private static void transpose(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}

}
