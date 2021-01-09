package 백준공부;


import java.util.*;

public class BOJ5582 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] str1 =scan.nextLine().toCharArray();
		char[] str2 =scan.nextLine().toCharArray();
		int N = str1.length;
		int M = str2.length;
		int Max = 0;
		int[][] DP = new int[N+1][M+1];
		/*
		for(int i=0;i<str1.length;i++) {
			System.out.printf(str1[i]+" ");
		}
		for(int i=0;i<str2.length;i++) {
			System.out.printf(str2[i]+" ");
		}
		*/
		
		for(int i=0;i<=N;i++) {
			for (int j=0;j<=M;j++) {
				if(i==0||j==0) {
					DP[i][j]=0;
					continue;
				}
				if (str1[i-1]==str2[j-1]) {
					DP[i][j] = DP[i-1][j-1]+1;
				}
				
				
			}
		}
		for(int i=0;i<=N;i++) {
			for (int j=0;j<=M;j++) {
				if (DP[i][j]>=Max) Max = DP[i][j];
			}
			//System.out.println();
		}
		System.out.println(Max);

		/*for(int i=0;i<=N;i++) {
			for (int j=0;j<=M;j++) {
				System.out.print(DP[i][j]+" ");
			}
			System.out.println();
		}
		*/
	}

}
