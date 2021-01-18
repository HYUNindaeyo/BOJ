package 백준공부;

import java.util.Scanner;

public class BOJ11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int num[] = new int[N+1];
		int DP[] = new int[N+1];
		for (int i=1;i<=N;i++) {
			num[i] =  scan.nextInt();
		}
		for (int k = 1; k <= N; k++){
			DP[k] = 1;
		    for (int i = 1; i <= k; i++){
		        if(num[i] < num[k]){
		            DP[k] = Math.max(DP[k], DP[i] + 1);
		        }        
		    }
		}
		int max = 0;
		for (int i = 1;i<=N;i++) {
			if (max<DP[i]) max = DP[i];
			//System.out.printf("%d ",DP[i]);
		}
		System.out.printf("%d ",max);
	}

}
