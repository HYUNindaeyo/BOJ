package 백준공부;

import java.util.Scanner;

public class BOJ14494 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int N = scan.nextInt();
		int M = scan.nextInt();
		long DP[][] = new long[N+1][M+1];
		DP[1][1] = 1;
		for (int i=1;i<=N;i++) {
			for (int j=1;j<=M;j++) {
				if (i==1&&j==1) continue;
				else DP[i][j] = (DP[i-1][j] + DP[i-1][j-1]+ DP[i][j-1])%1000000007;
				
				
			}
		}
/*		for (int i=1;i<=N;i++) {
			for (int j=1;j<=M;j++) {
				System.out.print(DP[i][j]+" ");
			}
			System.out.println();
		}
		*/
		System.out.print(DP[N][M]);
	}

}
