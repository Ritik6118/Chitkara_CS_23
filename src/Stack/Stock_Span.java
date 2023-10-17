package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Stock_Span {

	public static void main(String args[])  {
		// Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int[] ans=StockSpan(arr);
		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]+" ");
		}
		System.out.println("END");
	}
	public static int[] StockSpan(int [] arr){
		Stack <Integer> st=new Stack<>();
		int [] ans=new int[arr.length]; 
		for(int i=0;i<arr.length;i++){
			if(st.isEmpty()||arr[i]<arr[st.peek()]){
		        ans[i]=1;		        
			}
			else{
			    int c=1;
			    while(st.isEmpty()==false && arr[i]>=arr[st.peek()]){
			        c+=ans[st.pop()];
			    }
			    ans[i]=c;
			}
			st.push(i);
		}
		return ans;
	}

}
