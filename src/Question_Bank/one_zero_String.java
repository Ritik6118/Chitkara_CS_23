package Question_Bank;

public class one_zero_String {

	static int len;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="001000111";
		len=s.length();
		solve(s);
		System.out.println(len);
	}
	private static void solve(String s) {
		// TODO Auto-generated method stub
		len=Math.min(len, s.length());
		int a=s.indexOf("00");
		if(a>=0) {
			String st="";
			if(a+2<s.length()) {
				st+=s.substring(0,a)+s.substring(a+2);				
			}
			else {
				st+=s.substring(0,a);
			}
			solve(st);
		}
		a=s.indexOf("10");
		if(a>=0) {
			String st="";
			if(a+2<s.length()) {
				st+=s.substring(0,a)+s.substring(a+2);				
			}
			else {
				st+=s.substring(0,a);
			}
			solve(st);
		}
	}
	

}
