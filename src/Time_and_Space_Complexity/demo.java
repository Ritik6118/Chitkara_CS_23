package Time_and_Space_Complexity;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		long st=System.nanoTime();
//		int c=0;
//		for(int i=0;i<1000000;i++) {
//			c++;
//		}
//		long et=System.nanoTime();
////		
//		long tt=et-st; 
//		System.out.println(tt/1000000 + " mili seconds ");
		
//		System.out.println("hi");
		
//		System.out.println(3000+4000);
		
//		System.out.println("hi");
//		System.out.println("hi");
//		System.out.println("hi");
//		System.out.println("hi");
//		System.out.println("hi");
		
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("hi");
//		}
		
		
//		Scanner sc=new Scanner (System.in);
//		int n=sc.nextInt();
//		int c=0;
//		for(int i=0;i<=n;i++) {
//			c++;
//		}
//		
		
//		Scanner sc=new Scanner (System.in);
//		int n=sc.nextInt();
//		System.out.println(n);
				
		
		
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			i++;
		}
																								// O(N)
		i=1;
		while (i <= n) {
			System.out.println("Hey");
			i *= 2;
		}
																							//O(log(N)

		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
		}
																										// O(log(N)

		while (i <= n) {
			System.out.println("Hey");
			i += 2;
			i += 3;
		}
																								// O(N)


		while (i <= n) {
			System.out.println("Hey");
			i *= 2;
			i *= 3;
		}
																													// O(log(N)  base 6 

		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
			n /= 3;
		}
																														// O(log(N)  base 6 

		while (i <= n) {
			System.out.println("Hey");
			i += k;
		}
																																		// n/K

		while (i <= n) {
			System.out.println("Hey");
			i *= k;
		}
																							// log N base k


		while (n > 0) {
			System.out.println("Hey");
			n = n - 1;
		}
																								//O(n)

																										//O(n)

		while (n > 0) {
			n = n - k;
		}
																									// n/K
		while (n > 0) {
			System.out.println("Hey");
			n = n - 2;
			n = n - 3;
		}


		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.println("hey");
			}
		}
																															// N^2


		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
		}

																														// Sqrt(N)

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= 1000; k++) {
				}
			}
		}
	            																						// 1000*N^2



		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i ; j++) {
				for (int k = 1; k <= n / 2; k++) {
					System.out.println("hey");

				}
			}
		}
																																// N^4


		for( i=1; i<=n; i*=2) {
			System.out.println("hey");
		}
																												//	log(N)
				

		for(i=n/2; i<=n; i++) {
			for(int j=1; j<=n/2; j++) {
				for(int k=1; k<=n; k=k*2) {
					System.out.println("hey");
				}
			}
		}
																													// N^2 log(n)

		for(i=1; i<=n; i++) {
			for(int j=1; j<=n; j+=i) {
				System.out.println("hey");
			}
		}
																															// O N*Log(N)
		         


	}
		
		
	}

}
