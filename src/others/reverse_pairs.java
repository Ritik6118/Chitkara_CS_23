package others;

public class reverse_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = { 2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
		int[] arr= {1,3,2,3,1};
		mergesort(arr, 0, arr.length - 1);
		System.out.println(c);
	}

	static int c = 0;

	private static int[] mergesort(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		if (lo == hi) {
			int[] ans = new int[1];
			ans[0] = arr[lo];
			return ans;
		}
		int mid = lo+(hi-lo)/2;
		int[] arr1 = mergesort(arr, lo, mid);
		int[] arr2 = mergesort(arr, mid + 1, hi);
		c += count(arr1, arr2);
		return merge(arr1, arr2);

	}

	private static int count(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int c=0;
		int j=0;
		for(int i=0;i<arr1.length;i++) {
			while(j<arr2.length) {
				long n=arr2[j];
				n*=2;
				if(arr1[i]>n) {					
					j++;
				}else {
					break;
				}
			}
			c+=j;
		}
		return c;
	}

	private static int[] merge(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int[] ans = new int[arr1.length + arr2.length];
		int i=0;int j=0;int k=0;
		while(j<arr1.length && k<arr2.length) {
			if(arr1[j]<arr2[k]) {
				ans[i]=arr1[j];
				i++;
				j++;
			}
			else {
				ans[i]=arr2[k];
				i++;
				k++;
			}
		}
		while(j<arr1.length) {
			ans[i]=arr1[j];
			i++;
			j++;
		}
		while(k<arr2.length) {
			ans[i]=arr2[k];
			i++;
			k++;
		}
		return ans;
	}

}
