package Arrays_2d;

import java.util.Scanner;

public class jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int [][] arr= new int [5][];
		int[] arr2=new int[5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				arr2[j]=sc.nextInt();
			}
			arr[i]=arr2;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
