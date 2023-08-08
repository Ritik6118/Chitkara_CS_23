package Arrays;

public class frequency_array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,1,3,1,2,3,4,5,4,3,2,1,2,3,1,2,3};
		int[] freq= new int[6];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}
//		display(freq);
		
		// sorting using freq array
		sort(freq,arr);
		
		System.out.println();
		display(arr);
	}

	private static void sort(int[] freq, int[] arr) {
		// TODO Auto-generated method stub
		int j=0;
		for(int i=0;i<freq.length;i++) {
			int n=freq[i];
			while(n-->0) {
				arr[j]=i;
				j++;
			}
		}
	}

	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.print (arr[i]+" ");
		}
	}	

}
