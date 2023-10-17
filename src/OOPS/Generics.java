package OOPS;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr= {1,2,3,4,5,6,7};
		String [] arr2= {"ritik","gaurav","dashdva"+"fljla"+"dakjbdk"};
		display(arr2);
		display(arr);
	}

	public static <T> void display(T[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

}
