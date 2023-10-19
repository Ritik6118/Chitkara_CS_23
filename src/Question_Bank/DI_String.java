package Question_Bank;

import java.util.Scanner;
import java.util.Stack;

public class DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0) {
			solution(sc.next());
		}
	}

	private static void solution(String s) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
        int n=1;
        for(int i=0; i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='D'){
                st.push(n++);
            }else{
                st.push(n++);
                while(!st.isEmpty()){
                    System.out.print(st.pop());
                }
            }
        }
        st.push(n);
        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
        System.out.println();
	}

}
