package Arrays;

public class finddiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		String t="abcde";
		System.out.println(findTheDifference(s,t));
	}
	public static char findTheDifference(String s, String t) {
		char[] arr1=s.toCharArray();
		char[] arr2=t.toCharArray();
		int[] freq=new int[26];
		for (int i = 0; i < arr1.length; i++) {
			freq[arr1[i]-'a']++;
		}
		for (int i = 0; i < arr2.length; i++) {
			freq[arr2[i]-'a']--;
		}
//		display(freq);
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0) {
				return (char)(i+'a');
			}
		}
		return 'c';
    }
	private static void display(int[] freq) {
		// TODO Auto-generated method stub
		for(int i=0;i<freq.length;i++) {
			System.out.print(freq[i]+" ");
		}
		System.out.println();
	}

}
