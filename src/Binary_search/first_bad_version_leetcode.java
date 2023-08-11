package Binary_search;

public class first_bad_version_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public int firstBadVersion(int n) {
        int lo=0;
        int hi=n;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isBadVersion(mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }

}
