package Arrays;

public class isAnagram_leetcode_freqArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="asdfghjkl";
		String t="hfjdkslag";
		System.out.println(isAnagram(s,t));
	}
	public static boolean isAnagram(String s, String t) {
        char[] arr1= s.toCharArray();
        char[] arr2= t.toCharArray();
        if(arr1.length!=arr2.length) {
        	return false;
        }
		int[] freq1=new int[26];
		int[] freq2=new int[26];
		for(int i=0;i<arr1.length;i++) {
			freq1[arr1[i]-'a']++;
			
		}
		for(int i=0;i<arr2.length;i++) {
			freq2[arr2[i]-'a']++;
			
		}
		for(int i=0;i<freq1.length;i++) {
			if(freq1[i]!=freq2[i]) {
				return false;
			}
		}
        return true;
    }

}
