package Binary_search;

public class Sqrt_x_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(10));
	}
	public static int mySqrt(int x) {
        int lo=1;
        int hi=x;
        int ans=0;
        while(lo<=hi) {
        	int mid=lo+(hi-lo)/2;
        	long prod=mid*mid;
        	if(prod<=x) {
        		ans=mid;
        		lo=mid+1;
        	}
        	else {
        		hi=mid-1;
        	}
        }
        return ans;
    }

}
