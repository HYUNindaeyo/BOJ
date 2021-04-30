package 백준공부;

import java.util.Scanner;

public class BOJ15989 {
	static int dp[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		dp = new int[10001][4];
		int T = scan.nextInt();
		for (int i=0;i<10001;i++) {
			dp[i][1] = 1;
			dp[i][2] = i/2;
		}
		for (int i=0;i<10001;i++) {
			for (int j=0;j<i/3;j++) {
				dp[i][3] = dp[i][3]+dp[i-(j+1)*3][2]+dp[i-(j+1)*3][1];
			}
		}
		for (int t=0;t<T;t++) {
			int N = scan.nextInt();
			System.out.println(dp[N][1]+dp[N][2]+dp[N][3]);
		}
	}

}
