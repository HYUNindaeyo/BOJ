package 백준공부;
import java.io.*;
import java.util.*;

public class BOJ1926 {
	static boolean[][] visit;
	static int[][] Map;
	public static int[] dx = {-1, 0, 1, 0}; 
	public static int[] dy = {0, 1, 0, -1};
	static int N,M;
	static int MAX = 0;
	static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); 
		N = scan.nextInt();
		M = scan.nextInt();
		visit = new boolean[501][501];
		Map = new int[501][501];
		int num = 0;
		for(int i = 0; i<N; i++) {
			for (int j = 0; j < M ; j++) {
				Map[i][j] = scan.nextInt();
				visit[i][j] = false;
			}
		}
		for(int i = 0; i<N; i++) {
			for (int j = 0; j < M ; j++) {
				//System.out.printf("i j :%d	%d \n",i,j);
				if(Map[i][j] == 1) {
					dfs(i,j);
					if(count >=MAX) MAX = count;
					//System.out.println(count);
					if (count != 0) {num++;}
					count = 0;
				}
				
				
			}
		}
		System.out.println(num);
		System.out.println(MAX);
	}
	static void dfs(int x,int y) {//
		
		//System.out.printf("(%d %d)dfs 실행 \n",x,y);
		for (int i = 0; i<4;i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if (0<=nextX && 0<=nextY && nextX<N+1 && nextY<M+1&&!visit[nextX][nextY]&&Map[nextX][nextY]==1) {
				visit[nextX][nextY] = true; 
				count++;
				//System.out.printf("x y :%d	%d \n",x,y);
				dfs(nextX,nextY);
				//System.out.printf("nx ny :%d	%d \n",nextX,nextY);
			}
			if(!visit[x][y]&&count==0) {
				visit[x][y]=true;
				count++;
			}
		}
		
		
	}
}


/*
static void checkMap(int x, int y) {
if(Map[x][y]==0) {
	visited[x][y]= true;
	return ;
}
else {
	bfs(x,y);
	visited[x][y]= true;
	return ;
}
}

static void bfs(int x, int y) {
Queue<Node> q= new LinkedList<>();

q.add(new Node(x,y,1));

while (!q.isEmpty()) {
	Node node = q.poll();
	visited[node.x][node.y]= true;

if (node.y-1 >= 0 && node.y-1 < M && Map[node.x][node.y-1]==1 && visited[node.x][node.y-1]==false) {
	q.add(new Node(node.x, node.y-1,node.depth+1));
}

else if (node.y+1 >= 0 && node.y+1 < M && Map[node.x][node.y+1]==1 && visited[node.x][node.y+1]==false) {
	q.add(new Node(node.x, node.y+1,node.depth+1));
}

else if (node.x-1 >= 0 && node.x-1 < N && Map[node.x-1][node.y]==1 && visited[node.x-1][node.y]==false) {
	q.add(new Node(node.x-1, node.y,node.depth+1));
}

else if (node.x+1 >= 0 && node.x+1 < N && Map[node.x+1][node.y]==1 && visited[node.x+1][node.y]==false) {
	q.add(new Node(node.x+1, node.y,node.depth+1));
}

else {
	System.out.println(node.depth);
	if (MAX <= node.depth) {
		
		MAX = node.depth;
	}
	count ++; 
	return ;
}

}
}
}

class Node{
int x;
int y;
int depth;

Node(int _x, int _y, int _depth){
    this.x = _x;
    this.y = _y;
    this.depth = _depth;
}
*/