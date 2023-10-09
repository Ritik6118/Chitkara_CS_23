package OOPS_G26;

public class My_Queue {
	private int[] arr;
	private int front;
	private int size;
	My_Queue(){
		arr=new int[10];
	}
	My_Queue(int n){
		arr=new int [n];
	}
	public boolean isFull() {
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
		size--;
		front++;
		front%=arr.length;
		return val;
	}
	public void enque(int n) {
		int idx=size+front;
		idx%=arr.length;
		arr[idx]=n;
		size++;
	}
	public void display() {
		int idx=front;
		for(int i=0;i<size;i++) {
			System.out.print(arr[idx%arr.length]+" ");
			idx++;
		}
		System.out.println();
	}
}
