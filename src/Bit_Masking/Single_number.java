package Bit_Masking;

public class Single_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,1,2,1,2};
		System.out.println(Single_number(arr));
	}

	private static int Single_number(int[] arr) {
		// TODO Auto-generated method stub
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans^=arr[i];
		}
		return ans;
	}

}
