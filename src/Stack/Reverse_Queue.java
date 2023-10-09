package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q);
		rev(q);
		System.out.println(q);
	}

	private static void rev(Queue<Integer> q) {
		// TODO Auto-generated method stub
		if(q.isEmpty()) {
			return;
		}
		int n=q.poll();
		rev(q);
		q.add(n);
	}

}
