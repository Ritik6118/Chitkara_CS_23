package Question_Bank;

public class Madhav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int m=4;
		solve(n,m);
	}

	private static void solve(int n, int m) {
		// TODO Auto-generated method stub
		int c=0;
		for(int i=3;i>=0;i++) {
			if(i%3==2 && i%m!=0) {
				System.out.println(i);
				c++;
			}
			if(c==n) {
				return;
			}
		}
	}

}
