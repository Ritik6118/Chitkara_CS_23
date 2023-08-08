package Arrays;

public class char_typecast_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char a='z';
//		System.out.println((int)(a-'a'));
//		for(int i=0;i<26;i++) {
//			System.out.println((char)(i+'a'));
//		}
		String s="abcabc";
		char[] arr=s.toCharArray();
		int[] freq=new int[26];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]-'a']++;
		}
//		display(freq);
	}

	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
