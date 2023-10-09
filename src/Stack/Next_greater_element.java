package Stack;

import java.util.Stack;

public class Next_greater_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long[] ans=new long[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            // chek for nge
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                int idx=st.pop();
                ans[idx]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;
    } 

}
