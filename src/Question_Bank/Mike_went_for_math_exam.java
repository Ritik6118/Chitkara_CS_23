package Question_Bank;

public class Mike_went_for_math_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		int target=2;
		int[] arr= {1,3,2,6};
		outcome(arr,target,0,0);
		System.out.println(c);
	}
	static int c=0;
	private static void outcome(int[] arr, int target, int amount, int idx) {
		// TODO Auto-generated method stub
		if(amount==target) {
			c++;
			return;
		}
		for(int i=idx;i<arr.length;i++) {
			outcome(arr,target,amount+arr[i],i+1);
			outcome(arr,target,amount-arr[i],i+1);
		}
	}
	

}
