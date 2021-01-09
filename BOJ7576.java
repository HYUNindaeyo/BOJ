package 백준공부;

import java.util.*;

public class BOJ7576 {
	static int tomato[][];
	static boolean visited[][];
	static int ret[][];
	static int[] dx = {0,0,1,-1}; 
	static int[] dy = {1,-1,0,0};
	static int N,M;
	static int count=0;
	static int RetToPrint = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		M = scan.nextInt();
		N = scan.nextInt();
		//int Max = 0;
		//int result = 0;
		tomato = new int[1002][1002];
		
		ret = new int[1002][1002];

		for (int i = 0;i<N;i++) {
			for (int j=0;j<M;j++) {
				tomato[i][j] =scan.nextInt();
				//visited[i][j] = false;
				if (tomato[i][j]==-1) ret[i][j] = -1;
			}
		}
	/*	for (int i = 0;i<N;i++) {
			for (int j=0;j<M;j++) {
				System.out.print(tomato[i][j]);
			}
			System.out.println();
		}
		*/
		for (int i = 0;i<N;i++) {
			for (int j=0;j<M;j++) {
				if (tomato[i][j]==1) {
					visited = new boolean[1002][1002];
					visited[i][j] = true;
					bfs(i,j);
					ret[i][j] = -2;
					//reset();
				}
				
			}
		}
		for (int i = 0;i<N;i++) {
			for (int j=0;j<M;j++) {
				if (ret[i][j]==0) {
					System.out.println("-1");
					return;
					}
				if (ret[i][j]>=RetToPrint) RetToPrint = ret[i][j];
			}
		}
		
		System.out.println(RetToPrint);
	
	for (int i = 0;i<N;i++) {
			for (int j=0;j<M;j++) {
				System.out.print(ret[i][j]+" ");
			}
			System.out.println();
		}
		
}
	
	
		
	/*public static void reset() {
		for(int i = 0;i<N;i++) {
			for (int j=0;j<M;j++) {
				visited[i][j] = false;
			}
		}
	}
*/
	public static void bfs(int x,int y) {
	       //System.out.printf("bfs ");
			//int count = 0;
			//int Max = 0;
			Queue<Location> queue = new LinkedList<>();
			queue.add(new Location(x,y));
			//visited[x][y] = true;
			
			
			while(!queue.isEmpty()) {
	        	
				Location loc = queue.poll();
				
				
	            for(int i=0; i<4; i++) {
	            	int nextX = loc.x+dx[i];
	    			int nextY = loc.y+dy[i];
	                if(0<=nextY && nextY<M && 0<=nextX && nextX<N) {    	
	                    if(!visited[nextX][nextY]&&tomato[nextX][nextY]!=-1&&tomato[nextX][nextY]!=1&&tomato[nextX][nextY]!=-2) {  
	                        visited[nextX][nextY] = true; 
	                        if (ret[nextX][nextY]!=0) {
	                        	ret[nextX][nextY]=Math.min(ret[nextX][nextY],  ret[loc.x][loc.y]+1);
	                        }
	                        else {
	                        	 ret[nextX][nextY] = ret[loc.x][loc.y]+1;
	                        }
	                       
	                      //System.out.printf("%d	%d\n",nextX,nextY);
	                        //System.out.println(ret);
	                       
	                        queue.add(new Location(nextX, nextY));
	                       //visited[nextX][nextY] = false; 
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


//bfs로 푸는 문제 


/*
 		for (int i = 0;i<N;i++) {
			for (int j=0;j<M;j++) {
				if (tomato[i][j]==1&&visited[i][j]==false) {
					visited[i][j] = true;
					result=dfs(i,j,count);
					if (Max<result) Max = result;
					//System.out.println(result);
					result = 0;
					count = 0;
					}
			}
		}
		System.out.println(Max);
 */
/*
static int dfs(int x,int y,int  count) {
//System.out.println("dfs실");
for (int i = 0;i<4;i++) {
	int nextX = x+dx[i];
	int nextY = y+dy[i];
	
	//System.out.printf("%d %d\n",nextX,nextY);
	if (nextX>=0&&nextY>=0&&nextX<N&&nextY<M&&tomato[nextX][nextY]==0&&visited[nextX][nextY]==false) {
		visited[nextX][nextY] = true;
		count++;
		dfs(nextX,nextY,count);
		count--;
		visited[nextX][nextY] = false;
		System.out.println(count);
	}
}

return count;

}
*/


//내코드들은 모두 시간 초과가 나온 만큼 인터넷에서 코드를 참고했다.
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point{
    int row, col;
    public Point(int row, int col){this.row = row; this.col = col;}
}

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int arr[][], m, n;
    static Queue<Point> queue = new LinkedList<>();
    // 상하좌우를 나타내기 위한 배열
    static int xArr[] = {-1, 0, 1, 0}, yArr[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n + 1][m + 1];

        for(int i = 1; i <= n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                // bfs를 시작하는 노드를 큐에 추가
                if(arr[i][j] == 1) queue.add(new Point(i, j));
            }
        }
        System.out.println(bfs());
    }

    private static int bfs() {

        while(!queue.isEmpty()){
            Point point = queue.poll();
            int row = point.row;
            int col = point.col;

            for(int i = 0 ; i < 4; i++){
                // 상하좌우로 토마토가 익을 수 있는지 여부 확인
                if(checkLocation(row + xArr[i], col + yArr[i])){
                    // 익은 토마토를 큐에 추가
                    queue.add(new Point(row + xArr[i],col + yArr[i]));
                    // 익은 토마토의 값 = 이전에 익은 토마토의 값 + 1
                    arr[row + xArr[i]][col + yArr[i]] = arr[row][col] + 1;
                }
            }
        }
        // 최대 값을 구하기 위한 변수
        int result = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                // 하나라도 익지 않은 토마토가 있다면 -1을 반환
                if(arr[i][j] == 0) return -1;
                // 토마토가 익는데 걸리는 시간을 구함
                result = Math.max(result, arr[i][j]);
            }
        }
        // 최대 값이 1이라면 원래부터 모두 익어있었다는 것
        if(result == 1) return 0;
        // 최대 값 - 1 --> 걸린 일수
        return (result - 1);
    }

    private static boolean checkLocation(int row, int col) {
        // 주어진 범위 밖인지 검사
        if(row < 1 || row > n || col < 1 || col > m) return false;
        // 아직 익지 않은 토마토라면 true 반환
        if(arr[row][col] == 0) return true;
        // 이미 익어있거나 빈 자리라면 false 반한
        return false;
    }
}

*/