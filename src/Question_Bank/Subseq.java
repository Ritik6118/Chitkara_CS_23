package Question_Bank;

public class Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		subseq(reverse(s),"");
	}

	private static void subseq(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(reverse(ans));
			return;
		}
		subseq(s.substring(1),ans);
		subseq(s.substring(1),ans+s.charAt(0));
	}

	private static String reverse(String ans) {
		// TODO Auto-generated method stub
		String s="";
		for(int i=ans.length()-1;i>=0;i--) {
			s+=ans.charAt(i);
		}
		return s;
	}

}
