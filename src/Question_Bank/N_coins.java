package Question_Bank;

import java.util.Scanner;

public class N_coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			String[] arr=new String[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.next();
			}
			sort(arr);
			for(int i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}

	private static void sort(String[] arr) {
		// TODO Auto-generated method stub
		for(int pass=1;pass<arr.length;pass++) {
			for(int i=0;i<arr.length-pass;i++) {
				if((arr[i]+arr[i+1]).compareTo(arr[i+1]+arr[i])>0) {
					String temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}

}
