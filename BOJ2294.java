package 백준공부;
import java.util.*;

public class BOJ2294 {
	static int dp[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] coin = new int[101]; 
		int[] dp = new int[10001];
		int result = 0;
		
		for (int i=1;i<=k;i++) {
			dp[i] = 10001;
		}
		for (int i=1;i<=n;i++) {
			coin[i] = scan.nextInt();
			for (int j=coin[i];j<=k;j++) {
				dp[j] = Math.min(dp[j], dp[j-coin[i]]+1);
			}
		}
		
		if (dp[k] == 10001) System.out.println("-1");
		else  System.out.printf("%d",dp[k]);
	}

}

//https://jaemin8852.tistory.com/163 이거 참고한 깔끔한 코드 