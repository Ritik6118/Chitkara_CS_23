package OOPS_G18;

import java.util.Random;

public class Student {
	String name;
	int roll_no;
	int age;
	int knowledge;
	
	public void inroduction() {
		// TODO Auto-generated method stub
		System.out.println("Heloo my self "+name+" and my age is "+age);
	}
//	study
	public void study() {
		// TODO Auto-generated method stub
		System.out.println(name+" is studying");
		knowledge++;
	}
//	teaches
	public void teaches( Student s) {
		// TODO Auto-generated method stub
		System.out.println(this.name +" is teaching " + s.name);
		this.knowledge++;
		s.knowledge++;
	}
//	fight
	public void fight(Student s) {
		Random rd=new Random();
		int sh1=10;
		int sh2=10;
		for(int i=0;i<10;i++) {
			boolean b=rd.nextBoolean();
			if(b==true) {
				int attack=rd.nextInt(1,3);
				if(attack==1) {
					System.out.println(this.name +" slaps "+s.name);
					sh2--;
				}
				if(attack==2) {
					System.out.println(this.name +" punches "+s.name);
					sh2-=2;
				}
				if(attack==3) {
					System.out.println(this.name +" kicks "+s.name);
					sh2-=3;
				}
			}
			else {
				int attack=rd.nextInt(1,3);
				if(attack==1) {
					System.out.println(s.name +" slaps "+this.name);
					sh1--;
				}
				if(attack==2) {
					System.out.println(s.name +" punches "+this.name);
					sh1-=2;
				}
				if(attack==3) {
					System.out.println(s.name +" kicks "+this.name);
					sh1-=3;
				}
			}
			if(sh1<0 ||sh2<0) {
				System.out.println("Knock out");
				break;
			}
			
		}
		if(sh1<sh2) {
			System.out.println(this.name+" wins");
		}
		else if(sh1==sh2) {
			System.out.println("its  a tie");
		}
		else {
			System.out.println(s.name + "wins");
		}
	}
	
}
