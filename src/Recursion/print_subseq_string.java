package Recursion;

public class print_subseq_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		subseq(s,"");
	}

	private static void subseq(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		subseq(s.substring(1),ans);
		subseq(s.substring(1),ans+s.charAt(0));
		
	}

}
