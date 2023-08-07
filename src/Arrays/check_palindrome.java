package Arrays;

public class check_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbaa";
		System.out.println(isPalinrome(s));
	}
	private static boolean isPalinrome(String s) {
		// TODO Auto-generated method stub
		char[] arr=s.toCharArray();
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]!=arr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

}
