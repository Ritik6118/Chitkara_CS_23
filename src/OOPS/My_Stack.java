package OOPS;

public class My_Stack {
	private int[] arr;
	private int top;
	My_Stack(){
		this.arr=new int[10];
		this.top=0;
	}
	My_Stack(int len){
		this.arr=new int[len];
		this.top=0;
	}
	
	public void push(int n ) throws Exception {
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
	public boolean isFull() {
		return top==arr.length;
	}
	public boolean isEmpty() {
		return top==0;
	}
	public int size() {
		return top;
	}
}
