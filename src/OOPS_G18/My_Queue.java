package OOPS_G18;

public class My_Queue {
	private int[] arr;
	private int front;
	private int size;
	My_Queue(){
		this.arr=new int[10];
	}
	My_Queue(int n) {
		this.arr=new int [n];
	}
	
	public boolean isFull() {
		// TODO Auto-generated method stub
		return size==arr.length;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public int getFront() {
		return arr[front];
	}
	public int deque() {
		int val=arr[front];
		front++;
		front%=arr.length;
		size--;
		return val;
	}
	public void enque(int n) {
		int idx=front+size;
		idx%=arr.length;
		arr[idx]=n;
		size++;
	}
	public void display() {
		int idx=front;
		int n=size;
		while(n-->0) {
			System.out.print(arr[idx%arr.length]+" ");
			idx++;
		}
		System.out.println();
	}
	
}
