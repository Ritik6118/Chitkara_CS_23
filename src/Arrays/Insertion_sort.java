package Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,2,6,3,5};
		sort(arr);
		display(arr);
	}

	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++) {
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[++j]=item;
		}
	}

}
