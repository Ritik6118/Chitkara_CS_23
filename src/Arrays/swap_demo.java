package Arrays;

public class swap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		swap(a,b);
		System.out.println("a== "+a+" b== "+b);
//		System.out.println(a+" "+b);
	}
	private static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swap fun running");
		System.out.println("a== "+a+" b== "+b);
		System.out.println("swap fun end");
	}
	

}
