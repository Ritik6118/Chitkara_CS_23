package OOPS;

public class Student_Client {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("welcome to student client");
		Student s2=new Student();
		System.out.println(s2.name);
		Student s1=new Student("ritik",23,10,5);
		s1.name="abc";
		try {
			s1.setAge(-1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println(s1.getAge());
//		System.out.println(s1.name);
	}
	
}
