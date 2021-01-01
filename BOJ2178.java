package 백준공부;
import java.util.*;

public class BOJ2178 {
	static int[][]Map;
	static int[][]ret;
	static boolean[][]visited;
	static int dx[] = {0,1,-1,0};
	static int dy[] = {-1,0,0,1};
	static int N,M;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		scan.nextLine();
		Map = new int[N+1][M+1];
		ret = new int[N+1][M+1];
		visited = new boolean[N+1][M+1];
		ret[0][0] = 1;
		for(int i=0;i<N;i++) {
			 String str = scan.nextLine();
	            for (int j = 0; j < M; j++) {
	                Map[i][j] = str.charAt(j)-'0';
	                //if(Map[i][j]==0) visited[i][j]=true;
			}
		}
		/*for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(Map[i][j]);
			}
			System.out.println();
		}*/
		bfs(0,0);
		System.out.println(ret[N-1][M-1]);
	}
	public static void bfs(int x,int y) {
       //System.out.printf("bfs ");
		//int count = 0;
		//int Max = 0;
		Queue<Location> queue = new LinkedList<>();
		queue.add(new Location(0,0));
		visited[0][0] = true;
		
		
		while(!queue.isEmpty()) {
        	
			Location loc = queue.poll();
			
			if (loc.x==N-1&&loc.y==M-1) {
				return ;
			}
            for(int i=0; i<4; i++) {
            	int nextX = loc.x+dx[i];
    			int nextY = loc.y+dy[i];
                if(0<=nextY && nextY<M && 0<=nextX && nextX<N) {    	
                    if(!visited[nextX][nextY]&&Map[nextX][nextY]==1) {  
                        visited[nextX][nextY] = true; 
                        ret[nextX][nextY] = ret[loc.x][loc.y]+1;
                       // System.out.printf("%d	%d\n",nextX,nextY);
                        //System.out.println(ret);
                        queue.add(new Location(nextX, nextY));
                 
                    }
                }
            }
          
        }
      
		
	}
	public static class Location{
		int x;
		int y;
		
		public Location(int x, int y) {
			this.x = x;
			this.y = y;
			
		}
	}
	
}
