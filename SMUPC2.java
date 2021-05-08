package 백준공부;
import java.util.*;
public class SMUPC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[1000001];
		
		Scanner scan = new Scanner(System.in); 
		int N = scan.nextInt();
		int M = scan.nextInt();
		int DP[][] = new int[1000001][M+1];
		for (int i = 1;i<=N;i++) {
			num[i] =scan.nextInt();
		}
		for (int i = 0;i<=N;i++) {
			DP[i][0] = 0;
		}
		
		for (int i = 1;i<=N;i++) {
			DP[i][1] = 0;
		}
		DP[0][0] = 1;
		DP[1][1] = 1 + num[1]; 
		DP[2][1] = 1+ num[2];
		for (int i=1;i<M+1;i++) {
			for (int j=2;j<=N;j++) {
				
				if (DP[j-1][i-1]==0&&(int)DP[j-2][i-1]!=0) {
					DP[j][i] = (int)DP[j-2][i-1]/2+num[j];
				}
				else if(DP[j-1][i-1]!=0&&(int)DP[j-2][i-1]==0) {
					DP[j][i] = DP[j-1][i-1]+num[j];
				}
				else if (DP[j-1][i-1]!=0&&(int)DP[j-2][i-1]!=0) {
					DP[j][i] = Math.max(DP[j-1][i-1]+num[j], (int)DP[j-2][i-1]/2+num[j]);
				}
				else DP[j][i] = 0;
				if (j==N&&DP[j][i-1]!=0) {
					DP[j][i] = Math.max(DP[j][i], DP[j][i-1]);
				}
			}
		}
	
		
		int max = 0;
		for (int j=0;j<=N;j++) {
			if (max < DP[j][M]) max = DP[j][M];
			
		}
		System.out.printf("%d",max);
	}

}
