package OOPS_G18;

public class Two_Stacks {
	int[] arr;
	int top1;
	int top2;
	Two_Stacks(int n){
		this.arr=new int[n];
		top1=0;
		top2=arr.length-1;
	}
	Two_Stacks(){
		this.arr=new int[10];
		top1=0;
		top2=arr.length-1;
	}
	
	public void push1(int n) {
		arr[top1++]=n;
	}
	public void push2(int n) {
		arr[top2--]=n;
	}
	public int pop1() {
		return arr[--top1];
	}
	public int pop2() {
		return arr[++top2];
	}
	public int peek1() {
		return arr[top1-1];
	}
	public int peek2() {
		return arr[top2+1];
	}
	public int size1() {
		return top1;
	}
	public int size2() {
		return arr.length-top2-1;
	}
	public void display1() {
		for (int i = 0; i < top1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void display2() {
		for (int i = arr.length-1; i > top2; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public boolean isEmpty1() {
		return top1==0;
	}
	public boolean isEmpty2() {
		return top2==arr.length-1;
	}
	public boolean isFull1() {
		return top1>top2;
	}
	public boolean isFull2() {
		return top1>top2;
	}
	
	public String toString() {
		String s="[ ";
		for (int i = 0; i < top1; i++) {
			s+=arr[i]+" ";
		}
		s+="]\n[ ";
		for (int i = arr.length-1; i > top2; i--) {
			s+=arr[i]+" ";
		}
		return s+"]";
	}
}
