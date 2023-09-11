package Backtracking;

public class queen_permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q=2;
		int n=4;
		boolean[] board=new boolean[n];
		possiblities(q,board,0,"");
	}

	private static void possiblities(int q, boolean[] board, int qp, String ans) {
		// TODO Auto-generated method stub
		if(qp==q) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				possiblities(q,board,qp+1,ans+"Q"+qp+"B"+i+" ");
				board[i]=false;
			}
		}
	}
	
	

}
