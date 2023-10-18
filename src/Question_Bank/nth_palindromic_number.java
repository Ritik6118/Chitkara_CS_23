package Question_Bank;

public class nth_palindromic_number {

	static int c=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1";
		int n=3;
		generate(s,n);
		
	}
	static boolean flag=false;
	private static void generate(String s, int n) {
		// TODO Auto-generated method stub
		if(ispalindrome(s)) {
			c++;
		}
		if(c==n && flag==false) {
			flag=true;
			System.out.println(s);
			return;
		}
		if(flag==false) {
			generate(s+"0",n);			
			generate(s+"1",n);
		}
		
	}
	private static boolean ispalindrome(String s) {
		// TODO Auto-generated method stub
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
