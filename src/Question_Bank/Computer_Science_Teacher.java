package Question_Bank;

import java.util.Scanner;

public class Computer_Science_Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char[] ans={'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		int t=Integer.parseInt(sc.nextLine());
		while(t-->0) {
			String [] arr=sc.nextLine().split(" ");
			int c=0;
			for(int i=0;i<ans.length;i++) {
				if(arr[i].charAt(0)==ans[i]) {
					c++;
				}
			}
			System.out.println(c);
		}
	}

}
