package Arrays_2d;

public class Array_print_col_wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		print_col_wise(arr);
	}

	private static void print_col_wise(int[][] arr) {
		// TODO Auto-generated method stub
		for(int col=0;col<arr[0].length;col++) {
			if(col%2==0) {
				for(int row=0;row<arr.length;row++) {
					System.out.print(arr[row][col]+" ");
				}				
			}
			else {
				for(int row=arr.length-1;row>=0;row--) {
					System.out.print(arr[row][col]+" ");
				}
			}
		}
	}	

}
