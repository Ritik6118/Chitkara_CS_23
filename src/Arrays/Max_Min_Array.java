package Arrays;

public class Max_Min_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		int max=max(arr);
		int min=min(arr);
		System.out.println(min+" "+max);
	}

	private static int min(int[] arr) {
		// TODO Auto-generated method stub
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			min=Math.min(arr[i], min);
		}
		return min;
	}

	private static int max(int[] arr) {
		// TODO Auto-generated method stub
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			max=Math.max(arr[i], max);
		}
		return max;
	}

}
