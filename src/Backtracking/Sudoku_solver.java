package Backtracking;

public class Sudoku_solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{5,3,0,0,7,0,0,0,0},
						{6,0,0,1,9,5,0,0,0},
						{0,9,8,0,0,0,0,6,0},
						{8,0,0,0,6,0,0,0,3},
						{4,0,0,8,0,3,0,0,1},
						{7,0,0,0,2,0,0,0,6},
						{0,6,0,0,0,0,2,8,0},
						{0,0,0,4,1,9,0,0,5},
						{0,0,0,0,8,0,0,7,9}};
		solve(0,0,grid);
		display(grid);
	}

	private static boolean solve(int row, int col, int[][] arr) {
		// TODO Auto-generated method stub
		if(col==9) {
			row++;
			col=0;
		}
		if(row==9) {
			return true;
		}
		if(arr[row][col]==0) {
			for(int i=1;i<=9;i++) {
				if(issafe(arr,row,col,i)) {
					arr[row][col]=i;
					if(solve(row,col+1,arr)) {
						return true;
					}
					
					arr[row][col]=0;					
				}
			}
		}
		else {
			if(solve(row,col+1,arr)) {
				return true;
			}
		}
		return false;
	}

	private static boolean issafe(int[][] arr, int row, int col, int val) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(arr[row][i]==val) {
				return false;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i][col]==val) {
				return false;
			}
		}
		int r=(row/3)*3;
		int c=(col/3)*3;
		
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				if(arr[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}

	private static void display(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
