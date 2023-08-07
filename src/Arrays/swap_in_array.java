package Arrays;

public class swap_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		swap(arr[0],arr[4]);
		System.out.println(arr[0]+" "+arr[4]);
	}
	private static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp=a;
		a=b;
		b=temp;
//		System.out.println("swap fun running");
		System.out.println("a== "+a+" b== "+b);
//		System.out.println("swap fun end");
	}

}
