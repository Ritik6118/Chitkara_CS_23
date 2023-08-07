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
		int[] freq=new int[26];
		for(int i=0;i<arr1.length;i++) {
			freq[arr1[i]-'a']++;
			
		}
		for(int i=0;i<arr2.length;i++) {
			freq[arr2[i]-'a']--;
			
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0) {
				return false;
			}
		}
        return true;
    }

}
