package Arrays;

public class MaxSubArray_Kadaens_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
//		int [] arr= {2,3,-6,7,8,-4};
		System.out.println(Max_Sum_Subarray(arr));
	}

	public static int Max_Sum_Subarray(int[] arr) {
		// TODO Auto-generated method stub
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			ans=Math.max(ans, sum);
//			if(sum>ans) {
//				ans=sum;
//			}
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}

}
