package OOPS_G18;

public class Two_Stacks_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two_Stacks st=new Two_Stacks();
		st.push1(1);
		st.push1(2);
		st.push1(3);
		
		st.push2(1);
		st.push2(2);
		st.push2(3);
		st.push2(4);
		st.push2(5);
		st.pop1();
		st.pop2();
		st.display1();
		st.display2();
		System.out.println(st);
		
	}

}
