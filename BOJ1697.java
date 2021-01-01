package 백준공부;

import java.util.*;


public class BOJ1697 {
	static int N;
	static int K;
	static int ret[];
	static boolean visited[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		K = scan.nextInt();
		ret = new int[100001];
		visited = new boolean[100001];
		visited[N] = true;
		bfs(N);
		System.out.println(ret[K]);
		for (int i = 0;i<100;i++) {
			System.out.print(ret[i]+" ");
		}
		
	}
	public static void bfs(int N) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(N);
		int next=0; 
		while(!queue.isEmpty()) {
			int pin = queue.poll();
			
			for (int i=0;i<3;i++) {
				if (i==0) next = pin-1;
				else if (i==1) next = pin+1;
				else next = pin*2;
				if(0<=next&&next<100001&&!visited[next]) {				
						visited[next] = true;
						ret[next] = ret[pin]+1;
						queue.add(next);

				}
			}
		}
	}
}


//bfs로 푸는 문제 
/* DP로 도전했던 
int DP[] = new int[100001];
int pin = N;
System.out.println("pin "+pin);
while (pin>=0&&pin<=N+1&&pin!=K){
	for (int i=-1;i<2;i++) {
		if(i==0) {
			DP[pin*2] = DP[pin]+1;
			pin = pin*2;
		}
		else {
			DP[pin+i] = DP[pin]+1;
			pin = pin+i;
		}
		System.out.println("pin "+pin);
		
	}
}

System.out.println(DP[K]);
*/