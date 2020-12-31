package 백준공부;

import java.util.*;

public class BOJ10026 {
	static int M,N;
	static int[] dx = {-1, 0, 1, 0}; 
	static int[] dy = {0, 1, 0, -1};
	static int Map1[][];
	static int Map2[][];
	static boolean visited1[][];
	static boolean visited2[][];
	static int num1 = 0;
	static int num2 = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.nextLine());
		Map1 = new int[N+1][N+1];
		Map2 = new int[N+1][N+1];
		visited1 = new boolean[N+1][N+1];
		visited2 = new boolean[N+1][N+1];
		//scan.nextLine();
		for (int i=0;i<N;i++) {
			char[] str =scan.nextLine().toCharArray();
			//System.out.print(str.length);
			/*for (int j = 0;j<str.length;j++) {
				System.out.print(str[j]);
			}*/
            for(int j=0;j<str.length;j++) {
            	if (str[j]=='R') {
            		 Map1[i][j]=0;
                     Map2[i][j]=0;
            	}
            	else if (str[j]=='G') {
            		 Map1[i][j]=1;
                     Map2[i][j]=0;
            	}
            	else if (str[j]=='B') {
            		 Map1[i][j]=2;
                     Map2[i][j]=1;
            	}
               
            } 
		}

		
		 for (int k=0;k<N;k++) {
 			for (int j=0;j<N;j++) {
 				if(!visited1[k][j]) {
 					visited1[k][j] = true;
 					dfs(k,j,visited1,Map1);
 					num1++;
 				}
 			}
 		} 
		 for (int k=0;k<N;k++) {
	 			for (int j=0;j<N;j++) {
	 				if(!visited2[k][j]) {
	 					visited2[k][j] = true;
	 					dfs(k,j,visited2,Map2);
	 					num2++;
	 				}
	 			}
	 		} 
		 System.out.printf("%d	%d",num1,num2);
         /*  for (int k=0;k<N;k++) {
    			for (int j=0;j<N;j++) {
    				System.out.print(Map1[k][j]);
    			}
    			System.out.println();
    		} 
          for (int k=0;k<N;k++) {
    			for (int j=0;j<N;j++) {
    				System.out.print(Map2[k][j]);
    			}
    			System.out.println();
    		}
			System.out.println();
		*/
	}
	static void dfs(int x,int y,boolean visited[][],int Map[][]) {
		//System.out.println("dfs");
		int color = Map[x][y];
		for (int i = 0; i<4;i++) {
			
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if (0<=nextX && 0<=nextY && nextX<N && nextY<N&&!visited[nextX][nextY]&&Map[nextX][nextY]==color) {
				//System.out.printf("%d	%d\n",nextX,nextY);
				visited[nextX][nextY] = true; 
				//System.out.printf("x y %d	%d\n",nextX,nextY);
				//System.out.println(count);
				dfs(nextX,nextY,visited,Map);
			}
		}
	}
}
