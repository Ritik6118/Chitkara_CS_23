package Stack;

import java.util.Stack;

public class Reverse_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		reverse(st);
		System.out.println(st);
	}

	private static void reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			return;
		}
		int n=st.pop();
		reverse(st);
		insert_at_bottom(n,st);
	}

	private static void insert_at_bottom(int n, Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			st.push(n);
			return;
		}
		int val=st.pop();
		insert_at_bottom(n,st);
		st.push(val);
	}

}
