package Arrays_2d;

public class Spiral_print_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		print_spiral(arr);
		
	}

	private static void print_spiral(int[][] arr) {
		// TODO Auto-generated method stub
		int minrow=0;
		int maxrow=arr.length-1;
		int mincol=0;
		int maxcol=arr[0].length-1;
		int ele=maxrow*maxcol;
		while(ele-->=0) {
			for(int i=mincol;i<=maxcol;i++) {
				System.out.print(arr[minrow][i]+" ");
				ele++;
			}
			minrow++;
			for(int i=minrow;i<=maxrow;i++) {
				System.out.print(arr[i][maxcol]+" ");
				ele++;
			}
			maxcol--;
			for(int i=maxcol;i>=mincol;i--) {
				System.out.print(arr[maxrow][i]+" ");
				ele++;
			}
			maxrow--;
			for(int i=maxrow;i>=minrow;i--) {
				System.out.print(arr[i][mincol]+" ");
				ele++;
			}
			mincol++;
		}
		
	}

}
