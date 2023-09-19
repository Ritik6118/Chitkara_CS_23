package Backtracking;

public class Sudoku_Solver_CharARR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr= {{'5','3','.','.','7','.','.','.','.'},
					   {'6','.','.','1','9','5','.','.','.'},
					   {'.','9','8','.','.','.','.','6','.'},
					   {'8','.','.','.','6','.','.','.','3'},
					   {'4','.','.','8','.','3','.','.','1'},
					   {'7','.','.','.','2','.','.','.','6'},
					   {'.','6','.','.','.','.','2','8','.'},
					   {'.','.','.','4','1','9','.','.','5'},
					   {'.','.','.','.','8','.','.','7','9'}};
		solve(arr,0,0);
		display(arr);
	}

	private static boolean solve(char[][] arr, int row, int col) {
		// TODO Auto-generated method stub
		if(col==9) {
			row++;
			col=0;
		}
		if(row==9) {
			return true;
		}
		if(arr[row][col]=='.') {
			for(int i=1;i<=9;i++) {
				if(issafe(arr,row,col,i)) {
					arr[row][col]=(char)(i+'0');
					if(solve(arr,row,col+1)) {
						return true;
					}
					arr[row][col]='.';					
				}
			}
		}
		else {
			if(solve(arr,row,col+1)) {
				return true;
			}
		}
		return false;
	}

	private static boolean issafe(char[][] arr, int row, int col, int val) {
		// TODO Auto-generated method stub
		for (int r = 0; r < arr.length; r++) {
			if(arr[r][col]==val+'0') {
				return false;
			}
		}
		for (int c = 0; c < arr.length; c++) {
			if(arr[row][c]==val+'0') {
				return false;
			}
		}
		int r=(row/3)*3;
		int c=(col/3)*3;
		for (int i = r; i < r+3; i++) {
			for (int j = c; j < c+3; j++) {
				if(arr[i][j]==val+'0') {
					return false;
				}
			}
		}
		return true;
	}

	private static void display(char[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

