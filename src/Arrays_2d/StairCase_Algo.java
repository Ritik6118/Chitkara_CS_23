package Arrays_2d;

public class StairCase_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(Search(arr,61));
	}

	private static boolean Search(int[][] arr, int target) {
		// TODO Auto-generated method stub
		int row=arr.length-1;
		int col=0;
		while(row>=0 && col<arr[0].length) {
			if(arr[row][col]==target) {
				return true;
			}
			if(arr[row][col]<target) {
				col++;
			}
			else {
				row--;
			}
		}
		return false;
	}

}
