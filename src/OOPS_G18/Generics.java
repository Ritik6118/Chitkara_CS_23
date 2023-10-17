package OOPS_G18;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr= {1,2,3,4,5};
		String[] arr2= {"abc","def","ghi","jkl"};
//		display(arr);
		ArrayList li=new ArrayList();
		li.add(5);
		li.add("abcd");
		li.add(true);
		System.out.println(li);
	}

	private static <T> void display(T[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
