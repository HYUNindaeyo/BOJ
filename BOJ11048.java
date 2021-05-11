package 백준공부;

import java.util.Scanner;

public class BOJ11048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int DP[][] = new int[N+1][M+1];
		int candy[][] = new int[N+1][M+1];
		for(int i=1;i<=N;i++) {
			for (int j=1;j<=M;j++) {
				candy[i][j] = scan.nextInt();
			}
		}
		for(int i=1;i<=N;i++) {
			for (int j=1;j<=M;j++) {
				DP[i][j] = Math.max(Math.max(DP[i-1][j], DP[i][j-1]),DP[i-1][j-1])+candy[i][j];
			}
		}
		System.out.print(DP[N][M]);
	}

}
