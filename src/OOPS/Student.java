package OOPS;

import java.util.Random;

public class Student {
	String name ="defaut";
	int roll_number=4;
	int knowledge=99;
	private int age=23;
	Student(){
		
	}
	Student(String s,int a,int k,int r){
		this.name=s;
		this.roll_number=r;
		this.knowledge=k;
		this.age=a;
	}
	//	introducion
		public void introduction() {
			System.out.println("Hello my Name is "+this.name + " and i am " +getAge() +" years old");
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) throws Exception {
			
			if(age>3) {
				this.age = age;				
			}
			else {
				throw new Exception("age is negative");
			}
		}
		
		//	study
	//	fight
//	Random rd=new Random();
	
//	public void fight(Student s) {
//		int sh1=10;
//		int sh2=10;
//		
//		for(int i=1;i<=10;i++) {
//			boolean b=rd.nextBoolean();
//			if(b) {
//				int a=rd.nextInt(1,3);
//				if(a==1) {
//					System.out.println(this.name +" slaps "+s.name);
//					sh1-=1;
//				}
//				else if(a==2){
//					System.out.println(this.name +" kicks "+s.name);
//					sh1-=2;
//				}
//				else {
//					System.out.println(this.name +" punches "+s.name);
//					sh1-=3;
//				}
//				
//			}
//			else {
//				int a=rd.nextInt(1,3);
//				if(a==1) {
//					System.out.println(s.name +" slaps "+this.name);
//					sh2-=1;
//				}
//				else if(a==2){
//					System.out.println(s.name +" kicks "+this.name);
//					sh2-=2;
//				}
//				else {
//					System.out.println(s.name +" punches "+this.name);
//					sh2-=3;
//				}
//			}	
//		}
//		if(sh1==sh2) {
//			System.out.println("its a tie fight again");
//			
//		}
//		else if(sh1<sh2) {
//			System.out.println(s.name+" wins");
//		}
//		else {
//			System.out.println(this.name +" wins");
//		}
//	}

}
