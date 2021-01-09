package 백준공부;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ1495 {
	static int numbers[];
	static boolean[][] dp;
	static int N,M,S;
	static 	int Max = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		S = scan.nextInt();
		M = scan.nextInt();
		numbers = new int[N+2];
		dp = new boolean[N+3][M+1];
		for (int i = 2;i<=N+1;i++) {
			numbers[i] = scan.nextInt();
		}
		// TODO Auto-generated method stub
		
		
		dp[1][S] = true;
		recur(S);
		
	/*	for (int i=1;i<N+2;i++) {
			for (int j=0;j<M+1;j++) {
				if (dp[i][j])	System.out.printf("1 ");
				else System.out.printf("0 ");
			}
			System.out.println();
		}
	*/
		System.out.println(findMax());
	}
	
	static void recur(int preNum) {
		for (int i=2;i<N+2;i++) {
			//int tmp = numbers[i-1];
			int count = 0;
			for (int j=0;j<=M;j++) {
				if(dp[i-1][j]==true) {
					count++;
					if(0<=j-numbers[i]){
						dp[i][j-numbers[i]]=true;
					}
					if(j+numbers[i]<=M){
						dp[i][j+numbers[i]]=true;
					}
				}
				if(j==M&&count==0) {
					Max = -1;
					break;
				}
			}
		}
		
		
	}
	

	
	static int findMax() {

		int count = 0;
		if (Max == -1) {
			return Max;
		}
		for (int i=0;i<M+1;i++) {
			if(dp[N+1][i]) {
				count++;
				Max = i;
			}
			if(i==M&&count==0) {
				Max = -1;
			}
			//System.out.println(Max);

		}
		return Max;
	}

}