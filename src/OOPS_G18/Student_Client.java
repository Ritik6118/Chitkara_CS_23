package OOPS_G18;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
//		System.out.println("Welcome to Sudent Client");
//		Student s = new Student();
//		s.name = "nishant";
//		s.age = 23;
//		s.roll_no = 5;
//		System.out.println(s.name);
//		System.out.println(s.age);
//		System.out.println(s.roll_no);
//		s.inroduction();
//		Student s2 = new Student();
//		s2.name="naman";
//		System.out.println(s.knowledge + " " + s2.knowledge);
//		s.teaches(s2);
//		System.out.println(s.knowledge +" "+ s2.knowledge );
//		s.fight(s2);

		
		
//		Constructor
		System.out.println(Student.count);
		Student s2=new Student();
		Student s=new Student("Ritik",5,23,10);
		System.out.println(Student.count);
//		System.out.println(s.name);
//		
//		try {
//			s.setAge(-5);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			System.out.println(e);
//		}
//		
//		System.out.println(s.getAge());
//		
	}

}
