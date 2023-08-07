package Arrays;

public class Max_SubArray_BruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-200,-100,-300,-400,-109,-290,-1098,-50,-48};
//		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int ans=maxSum(arr);
		System.out.println(ans);
	}
	
	private static int maxSum(int[] arr) {
		// TODO Auto-generated method stub
		int ans= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
//				display(arr,i,j);
				ans=Math.max(sum(arr,i,j),ans);
			}
		}
		return ans;
	}

	private static void display(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		for(;i<=j;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	private static int sum(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int sum=0;
		for(;i<=j;i++) {
			sum+=arr[i];
		}
		return sum;
	}

}
