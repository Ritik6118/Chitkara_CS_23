package Bit_Masking;

public class Single_number_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,1,3,2,5};
		single_number(arr);
	}

	private static void single_number(int[] arr) {
		// TODO Auto-generated method stub
		int a=0;
		for(int i=0;i<arr.length;i++) {
			a^=arr[i];
		}
//		System.out.println(a);
		int b=0;
		int mask=(a&(~(a-1)));
		for(int i=0;i<arr.length;i++) {
			if((arr[i]&mask)!=0) {
				b^=arr[i];
			}
		}
		a^=b;
		System.out.println(a+" "+b);
	}

}
