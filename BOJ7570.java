package 백준공부;

import java.util.*;

public class BOJ7570 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int N = scan.nextInt();
		//int children[] = new int[N];
		int dp[] = new int[N+1];
		for (int i=0;i<N;i++) {
			//children[i]=scan.nextInt();
			 int Child = scan.nextInt();
	         dp[Child] = dp[Child-1] + 1;
		}
        
        Arrays.sort(dp);
        
		System.out.println(N - dp[N]);
		
	}

}
