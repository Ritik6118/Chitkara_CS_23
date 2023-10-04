package OOPS;

public class Linked_List {
	Node head;
	Node tail;
	int size;
	
	public void addFirst(int n) {
		// TODO Auto-generated method stub
		Node nn=new Node(n);
		if(size==0) {
			head=nn;
			tail=nn;
		}
		else {
			nn.next=head;
			head=nn;
		}
		size++;
	}
	public void addLast(int n) {
		if(size==0) {
			addFirst(n);
		}
		else {
			Node nn=new Node(n);
			tail.next=nn;
			tail=nn;
			size++;
		}
	}
	public void addAtIndex(int n,int k) {
		if(k==0) {
			addFirst(n);
			return;
		}
		if(k==size) {
			addLast(n);
			return;
		}
		else {
			Node nn=new Node(n);
			Node pre=getNode(k-1);
			nn.next=pre.next;
			pre.next=nn;
			size++;
		}
	}
	public int getFirst() {
		return head.data;
	}
	public int getLast() {
		return tail.data;
	}
	public int getAtIndex(int k) throws Exception {
		if(k<0||k>=size) {
			throw new Exception("index out of range of linkedlist");
		}
		if(k==0) {
			return getFirst();
		}
		else if(k==size-1) {
			return getLast();
		}
		return getNode(k).data;
	}
	
	private Node getNode(int k) {
		// TODO Auto-generated method stub
		Node temp=head;
		for(int i=0;i<k;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public int removeFirst() {
		int rd=head.data;
		head=head.next;
		size--;
		return rd;
	}
	public int removeLast() {
		int rd=tail.data;
		tail=getNode(size-2);
		size--;
		tail.next=null;
		return rd;
	}
	public int removeAtIndex(int k) {
		if(k==0) {
			return removeFirst();
		}
		else if(k==size-1) {
			return removeLast();
		}
		else {
			int rd=getNode(k).data;
			Node prev=getNode(k-1);
			prev.next=prev.next.next;
			size--;
			return rd;
		}
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}

	public class Node{
		int data;
		Node next;
		Node(int n){
			this.data=n;
		}
	}
	
}
