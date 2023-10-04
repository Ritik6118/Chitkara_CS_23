package OOPS_G26;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Parent p=new Parent();
//		p.fun();
//		p.fun1();
//		System.out.println(p.d);
//		System.out.println(p.d1);
		
//		Child c=new Child();
//		System.out.println(c.d1);
//		System.out.println(((Parent)(c)).d);
//		System.out.println(c.d2);
//		
//		c.fun();
//		c.fun1();
//		c.fun2();
		
		Parent p=new Child();
//		System.out.println(p.d2);
		System.out.println(((Child)(p)).d2);
		p.fun();
		
//		Child c=new Parent();
	}

}
