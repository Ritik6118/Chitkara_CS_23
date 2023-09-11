package Arrays;

import java.util.Arrays;

public class Candy_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int candy(int[] arr) {
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                left[i]=left[i-1]+1;
            }
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                right[i]=right[i+1]+1;
            }
        }
        int ans=0;
        for(int i=0;i<left.length;i++){
            ans+=Math.max(left[i],right[i]);
        }
        return ans;
    }

}
