package OOPS_G26;

public class Linked_List {
	Node head;
	Node tail;
	int size;
	
	
	public void addFirst(int n) {
		Node nn=new Node(n);
		if(size==0) {
			head=nn;
			tail=nn;
			size++;
		}
		else {
			nn.next=head;
			head=nn;
			size++;
		}
	}
	public void addLast(int n) {
		Node nn=new Node(n);
		if(size==0) {
			addFirst(n);
		}
		else {
			tail.next=nn;
			tail=tail.next;
			size++;
		}
	}
	public int getFirst() {
		return head.data;
	}
	public int getLast() {
		return tail.data;
	}
	public int getAtIndex(int k) {
		if(size==0) {
			return getFirst();
		}
		if(k==size) {
			return getLast();
		}
		else {
			return getNode(k).data;
		}
	}
	private Node getNode(int k) {
		
		Node n=head;
		for(int i=0;i<k;i++) {
			n=n.next;
		}
		return n;
	}
	public int removeFirst() {
		int rd=head.data;
		Node rem=head;
		head=head.next;
		rem.next=null;
		size--;
		return rd;
	}
	public int removeLast() {
		int rd=tail.data;
		getNode(size-1).next=null;
		size--;
		return rd;
		
	}
	public int removeAtINdex(int k) {
		if(size==0) {
			return removeFirst();
		}
		if(size==k) {
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
	
	
	
	
	
	public class Node {
		int data;
		Node next;
		
		Node(int n){
			this.data=n;
		}
	}
	
}
