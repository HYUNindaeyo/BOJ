package 백준공부;
import java.util.*;
import java.math.*;

public class BOJ11057 {

	static int dp[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = 0;
		dp = new int[N][10];
		/*
		if (N==1) {
			System.out.println(10);
			return ;
		}
		*/
		for (int i=0;i<10;i++) {
			dp[0][i] = 1;
		}
		
		for (int i=1;i<N;i++) {
			for (int j=0;j<10;j++) {
				if (j>0) dp[i][j] = (dp[i][j-1]+dp[i-1][j])%10007;
				if (j==0) dp[i][j] = dp[i-1][j]%10007;
			}
		}
		
		for (int i=0;i<10;i++) {
			result = (result + dp[N-1][i])%10007 ;
		}
		System.out.println(result);
	}

}
