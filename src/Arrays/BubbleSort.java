package Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,4,2,6,3,5};
		sort(arr);
		display(arr);
	}

	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int pass=1;pass<arr.length;pass++) {
			System.out.println("PASS "+ pass);
			for(int i=0;i<arr.length-pass;i++) {
				display(arr,i);
				if(arr[i]>arr[i+1]) {
					display_swap(arr,i);
					swap(arr,i,i+1);
				}
			}
		}
	}

	private static void display_swap(int[] arr, int i) {
		// TODO Auto-generated method stub
		for (int j = 0; j < arr.length; j++) {
			if(i==j) {
				System.out.print(arr[j] +"<>");
			}
			else {
				System.out.print(arr[j] +" ");				
			}
		}
		System.out.println();
	}

	private static void display(int[] arr, int i) {
		// TODO Auto-generated method stub
		for (int j = 0; j < arr.length; j++) {
			if(i==j) {
				System.out.print(arr[j] +"~");
			}
			else {
				System.out.print(arr[j] +" ");				
			}
		}
		System.out.println();
		for (int j = 0; j < arr.length; j++) {
			if(i==j) {
				System.out.print("^ ");
			}
			else {
				System.out.print("  ");				
			}
		}
		System.out.println();
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
