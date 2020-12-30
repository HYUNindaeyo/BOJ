package 백준공부;

import java.util.*;

public class BOJ2667 {
	static int[][] Map;
	static boolean[][] visited;
	public static int[] dx = {0,0,1,-1}; 
	public static int[] dy = {1,-1,0,0};
	static int count = 0;
	static int num = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Map = new int[N][N];
		visited = new boolean[N][N];


        for(int i=0; i<N; i++){
            String input = scan.next();
            for(int j=0; j<N; j++){
                Map[i][j] = input.charAt(j)-'0';
            }
        }
        /*for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(Map[i][j]);
            }
            System.out.println();
        }*/
        for (int i=0;i<N;i++) {
        	for (int j=0;j<N;j++) {
        		if (Map[i][j]==1&&!visited[i][j]) {
        			//System.out.printf("%d %d 좌표 탐색\n",i,j);
        			visited[i][j] = true;
        			count++;
        			num++;
        			int result =dfs(i,j,count,N);
        			list.add(result);
        			count=0;
        		}
        	}
        }
        System.out.println(num);
        Collections.sort(list);
        for(Integer i : list) { //for문을 통한 전체출력
            System.out.println(i);
        }

	}
	public static int dfs(int x,int y,int count,int N) {
		//System.out.println("dfs입");
		for (int i = 0; i<4;i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if (nextX>=0&&nextY>=0&&nextX<N&&nextY<N&&!visited[nextX][nextY]&&Map[nextX][nextY]==1) {
				//System.out.printf("%d %d 좌표 탐색\n",x,y);
				visited[nextX][nextY] = true; 
				count ++;
				count = dfs(nextX,nextY,count,N);  
				//count --;
				//visited[nextX][nextY] = false; 
				//System.out.println(count);
			
			}
		}
		return count;
	}
}
