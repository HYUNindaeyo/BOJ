package 백준공부;

import java.util.Scanner;

public class BOJ9663 {
	public static int N;
	public static int count=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		 for(int i = 1; i <= N; i++) {
			 int[] col = new int[N+1];
			 col[1] = i;
			 //1행 i열에 놓았을 때를 dfs로 푸는 
			 dfs(col,1);
			 //1행 i열만 놓은 상태로 출발한다... 
			
		 }
		 System.out.printf("%d ",count);
	}
	static void dfs(int[] col,int row) {
		//System.out.println("dfs");
		//row행까지 놓은상태로 들어오기때문에 만약 row == N이면 한판 완성. count에 더해준다...
		if (row==N) {
			count ++;
		}
		//row 행까지 아직 완성되지 않은거라면 col에 넣을 수 있는 자리들 확인 후 전부 dfs 넣어준다...
		else {
			for(int i=1;i<=N;i++) {
				col[row+1] = i;
				if (possible(col,row+1)) {
					dfs(col,row+1);
				}
			}
 		}
	}
	static boolean possible(int[] col,int row) {
		for (int i=1;i<row;i++) {
			if (col[i] == col[row]) return false;
			if (Math.abs(i-row) == Math.abs(col[i]-col[row])) return false;
		}
		return true;
	}
}


//dfs로 풀 수 있는 문제군...
 //https://pangsblog.tistory.com/30 여기 코드 완전 참고 걍 다 참고 