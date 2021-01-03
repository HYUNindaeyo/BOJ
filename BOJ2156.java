package 백준공부;

import java.util.Scanner;

public class BOJ2156 {
	static int[] DP;
	static int[] num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int N = scan.nextInt();
		num = new int[N+3];
		DP = new int[N+3];
		for (int i=3;i<N+3;i++) {
			num[i] = scan.nextInt();
		}
		
		//DP[0] = num[0];
		//DP[1] = num[0]+num[1];
		//DP[2] = Math.max(DP[0]+num[2],num[1]+num[2]);
		
		
		for (int i= 3;i<N+3;i++) {
			int temp1 = DP[i-2] + num[i];
			int temp2 = DP[i-3] + num[i-1]+num[i];
			DP[i] = Math.max(temp1,temp2);
			DP[i] = Math.max(DP[i],DP[i-1]);
		}
		
/*		for (int i=0;i<N+1;i++) {
			System.out.printf("%d ",DP[i]);
		}
*/		
		
		System.out.printf("%d",DP[N+2]);
	}

}
