package Recursion;

public class maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		path(0, 0, m - 1, n - 1, "");
	}

	private static void path(int cr, int cc, int er, int ec, String ans) {
		// TODO Auto-generated method stub
		if (cr == er && cc == ec) {
			System.out.println(ans);
		}
		if (cr > er || cc > ec) {
			return;
		}

		path(cr, cc + 1, er, ec, ans + "> ");
		path(cr + 1, cc, er, ec, ans + "v ");
	}

}
