package 백준공부;

import java.util.Arrays;
import java.util.Scanner;

public class SMUPC3 {
	public static int M,N;
	public static int[] dx = {-1, 0, 1, 0}; 
	public static int[] dy = {0, 1, 0, -1};
	public static int Map[][];
	public static boolean visited[][];
	public static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		scan.nextLine();
		Map = new int[N+1][M+1];
		visited = new boolean[N+1][M+1];
		for (int i=0;i<N;i++) {
			char[] str =scan.nextLine().toCharArray();
            for(int j=0;j<str.length;j++) {
            	if (str[j]=='0') {
            		 Map[i][j]=0;
            	}
            	else if (str[j]=='I') {
            		 Map[i][j]=1;
            	}
            	else if (str[j]=='P') {
           		 Map[i][j]=2;
            	}
            	else if (str[j]=='X') {
           		 Map[i][j]=3;
            	}	
            } 
            
            
		}
		for (int i = 0; i < N ; i++ ) { 
			for (int j = 0; j< M;j++) {	
				visited[i][j] = false;
			}
			
 		}
		
		for (int i=0;i<=N;i++) {
			for(int j=0;j<M;j++) {
				if (!visited[i][j]&&Map[i][j]==1) {
					count = 0;
					dfs(i,j,M,N);
					if (count ==0)System.out.println("TT");
					else System.out.println(count);
					}
				}
		}
	}
	static void dfs(int x, int y,int M,int N) {//시작 노드, 카운트, 결과
		//count++;
		//System.out.println("x y"+x +y);
		//visit[x][y] = true; 
		for (int i = 0; i<4;i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			//System.out.print(nextX+ "  "+nextY +"여");
			if (0<=nextX&&0<=nextY&&nextX<N&&nextY<M&&visited[nextX][nextY]==false) {
				//System.out.println("x y"+nextX + nextY);
				if (Map[nextX][nextY]==2) {
					visited[nextX][nextY] = true; 
					count++;
					dfs(nextX,nextY,M,N);  
					//visit[nextX][nextY] = false; 
					//System.out.println("x y"+nextX + nextY);
				}
				else if (Map[nextX][nextY]==0) {
					visited[nextX][nextY] = true; 
					dfs(nextX,nextY,M,N);  
				}
			}
			
		}
	}

}
