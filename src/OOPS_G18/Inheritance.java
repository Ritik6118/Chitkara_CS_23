package OOPS_G18;

public class Inheritance {
//	static {
//		System.out.println("hello from static block2");
//	}
//	static {
//		System.out.println("hello from static block");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello from main");
//		Parent p=new Parent();
//		p.fun();
//		p.fun1();
		
//		Child c=new Child();
//		c.fun1();
//		System.out.println();
		Parent p=new Child();
		System.out.println(p.d);
		System.out.println(((Child)(p)).d);
		System.out.println(((Child)(p)).d2);
		System.out.println(p.d1);
		p.fun();
		p.fun1();
		((Child)(p)).fun();
		((Child)(p)).fun2();
		
//		Child c=new Parent();
	}

}
