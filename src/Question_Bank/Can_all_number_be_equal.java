package Question_Bank;

public class Can_all_number_be_equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {75,150,75,50};
		isPossible(arr);
	}

	private static void isPossible(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			while(arr[i]%2==0) {
				arr[i]/=2;
			}
			while(arr[i]%3==0) {
				arr[i]/=3;
			}
			if(arr[i]!=arr[0]) {
				System.out.println("No");
				return; 
			}
		}
		System.out.println("Yes");
	}

}
 