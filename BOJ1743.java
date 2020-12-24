package 백준공부;

import java.io.*;
import java.util.*;

public class BOJ1743 {
	private static int N,M,K;
	static int array[][];
	private static boolean visit[][];
	public static int[] dx = {-1, 0, 1, 0}; 
	public static int[] dy = {0, 1, 0, -1};
	static int count = 0;
	
	static int max = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		N = scan.nextInt();
		M = scan.nextInt();
		K = scan.nextInt();
		array = new int [N+1][M+1];
		visit = new boolean[N+1][M+1];
	
		
		for (int i = 0; i < K ; i++ ) { 
			int x = scan.nextInt();
			int y = scan.nextInt();
			array[x][y] = 1;
 		}
		for (int i = 0; i < N ; i++ ) { 
			for (int j = 0; j< M;j++) {	
				visit[i][j] = false;
			}
			
 		}
		for (int i = 0; i < N+1 ; i++ ) { 
			for (int j = 0; j < M+1 ; j++ ) { 
				if(array[i][j] == 1) {
					count = 0;
					dfs(i,j);
					if (count>max) max = count;
					//System.out.println("i j"+i + j);
					//System.out.println("결 : "+count);
					//System.out.println("출ㄹㄹ: "+max);
				}
				
			}
 		}
	
		System.out.print(max);
		
	}
	
	
	static void dfs(int x, int y) {//시작 노드, 카운트, 결과
		//count++;
		//visit[x][y] = true; 
		for (int i = 0; i<4;i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			//System.out.print(x+ "  "+y +"여");
			if (0<=nextX && 0<=nextY && nextX<N+1 && nextY<M+1 &&!visit[nextX][nextY]&& array[nextX][nextY]==1) {
				visit[nextX][nextY] = true; 
				count++;
				dfs(nextX,nextY);  
				//visit[nextX][nextY] = false; 
				//System.out.println("x y"+nextX + nextY);
				
			}
		}
	}
}