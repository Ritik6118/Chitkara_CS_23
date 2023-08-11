package Binary_search;

public class Find_Peak_element_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 1, 3, 5, 6, 4 };
		System.out.println(find_peak(arr));
	}

	private static int find_peak(int[] arr) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = arr.length - 1;
		if (arr.length == 1) {
			return 0;
		}
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (mid == 0) {
				if (arr[mid] > arr[mid + 1]) {
					return mid;
				} else {
					lo = mid + 1;
				}
			} else if (mid == arr.length - 1) {
				if (arr[mid] > arr[mid - 1]) {
					return mid;
				} else {
					hi = mid - 1;
				}
			} else {
				if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
					return mid;
				} else if (arr[mid + 1] > arr[mid]) {
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}
		}
		return 0;
	}

}
