package OOPS_G26;

public class Student {
	String name="Ritik";
	private int roll_no=5;
	int group=15;
	int knowledge=0;
	Student(){
		
	}
	Student(String name,int roll_no,int group,int knowledge){
		this.name=name;
		this.roll_no=roll_no;
		this.group=group;
		this.knowledge=knowledge;
	}
	public void introduction() {
		// TODO Auto-generated method stub
		System.out.println("hi my name is "+name + "and my roll no is "+getRoll_no());
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) throws Exception {
		if(roll_no>0) {
			this.roll_no = roll_no;			
		}
		else {
			throw new Exception("roll number can not be negative");
		}
	}
}
