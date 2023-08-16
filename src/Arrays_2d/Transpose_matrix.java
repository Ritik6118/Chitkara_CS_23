package Arrays_2d;

public class Transpose_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		display(arr);
		System.out.println();
		transpose(arr);
		display(arr);
	}

	private static void display(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t ");
			}
			System.out.println();
		}
	}

	private static void transpose(int[][] arr) {
		// TODO Auto-generated method stub
		for(int row=0;row<arr.length;row++) {
			for(int col=row+1;col<arr[row].length;col++) {
				int temp=arr[row][col];
				arr[row][col]=arr[col][row];
				arr[col][row]=temp;
			}
		}
	}

}
