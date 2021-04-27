package 백준공부;
import java.util.*;

public class BOJ2293 {
	static int dp[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int num[] = new int[n+1];
		int coin; // 미리 받아서 어딘가에 저장하는 게 아니라 그 때 그때 더해준다 dp를 하면서... 좋은 아이디어 인듯 
		int result = 0;
		int[] dp = new int[k+1];
		dp[0] = 1;
		for(int i = 0; i < n; i++) {
			coin = scan.nextInt();
			for(int j = 1; j < k+1; j++) {
				if(j >= coin)
					dp[j] += dp[j - coin];
			}
		}
		System.out.println(dp[k]);
	}

}


/*
dp = new int[n+1][k+1];

for (int i=1;i<k;i++) {
	dp[0][i] = 0;
}
for (int i=1;i<k;i++) {
	dp[1][i] = k%num[1];
}

for (int i = 1;i<=n;i++) {
	for (int j=1;j<=k;j++) {
		int tmp = 1;
		while (k-tmp * num[i]>0) {
			dp[n][k] = dp[n][k] + dp[n-tmp][k-tmp*num[i]];
			System.out.printf("N K %d %d %d\n",n,k,dp[n][k]);
			tmp ++;
		}
		tmp = 1;
	}
}
System.out.println(dp[n][k]);

*/
//나 혼자 완전 복잡하게 생각하고 있었던 것... 훨씬 쉬운 dp 방법이 있어서 그 코드참고.
//https://geehye.github.io/baekjoon-2293/# 여기 코드 참고 했음 
// dp[i] += dp[i - 동전] 이 규칙을 따른다는 거만ㅇ 알면 됨 
