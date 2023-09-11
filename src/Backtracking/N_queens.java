package Backtracking;

import java.util.Iterator;

public class N_queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] arr = new boolean[n][n];
		nqueen(arr, n, 0);
	}

	private static void nqueen(boolean[][] arr, int q, int row) {
		// TODO Auto-generated method stub
		if (q == 0) {
			display(arr);
			return;
		}

		for (int col = 0; col < arr.length; col++) {
			if (arr[row][col] == false && issafe(arr, row, col) == true) {
				arr[row][col] = true;
				nqueen(arr, q - 1, row + 1);
				arr[row][col] = false;
			}
		}
	}

	private static void display(boolean[][] arr) {
		// TODO Auto-generated method stub
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				if (arr[row][col] == true) {
					System.out.print("Q ");
				} else {
					System.out.print("_ ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	private static boolean issafe(boolean[][] arr, int row, int col) {
		// TODO Auto-generated method stub
		int r = row;
		int c = col;
		while (r >= 0) {
			if (arr[r][c] == true) {
				return false;
			}
			r--;
		}
		r = row;
		c = col;
		while (r >= 0 && c >= 0) {
			if (arr[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		r = row;
		c = col;
		while (r >= 0 && c < arr.length) {
			if(arr[r][c]==true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

}
