package 백준공부;

import java.util.Scanner;

public class BOJ11052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int card[] = new int[N+1];
		int DP[] = new int[N+1];
		for (int i=1;i<N+1;i++) {
			card[i] = scan.nextInt();
		}
		DP[0] = 0;
		DP[1] = card[1];
		
		for (int i=2;i<N+1;i++) {
			int tmp = 0;
			for (int j=1;j<=i;j++) {
				tmp = DP[i-j]+card[j];
				//System.out.printf("%d %d %d\n",i,j,DP[i]);
				DP[i] = Math.max(DP[i], tmp);
			}
		}
	/*	for (int i=0;i<N+1;i++) {
			System.out.printf("%d %d\n",i,DP[i]);
		}
	*/
		System.out.println(DP[N]);
	}

}
