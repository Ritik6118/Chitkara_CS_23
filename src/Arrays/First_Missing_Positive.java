package Arrays;

public class First_Missing_Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4};
		System.out.println(firstMissingPositive(arr));
	}
	
	public static int firstMissingPositive(int[] nums) {
        int[] arr=new int[nums.length+2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && nums[i]<arr.length){
                arr[nums[i]]=nums[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                return i;
            }
        }
        return 1234;
    }
	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
