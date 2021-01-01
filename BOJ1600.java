package 백준공부;

import java.io.*;
import java.util.*;

public class BOJ1600 {
	private static int K,W,H;
	//private static boolean visit[][][];
	public static int[] dx = {-1,-1,1,1,-2,-2,2,2}; 
	public static int[] dy = {-2,2,-2,2,-1,1,-1,1};
	public static int [] dx2 = {1,-1,0,0};
	public static int [] dy2 = {0,0,-1,1};
	
	static int count = 0;
	static int array[][];
	public static boolean [][][]visit;
	static double result;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		K = scan.nextInt();
		W = scan.nextInt();
		H = scan.nextInt();
		array = new int [H+1][W+1];
		visit = new boolean[H+1][W+1][K+1];
		
		for (int i = 1; i <= H; i++ ) { 
			for (int j = 1; j <= W ; j++ ) { 
				array[i][j] = scan.nextInt();
			
			}
		}
		
		System.out.println(bfs());
	}
	
	static int bfs() {
			Queue<Location> queue = new LinkedList<>();
			queue.add(new Location(1,1,0,0));
			visit[1][1][0] = true;
		
		while(!queue.isEmpty()) {
        	
            Location loc = queue.poll();
            // 최단값 리턴 
            if(loc.y == H && loc.x == W)
            	return loc.cnt;
            // 원숭이가 말처럼 움직일 수 있는 횟수가 남아있는 경우
            if(loc.k < K) {
                for(int d=0; d<8; d++) {
                    int newX = loc.x + dx[d];
                    int newY = loc.y + dy[d];
                    
                    if(1<=newY && newY<=H && 1<=newX && newX<=W) {
                        if(!visit[newY][newX][loc.k+1] && array[newY][newX] == 0) {
                            visit[newY][newX][loc.k+1] = true;
                            //System.out.printf("%d	%d\n",newY,newX);
                            queue.add(new Location(newX, newY, loc.k+1, loc.cnt+1));
                        }
                    }
                }
            }
            
            // 원숭이가 말처럼 움직일 수 없는 경우 
            for(int d=0; d<4; d++) {
                int newX = loc.x + dx2[d];
                int newY = loc.y + dy2[d];
                if(1<=newY && newY<=H && 1<=newX && newX<=W) {    	
                    if(!visit[newY][newX][loc.k] && array[newY][newX] == 0) {  
                        visit[newY][newX][loc.k] = true;     
                        //System.out.printf("%d	%d\n",newY,newX);
                        queue.add(new Location(newX, newY, loc.k, loc.cnt+1));
                    }
                }
            }
        }
        
        return -1;
	}
	
	public static class Location{
		int x;
		int y;
		int k;
		int cnt;
		public Location(int x, int y, int k, int cnt) {
			this.x = x;
			this.y = y;
			this.k = k;
			this.cnt = cnt;
		}
	}
}

//dfs로는 풀면 안되는 문제 
//bfs로 풀어야 한다
//bfs를 쓸 땐 링크드리스트로 queue 만드는 게 중요
//고려해야 할 것이 x,y,k,count니까 네개를 같이 넣은 링크드리스트 만들기


	/*static void dfs(int x,int y) {
		if (x==W-1&&y==H-1) return;
		for(int i = 0; i<8;i++) {
			int nextX = x+dx[i];
			int nextY = y+dy[i];
			if(nextX < 0||nextY<0||nextX>W||nextY>H) continue;
			if (!visit[nextX][nextY]&&array[nextX][nextY]==0) {
				visit[nextX][nextY] = true; 
				count ++;
				System.out.println("dfs실행");
				dfs(nextX,nextY);  
				count --;
				visit[nextX][nextY] = false; 
			
			}
		}
		for(int i = 0; i<4;i++) {
			int nextX = x+dx2[i];
			int nextY = y+dy2[i];
			if(nextX < 0 ||nextY<0||nextX>W||nextY>H) continue;
			if (!visit[nextX][nextY]&&array[nextX][nextY]==0) {
				visit[nextX][nextY] = true; 
				count ++;
				dfs(nextX,nextY);  
				count --;
				visit[nextX][nextY] = false; 
			
			}
		}
		
	} */

