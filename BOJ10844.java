package 백준공부;

import java.util.*;

public class BOJ10844 {

	public static int[] dy = {0, 1, 0, -1};
	static int N;
	static int count = 0;
	static int num = 0;
	//static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); 
		N = scan.nextInt();
		
		long[][] DP = new long[101][10];
		for (int i=1;i<10;i++) {
			DP[1][i] = 1;
		}
		for (int i=2;i<=N;i++) {
			for (int j=0;j<10;j++) {
				if(DP[i-1][j]!=0) {
					if(j-1>=0) DP[i][j-1] = (DP[i-1][j]+DP[i][j-1])%1000000000;
					if(j+1<10) DP[i][j+1] = (DP[i-1][j]+DP[i][j+1])%1000000000;
				}
			}
		}
		
		
		/*for (int i=0;i<=N;i++) {
			for (int j=0;j<10;j++) {
				System.out.printf("%d ",DP[i][j]);
			}
			System.out.println();
		}
		*/
		long sum = 0;
		for (int i=0;i<10;i++) {
			sum = DP[N][i] + sum;
		}
		System.out.println(sum%1000000000);
	}
	
	
}
	
//와 이거 dp로 푸는 거구나 미쳤다,,



/*
  static void dfs(int first) {
		count ++;
		for (int i=-1;i<2;i=i+2) {
		int next = first + i;
		if (next>=0 && next<=9) {
			num = first*10+next;
			list.add(num);
			if (count == N) return;
			dfs(next);
		}
		}
	
	}
 */
/*static void bfs(int first) {
Queue<Integer> queue = new LinkedList<>();
queue.add(first);

while (queue.size()<=N) {
	if (queue.size()==N) {
		count++;
	}
	int pin = queue.poll();
	for(int i=-1;i<2;i=i+2) {
		int next = pin + i;
		
		if(next>=0 && next<=9) {
			queue.add(next);
		}
	}
}
System.out.println(count);
}
*/