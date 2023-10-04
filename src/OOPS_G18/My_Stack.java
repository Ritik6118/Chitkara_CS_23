package OOPS_G18;

public class My_Stack {
	protected int [] arr;
	protected int top;
	
	My_Stack(){
		arr=new int[10];
	}
	My_Stack(int len){
		arr=new int[len];
	}
	public void push(int n) {
		arr[top]=n;
		top++;
	}
	public int pop() {
		
		return arr[--top];
	}
	public int peek() {
		return arr[top-1];
	}
	public int size() {
		return top;
	}
	public boolean isFull() {
		return top==arr.length;
	}
	public boolean isEmpty() {
		return top==0;
	}
	public void display() {
		System.out.print("[");
		for (int i = 0; i < top; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
}
