package Recursion;

public class First_occurance_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5,6,7,8,9,1,2,3,4,5,6};
		int item=5;
		System.out.println();
		firstoccur(arr,item,0);
	}

	private static void firstoccur(int[] arr, int item, int i) {
		// TODO Auto-generated method stub
		if(i>=arr.length) {
			return ;
		}
		if(arr[i]==item) {
			System.out.println(i);
		}
		
		firstoccur(arr,item,i+1);
	}

}
