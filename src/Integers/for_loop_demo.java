package lec5;

public class for_loop_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1;
//		while(i<=5) {
//			System.out.println("hi");
//			i++;
//		}
		
		for(int i=1;i<=5;i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
//			i++;
		}
//		System.out.println(i);
		
	}

}
