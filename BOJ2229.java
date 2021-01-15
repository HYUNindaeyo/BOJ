package 백준공부;

import java.util.Scanner;

public class BOJ2229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int N = scan.nextInt();
		int num[] = new int[N+1];
		int DP[] = new int[N+1];
		for (int i=1;i<=N;i++) {
			int max = 0, min = 10001;
			num[i] = scan.nextInt();
			for (int j=i;j>0;j--) {
				max = Math.max(max,num[j]);
				min = Math.min(min, num[j]);
				DP[i] = Math.max(DP[i], max-min+DP[j-1]);
			}
		}
		
		/*for (int i = 0;i<=N;i++) {
			System.out.print(DP[i] + " ");
		}*/
		System.out.println(DP[N]);
	}

}
