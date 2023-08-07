package Function;

public class call_stack_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 5;
		add(a, b);
		sub(a,b);
		mul(a,b);
		div(a,b);
	}

	private static void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + b);
		sub(a, b);
	}

	private static void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a - b);
		mul(a, b);
	}

	private static void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a * b);
		div(a, b);
	}

	private static void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a / b);
	}

}
