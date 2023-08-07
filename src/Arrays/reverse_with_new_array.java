package Arrays;

public class reverse_with_new_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] rev=reverse(arr);
		display(rev);
	}

	private static int[] reverse(int[] arr) {
		// TODO Auto-generated method stub
		int[] rev=new int[arr.length];
		int j=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			rev[i]=arr[j];
			j--;
		}
		return rev;
	}

	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
