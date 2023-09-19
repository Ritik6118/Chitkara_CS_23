package Backtracking;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][]board = {{'A','B','C','E'},
				 		 {'S','F','C','S'},
				 		 {'A','D','E','E'}};
		String s="ABAB";
		boolean ans=exist(s,board);
		System.out.println(ans);
	}

	private static boolean exist(String s, char[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==s.charAt(0)) {
					if(search(s,arr,i,j)==true) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private static boolean search(String s, char[][] arr, int cr, int cc) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			return true;
		}
		if(cr>=arr.length||cc>=arr.length||cr<0||cc<0||arr[cr][cc]!=s.charAt(0)) {
			return false;
		}
		int[] r= {1,-1,0,0};
		int[] c= {0,0,1,-1};
		for(int i=0;i<r.length;i++) {
			arr[cr][cc]='*';
			if(search(s.substring(1),arr,cr+r[i],cc+c[i])) {
				return true;
			}
			arr[cr][cc]=s.charAt(0);
		}
		return false;
	}

}
