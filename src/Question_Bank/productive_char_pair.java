package Question_Bank;

public class productive_char_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="electronics";
		tag(s);
	}

	private static void tag(String s) {
		// TODO Auto-generated method stub
		int i=0;
		int j=1;
		String ans="";
		while(j<s.length() && i<s.length()) {
			ans+=(char)(Math.max(s.charAt(i),s.charAt(j)));
			i+=2;
			j+=2;
		}
		if(i<s.length()) {
			ans+=s.charAt(i);
		}
		
		System.out.println(ans);
	}

}
