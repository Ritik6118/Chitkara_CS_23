package Recursion;

public class string_permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abca";
		permutations(s,"");
	}
	public static void permutations(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}
		boolean[] arr=new boolean[26];
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if(arr[ch-'a']==false) {
				arr[ch-'a']=true;
				String s1 = s.substring(0, i);
				String s2 = s.substring(i + 1);
				permutations(s1 + s2, ans + ch);				
			}
		}

	}
	

}
