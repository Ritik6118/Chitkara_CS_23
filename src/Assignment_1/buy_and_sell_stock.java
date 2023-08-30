package Assignment_1;

import java.util.Scanner;

public class buy_and_sell_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		max_profit(arr);
	}

	private static void max_profit(int[] arr) {
		// TODO Auto-generated method stub
		int min=arr[0];
		int max_profit=0;
		for(int i=0;i<arr.length;i++) {
			min=Math.min(arr[i],min);
			int profit=arr[i]-min;
			max_profit=Math.max(max_profit, profit);
		}
		System.out.println(max_profit);
	}

}
