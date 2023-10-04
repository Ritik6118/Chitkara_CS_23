package LinkeLIst;

import java.util.Scanner;

public class cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Node nn=new Node(0);
		Node head=nn;
		Node tail=nn;
		for(int i=0;i<n;i++) {
			if(i==0) {
				head.val=sc.nextInt();
			}
			else {
				nn.next=new Node(sc.nextInt());
				nn=nn.next;
				if(i==n-1) {
					tail=nn;
				}
			}
		}
		
		
//		create cycle
		
		tail.next=head.next.next;
		
//		remove cycle
		remove_Cycle(head);
		remove_Cycle_2(head);
		display(head);
	}

	private static void remove_Cycle_2(Node head) {
		// TODO Auto-generated method stub
		Node mp=detect(head);
		if(mp==null) {
			return;
		}
		int c=1;
		Node temp=mp;
		while(temp.next!=mp) {
			temp=temp.next;
			c++;
		}
		Node slow=head;
		Node fast=head;
		for(int i=0;i<c;i++) {
			fast=fast.next;
		}
		while(fast.next!=slow.next) {
			fast=fast.next;
			slow=slow.next;
		}
		fast.next=null;
	}

	private static void remove_Cycle(Node head) {
		// TODO Auto-generated method stub
		Node mp=detect(head);
		if(mp==null) {
			return;
		}
		Node a=head;
		while(a!=null) {
			Node b=mp;
			while(b.next!=mp) {
//				System.out.println("hi");
				if(b.next==a) {
					b.next=null;
					return;
				}
				b=b.next;
			}
			a=a.next;
		}
	}

	private static Node detect(Node head) {
		// TODO Auto-generated method stub
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast) {
				return slow;
			}
		}
		return null;
	}

	private static void display(Node head) {
		// TODO Auto-generated method stub
		while(head!=null) {
			System.out.print(head.val+" ");
			head=head.next;
		}
		System.out.println();
	}

}
class Node{
	int val;
	Node next;
	Node(int n){
		this.val=n;
	}
}