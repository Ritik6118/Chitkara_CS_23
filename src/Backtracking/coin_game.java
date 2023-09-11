package Backtracking;

public class coin_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins= {1,2,5,10};
		int amount=10;
//		infinite supply
		outcomes(coins,amount,"");
//		finite supply
//		outcomes_finite(coins,amount,"",0);
	}

	private static void outcomes(int[] coins, int amount, String ans) {
		// TODO Auto-generated method stub
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<coins.length;i++) {
			if(coins[i]<=amount) {
				outcomes(coins,amount-coins[i],ans+coins[i]);				
			}
		}
	}
	private static void outcomes_finite(int[] coins, int amount, String ans, int idx) {
		// TODO Auto-generated method stub
		if(amount==0) {
			System.out.println(ans);
			return;
		}

		for(int i=idx;i<coins.length;i++) {
			if(coins[i]<=amount) {
				outcomes_finite(coins,amount-coins[i],ans+coins[i],i+1);				
			}
		}
	}


}
