package Arrays;

public class Arrays_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5};
		
		int[] arr2= {5,4,3,2,1};
		System.out.println(arr1+" "+arr2);
		swap(arr1,arr2);
		System.out.println();
//		display(arr1);
//		display(arr2);
	}

	private static void swap(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		System.out.println(arr1+" "+arr2);
		int[] temp=arr1;
		arr1=arr2;
		arr2=temp;
//		display(arr1);
//		display(arr2);
	}

	private static void display(int[] arr1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
	}

};

