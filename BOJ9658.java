package 백준공부;

import java.util.Scanner;

public class BOJ9658 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		boolean DP[] = new boolean[1001];
		DP[1] = true; //후가 승일 때 true
		DP[2] = false;
		DP[3] = true;
		DP[4] = false;
		DP[5] = false;
		for (int i=6;i<=N;i++) {
			if(DP[i-1]||DP[i-3]||DP[i-4]) DP[i] = false;
			else DP[i] = true;
		}
		if (DP[N]) System.out.println("CY");
		else System.out.println("SK");
	}

}
