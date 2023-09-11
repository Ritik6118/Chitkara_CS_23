package arraylist;

import java.util.*;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<>(5);
		li.add(5);
		System.out.println(li);
		li.set(0, 55);
//		li.remove(0);
		System.out.println(li);
		li.add(5);
		System.out.println(li.get(0));
		System.out.println(li);
		Collections.sort(li);
	}

}
