package OOPS_G26;

public class My_Stack {
	protected int[] arr;
	protected int top;
	My_Stack(){
		this.arr=new int[10];
	}
	My_Stack(int n) {
		this.arr=new int[n];
	}
	public void push(int n) throws Exception {
		// TODO Auto-generated method stub
		if(this.isFull()) {
			throw new Exception("Stack is Full");
		}
		arr[top]=n;
		top++;
	}
	public int pop() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return arr[--top];
	}
	public int peek() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return arr[top-1];
	}
	public void display() {
		System.out.print("[ ");
		for(int i=0;i<top;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
	public boolean isEmpty() {
		return top==0;
	}
	public boolean isFull() {
		return top==arr.length;
	}
	public int size() {
		return top;
	}
	
}
