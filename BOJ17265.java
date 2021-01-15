package 백준공부;

import java.util.*;

public class BOJ17265 {
	public static int min = Integer.MAX_VALUE;
	public static int max = Integer.MIN_VALUE;
	public static int[] dx = {1, 0};
	public static int[] dy = {0, 1};
	public static int N;
	public static char input[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		N = scan.nextInt();
		
		input = new char[N][N];
		//int DP[][] = new int[N][N];
		scan.nextLine();
		for (int i=0;i<N;i++) {
			char[] tmpc= scan.nextLine().replaceAll(" ","").toCharArray();
			//System.out.println(tmp.length);
			for (int j=0;j<N;j++) {
				input[i][j] = tmpc[j];
			}
		}
		
		dfs(0, 0, input[0][0]-'0', input[0][0]);
		System.out.println(max + " " + min);
		//System.out.println(DP[N+1][N+1]);
		/*for (int i=0;i<=N+1;i++) {
			for (int j=0;j<=N+1;j++) {
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
		*/
	}
	public static void dfs(int x, int y, int pre,char oper) {
		int temp = input[x][y] - '0';
		if(temp >= 0 && temp <= 5) { 
			if(oper == '+')
				pre += temp;
			else if(oper == '-')
				pre -= temp;
			else if(oper == '*')
				pre *= temp;
			}else {
				oper = input[x][y];
		}
		if (x==N-1&&y==N-1) {
			max = Math.max(pre, max);
			min = Math.min(pre, min);
			return ;
		}
		if(x < N-1) {
			dfs(x+1, y, pre, oper);
		}
		if(y < N-1) {
			dfs(x, y+1, pre, oper);
		}
	}

}
//DP 로 풀 수 있을 것 같지만,, ,그보다 dfs로 구현하는 편이 훨씬 쉽고 어차피 두개 비슷함
//https://minhamina.tistory.com/49 여기 코드 참고함 

/*
 * for (int i = 0; i<2;i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			//System.out.print(x+ "  "+y +"여");
			if (nextX<N && nextY<N) {
				
				//visit[nextX][nextY] = false; 
				//System.out.println("x y"+nextX + nextY);
				
 */
/*
DP[2][2] = Character.getNumericValue(input[1][1]);

for (int i=2;i<=N+1;i++) {
	for (int j=2;j<=N+1;j++) {
		if((i+j)%2==0) {
			Integer tmp[] = new Integer[7];
			Arrays.fill(tmp, 0);
			if(input[i-1][j]=='+') tmp[0]=DP[i-2][j]+input[i][j];
			if(input[i-1][j]=='-') tmp[1]=DP[i-2][j]-input[i][j];
			if(input[i-1][j]=='*') tmp[2]=DP[i-2][j]*input[i][j];
			if(input[i][j-1]=='+') tmp[3]=DP[i][j-2]+input[i][j];
			if(input[i][j-1]=='-') tmp[4]=DP[i][j-2]-input[i][j];
			if(input[i][j-1]=='*') tmp[5]=DP[i][j-2]*input[i][j];
			
			Arrays.sort(tmp,Comparator.reverseOrder());
			DP[i][j] = tmp[0];
			System.out.printf("%d, %d의 디피 : %d\n",i,j,tmp[0]);
			System.out.printf("이건 tmp : "+tmp[0] + tmp[1] + tmp[2] + tmp[3] + tmp[4] + tmp[5]+"\n");
		}
	}
}
*/