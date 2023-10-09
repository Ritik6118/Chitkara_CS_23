package OOPS;

import java.util.Stack;

public class Queue_Using_Stack {
	Stack<Integer> st;
	Queue_Using_Stack(){
		st=new Stack<Integer>();
	}
	public boolean isEmpty() {
		return st.isEmpty();
	}
	public void enque(int n) {
		st.push(n);
	}
	public int deque() {
		return getLast(st);
	}
	private int getLast(Stack<Integer> st) {
		// TODO Auto-generated method stub
		Stack <Integer> st2=new Stack<>();
		while(!st.isEmpty()) {
			st2.push(st.pop());
		}
		int n=st2.pop();
		while(!st2.isEmpty()) {
			st.push(st2.pop());
		}
		return n;
	}
	public int getFront() {
		Stack <Integer> st2=new Stack<>();
		while(!st.isEmpty()) {
			st2.push(st.pop());
		}
		int n=st2.peek();
		while(!st2.isEmpty()) {
			st.push(st2.pop());
		}
		return n;
	}
	
}
