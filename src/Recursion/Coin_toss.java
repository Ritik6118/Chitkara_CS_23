package Recursion;

public class Coin_toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		toss2(n, "");
	}

	private static void toss(int n, String ans) {
		// TODO Auto-generated method stub
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		toss(n - 1, ans + "H");
		toss(n - 1, ans + "T");
	}

//	coin toss without consecutive heads
	private static void toss2(int n, String ans) {
		// TODO Auto-generated method stub
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			toss2(n - 1, ans + "H");
		}

		toss2(n - 1, ans + "T");
	}

}
