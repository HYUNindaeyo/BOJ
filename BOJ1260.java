package 백준공부;

import java.util.*;

public class BOJ1260 {
	static int[][]Map;
	static boolean[] visited1;
	static boolean[] visited2;
	static int N,M,V;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int V = scan.nextInt();
		
		Map = new int[N+1][N+1];
		visited1 = new boolean[N+1];
		visited2 = new boolean[N+1];
		for (int i=0;i<M;i++) {
			int start = scan.nextInt();
			int end = scan.nextInt();
			Map[start][end] = 1;
			Map[end][start] = 1;
		}
		dfs(V,N);
		System.out.println();
		bfs(V,N);
	}
	static void dfs(int V,int N) {
		Stack<Integer> stack = new Stack<>();
		stack.push(V);
		visited2[V]= true;
		System.out.print(V+" ");
		while (!stack.isEmpty()) {
			for (int i = 0;i<=N;i++) {
				if (Map[V][i]==1&&!visited2[i]) {
					stack.push(i);
					visited2[i] = true;
					dfs(i,N);
				}
			}
			stack.pop();
		}
		
	}

	
	static void bfs(int V, int N) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(V);
		visited1[V] = true;
		
		while(!queue.isEmpty()) {
			int x = queue.poll();
			System.out.print(x+" ");
			for (int i=1;i<=N;i++) {
				if(Map[x][i]==1&&!visited1[i]) {
					queue.offer(i);
					visited1[i]=true;
				}
			}
		}
	}
}


//코드 인터넷 참고. bfs와 dfs 는 각각 큐와 스택을 이용하여 코딩하는 것이 정석 . 