package Arrays;

public class Find_the_difference_LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		String t="eabcd";
		System.out.println(findTheDifference(s,t));
	}
	
	public static char findTheDifference(String s, String t) {
        int[] arr=new int[26];

        char[] ch1=t.toCharArray();
        char[] ch2=s.toCharArray();

        for(int i=0;i<ch1.length;i++){
            arr[ch1[i]-'a']++;
        }
        for(int i=0;i<ch2.length;i++){
            arr[ch2[i]-'a']--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                return (char) (i+'a');
            }
        }
        return 'a';
    }

}
