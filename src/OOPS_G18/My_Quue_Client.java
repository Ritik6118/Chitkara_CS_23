package OOPS_G18;

public class My_Quue_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_Queue q=new My_Queue(5);
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
		q.display();
		q.deque();
		q.deque();
		
		q.display();
		q.enque(10);
		q.display();
		
	}

}
