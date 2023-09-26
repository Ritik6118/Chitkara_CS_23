package OOPS_G26;

public class Student_Client {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("welcome");
//		System.out.println(s2.name);
//		
//		Student s=new Student();
//		s.name="abc";
//		System.out.println(s.name);
		Student s2=new Student("abcd",21,26,0);
		try {
			s2.setRoll_no(-1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println(s2.getRoll_no());
		
	}

}
