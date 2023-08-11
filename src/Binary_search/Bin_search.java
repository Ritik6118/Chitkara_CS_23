package Binary_search;

public class Bin_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,5,12,19,25,26,27,32,34,37,38,40,60,78,90};
		int target=12;
		System.out.println(bin_search(arr,target));
	}

	private static int bin_search(int[] arr, int target) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return -1;
	}

}
