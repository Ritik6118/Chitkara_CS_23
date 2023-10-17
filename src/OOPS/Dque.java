package OOPS;

public class Dque {
	int [] arr;
	int front;
	int rear;
	int size;
	Dque(){
		this.arr=new int[10];
		front=0;
		rear=0;
		size=0;
	}
	public void pushfront(int n) {
		if(size==0) {
			arr[front]=n;
			size++;
		}
		else {
			front--;
			if(front<0) {
				front=arr.length-1;
			}
			arr[front]=n;
			size++;
		}
	}
	public void pushback(int n) {
		if(size==0) {
			pushfront(n);
		}
		else {
			rear++;
			rear%=arr.length;
			arr[rear]=n;
			size++;
		}
	}
	public int popfront() {
		int val=arr[front];
		front++;
		front%=arr.length;
		size--;
		return val;
	}
	public int popback() {
		int val=arr[rear];
		rear--;
		if(rear<0) {
			rear=arr.length-1;
		}
		size--;
		return val;
	}
	public int peekfront() {
		return arr[front];
	}
	public int peekback() {
		return arr[rear];
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==arr.length;
	}
	public void display() {
		int n=size;
		int i=front;
		while(n-->0) {
			System.out.print(arr[i++%arr.length]);
		}
	}
}
