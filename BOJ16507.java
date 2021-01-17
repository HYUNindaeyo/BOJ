package 백준공부;

import java.util.Scanner;

public class BOJ16507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		int C = scan.nextInt();
		int Q = scan.nextInt();
		int num[][] = new int[R+1][C+1];
		int DP[][] = new int[R+1][C+1];
		for (int i=1;i<=R;i++) {
			for (int j=1;j<=C;j++) {
				num[i][j] = scan.nextInt();
			}
		}
		
		for (int i=1;i<=R;i++) {
			for (int j=1;j<=C;j++) {
				if (i==1) DP[i][j] = DP[i][j-1]+num[i][j];
				else if (j==1) DP[i][j] = DP[i-1][j]+num[i][j];
				else {
					DP[i][j] = DP[i-1][j]+DP[i][j-1]-DP[i-1][j-1]+num[i][j];
				}
			}
		}

		/*for (int i=1;i<=R;i++) {
			for (int j=1;j<=C;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i=1;i<=R;i++) {
			for (int j=1;j<=C;j++) {
				System.out.print(DP[i][j]+" ");
			}
			System.out.println();
		}
		*/
		for (int q=0;q<Q;q++) {
			int r1 = scan.nextInt();
			int c1 = scan.nextInt();
			int r2 = scan.nextInt();
			int c2 = scan.nextInt();
			int result = DP[r2][c2]-DP[r1-1][c2]-DP[r2][c1-1]+DP[r1-1][c1-1];
			int count = (r2-r1+1)*(c2-c1+1);
			System.out.println(result/count);
		}
		
	}

}

//1. 시간초과 뜸.그냥 직관적으로 떠오른 풀이
/*
int sum = 0;
int count = (r2-r1+1)*(c2-c1+1);
for (int i=r1;i<=r2;i++) {
	for (int j=c1;j<=c2;j++) {
		sum = num[i][j] + sum;
	}
}
System.out.println(sum/count);
*/