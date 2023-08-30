package Recursion;

public class count_subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		System.out.println(subseq(s,""));
		System.out.println(c);
	}
	static int c=0;
	private static int subseq(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			c++;
			return 1;
		}
		int a=subseq(s.substring(1),ans);
		int b=subseq(s.substring(1),ans+s.charAt(0));
		return a+b;
	}

}
