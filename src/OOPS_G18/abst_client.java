package OOPS_G18;

public class abst_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abst_demo ad=new abst_child();
		ad.fun();
		((abst_child)(ad)).fun3();
		
	}

}
