package Binary_search;

import java.util.Arrays;

public class Agressive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stalls = { 1, 2, 4, 8, 9 };
		int cows = 3;
		Arrays.sort(stalls);
		int ans = max_min_dist(stalls, cows);
		System.out.println(ans);
	}

	private static int max_min_dist(int[] arr, int cows) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=arr[arr.length-1]-arr[0];
		int ans=0;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(isPossible(mid,cows,arr)==true) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}

	private static boolean isPossible(int dist, int cows, int[] arr) {
		// TODO Auto-generated method stub
		int placedcows=1;
		int position=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]-position>=dist) {
				placedcows++;
				position=arr[i];
			}
			if(placedcows==cows) {
				return true;
			}
		}
		return false;

	}

}
