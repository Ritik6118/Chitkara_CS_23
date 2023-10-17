package OOPS_G26;

import java.util.Stack;

public class two_stack_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two_Stack_In_Array st=new Two_Stack_In_Array();
		st.push1(1);
		st.push1(2);
		st.push1(3);
		
		st.push2(1);
		st.push2(2);
		st.push2(3);
		st.push2(4);
		st.push2(5);
		st.pop2();
//		st.display1();
//		st.display2();
		System.out.println(st);
		
//		Stack<Integer> st=new Stack<>();
//		st.push(1);
//		st.push(1);
//		st.push(1);
//		st.push(1);
//		System.out.println(st);
	}

}
