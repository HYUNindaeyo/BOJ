package 백준공부;

import java.util.*;

public class BOJ2583 {
	static int M,N,K;
	static int[] dx = {-1, 0, 1, 0}; 
	static int[] dy = {0, 1, 0, -1};
	static int Map[][];
	static boolean visited[][];
	static int count = 0;
	static int num = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		M = scan.nextInt();
		N = scan.nextInt();
		K = scan.nextInt();
		Map = new int[N+1][M+1];
		visited = new boolean[N+1][M+1];
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i=0;i<K;i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			for (int j=x1;j<x2;j++) {
				for (int k=y1;k<y2;k++) {
					Map[j][k]++;
					
				}
			}
		}
		
		/*for (int i=0;i<N;i++) {
			for (int j=0;j<M;j++) {
				System.out.print(Map[i][j]);
			}
			System.out.println();
		}
		*/
		for (int i=0;i<N;i++) {
			for (int j=0;j<M;j++) {
				if(Map[i][j]==0&&!visited[i][j]) {
					visited[i][j] = true;
					count = 1;
					//System.out.printf("%d	%d\n",i,j);
					dfs(i,j);
					num++;
					ret.add(count);
					
				}
			}
		}
		 System.out.println(num);
		Collections.sort(ret);
		for(Integer i : ret) {
		    System.out.print(i+" ");
		}
	}
	static void dfs(int x,int y) {
		for (int i = 0; i<4;i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if (0<=nextX && 0<=nextY && nextX<N && nextY<M&&!visited[nextX][nextY]&&Map[nextX][nextY]==0) {
				visited[nextX][nextY] = true; 
				//System.out.printf("x y %d	%d\n",nextX,nextY);
				count++;
				//System.out.println(count);
				dfs(nextX,nextY);
			}
		}
	}
}
