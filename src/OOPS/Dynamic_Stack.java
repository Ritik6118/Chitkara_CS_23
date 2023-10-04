package OOPS;

public class Dynamic_Stack extends My_Stack {
	
	@Override
	public void push(int n) {
		if(super.isFull()) {
			int[] arr2=new int [super.arr.length*2];
			for(int i=0;i<super.arr.length;i++) {
				arr2[i]=super.arr[i];
			}
			super.arr=arr2;
		}
		arr[top]=n;
		top++;
	}
}
