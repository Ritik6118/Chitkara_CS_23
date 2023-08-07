package Function;

public class Global_var_demo {
	static int val=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
//		System.out.println(val);
		fun1();
		fun2();
	}
	public static void fun2() {
		// TODO Auto-generated method stub
		System.out.println("this is fun2");
		System.out.println(val);
	}
	public static void fun1() {
		// TODO Auto-generated method stub
		val =11;
		System.out.println("this is fun 1");
		System.out.println(val);
	}

}
