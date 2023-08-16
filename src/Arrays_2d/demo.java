package Arrays_2d;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [][] arr={{1,2,3,4,5},
//					  {1,2,3,4,5},
//					  {1,2,3,4,5},
//					  {1,2,3,4,5},
//					  {1,2,3,4,5}} ;
//		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m] ;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
