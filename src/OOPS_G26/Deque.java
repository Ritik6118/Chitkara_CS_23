package OOPS_G26;

public class Deque {
	int [] arr;
	int front;
	int rear;
	int size;
	Deque(){
		this.arr=new int[10];
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
				 
			}
		}
	}
	public void pushBack() {
		
	}
	public int popFront() {
		
	}
	public int popBack() {
		
	}
	public boolean isFull() {
		
	}
	public boolean isEmpty() {
		
	}
	public int size() {
		
	}
	public void display() {
		
	}
}
