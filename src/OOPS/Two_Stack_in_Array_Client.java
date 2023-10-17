package OOPS;

import java.util.Stack;

public class Two_Stack_in_Array_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two_Stack_In_Array st=new Two_Stack_In_Array(10);
		
		st.push1(1);
		st.push1(2);
		st.push1(3);
		st.push1(4);
		
		st.push2(1);
		st.push2(2);
		st.push2(3);
		
		System.out.println(st.isFull());
//		st.display1();
//		st.display2();
		System.out.println(st);
		
		
	}

}
