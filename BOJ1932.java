package 백준공부;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1932 {
	static int[][] Map;
	static boolean[] visited1;
	static int[][] DP;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int N = scan.nextInt();
		Map = new int[N+1][N+1];
		DP= new int[N+1][N+1];
		int Max = 0;
		for(int i=0; i<N; i++){
	       for(int j=0; j<N; j++){
	    	   if(j>i) continue;
	            Map[i][j]= scan.nextInt();
	            
	       }
	    }
		/*for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				System.out.print(Map[i][j]);
			}
			System.out.println();
		}
		*/
		DP[0][0] = Map[0][0];
		int pin = 0;
		for (int i = 1;i<=N;i++) {
			for (int j=0;j<N;j++) {
				if(j>i) continue;
				if (j==0) DP[i][j] = Map[i][j] + DP[i-1][j];
				else {
					if (DP[i-1][j]>=DP[i-1][j-1]) DP[i][j]=DP[i-1][j]+Map[i][j];
					else DP[i][j]=DP[i-1][j-1]+Map[i][j];
				}
				
			}
	
		}
		/*for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				System.out.print(DP[i][j]+" ");
			}
			System.out.println();
			}*/
		for (int i = 0;i<N;i++) {
			if (DP[N-1][i]>Max) Max = DP[N-1][i];
 		}
		System.out.println(Max);
		
	
		
		
	}
	
	}
