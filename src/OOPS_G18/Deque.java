package OOPS_G18;

public class Deque {
	int[] arr;
	int front;
	int rear;
	int size;
	Deque(){
		arr=new int[10];
		front=0;
		rear=0;
		size=0;
	}
	Deque(int n){
		arr=new int[n];
		front=0;
		rear=0;
		size=0;
	}
	public void pushFront(int n) {
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
	public void pushBack(int n) {
		if(size==0) {
			pushFront(n);
		}
		else {
			rear++;
			rear%=arr.length;
			arr[rear]=n;
			size++;
		}
	}
	public int popFront() {
		int val=arr[front];
		front++;
		front%=arr.length;
		size--;
		return val;
	}
	public int popBack() {
		int val=arr[rear];
		rear--;
		if(rear<0) {
			rear=arr.length-1;
		}
		size--;
		return val;
	}
	public int peekFront() {
		return arr[front];
	}
	public int peekBack() {
		return arr[rear];
	}
	public int size() {
		return size;
	}
	public void display() {
		int n=size;
		int i=front;
		while(n-->0) {
			System.out.print(arr[i++%arr.length]+" ");
		}
		System.out.println();
	}
	
}
