package OOPS_G26;

public class Linked_List<T> {
	Node head;
	Node tail;
	int size;
	
	public void addFirst(T n) {
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
	public void addLast(T n) {
		if(size==0) {
			addFirst(n);
		}
		else{
			Node nn=new Node(n);
			tail.next=nn;
			tail=tail.next;
			size++;
		}
	}
	public void addAtIndex(int k,T n) {
		if(k==0) {
			addFirst(n);
		}
		else if(k==size) {
			addLast(n);
		}
		else {
			Node nn=new Node(n);
			Node prev=getNode(k-1);
			nn.next=prev.next;
			prev.next=nn;
			size++;
		}
	}
	public T getFirst() {
		return head.data;
	}
	public T getLast() {
		return tail.data;
	}
	public T getAtIndex(int k) {
		return getNode(k).data;
	}
	public T removeFirst() {
		Node rn=head;
		head=head.next;
		rn.next=null;
		size--;
		return rn.data;
	}
	public T removeLast() {
		Node ln=getNode(size-2);
		Node rn=tail;
		ln.next=null;
		tail=ln;
		size--;
		return rn.data;
	}
	private Node getNode(int k) {
		Node temp=head;
		for(int i=0;i<k;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public T removeAtIndex(int k) {
		if(k==0) {
			return removeFirst();
		}
		else if(k==size) {
			return removeLast();
		}
		else {
			Node prev=getNode(k-1);
			Node curr=prev.next;
			prev.next=curr.next;
			curr.next=null;
			size--;
			return curr.data;
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
		T data;
		Node next;
		Node(T n){
			this.data=n;
		}
	}
}
