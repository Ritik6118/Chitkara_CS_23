package Arrays_2d;

public class wave_print_row_wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		wave_print_row(arr);
	}

	private static void wave_print_row(int[][] arr) {
		// TODO Auto-generated method stub
		for(int row=0;row<arr.length;row++) {
			if(row%2==0) {
				for(int col=0;col<arr[row].length;col++) {
					System.out.print(arr[row][col]+" ");
				}				
			}
			else {
				for(int col=arr[row].length-1;col>=0;col--) {
					System.out.print(arr[row][col]+" ");
				}
			}
		}
	}

}
