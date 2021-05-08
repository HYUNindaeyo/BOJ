package 백준공부;

import java.util.*;

public class BOJ1303 {
	static int M,N;
	static int[] dx = {-1, 0, 1, 0}; 
	static int[] dy = {0, 1, 0, -1};
	static int Map[][];
	static boolean visited[][];
	static int count = 0;
	static int resultB = 0, resultW = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		scan.nextLine();
		Map = new int	[M][N];
		visited = new boolean[M][N];
	
		for (int i=0;i<M;i++) {
			char[] str =scan.nextLine().toCharArray();
            for(int j=0;j<str.length;j++) {
            	if (str[j]=='W') {
            		 Map[i][j]=0;
            	}
            	else if (str[j]=='B') {
            		 Map[i][j]=1;
            	}
            } 
		}
		for (int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if (!visited[i][j]) {
					visited[i][j] = true;
					dfs(i,j,M,N);
					if (Map[i][j]==0) {
						count++;
						resultW = resultW+count*count;
						//System.out.printf("W %d %d\n",resultW,count);
					}
					else if (Map[i][j]==1) {
						count ++;
						resultB = resultB+count*count;
						//System.out.printf("B %d %d\n",resultB,count);
						
					}
					count = 0;

				}
				
			}
			
		}
		System.out.printf("%d %d",resultW,resultB);
		/*
		System.out.println();
		for (int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.printf("%d",Map[i][j]);
			}
			System.out.println();
			
		}
		*/
	}
	static void dfs(int x,int y,int M, int N) {
		//System.out.println("dfs");
		
		int pin = Map[x][y];
		//System.out.printf("pin %d\n",pin);
		//System.out.printf("count %d\n",count);
		for (int i = 0; i<4;i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			//System.out.printf("next %d	%d\n",nextX,nextY);
			if (0<=nextX && 0<=nextY && nextX<M && nextY<N&&!visited[nextX][nextY]&&Map[nextX][nextY]==pin) {
				//System.out.printf("여기 들어\n");
				visited[nextX][nextY] = true; 
				count ++;
				//System.out.printf("x y %d	%d  %d \n",nextX,nextY,pin);
				
				//System.out.println(count);
				dfs(nextX,nextY,M,N);
			}
		}
	}
}
