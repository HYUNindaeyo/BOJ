package 백준공부;

import java.util.Scanner;

public class BOJ2251 {

	static boolean[][] visited = new boolean[201][201];
	static boolean[] ans = new boolean[201];
	static int a, b, c;
	 
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	 
	    dfs(0, 0, c);
	 
	    for (int i = 0; i < 201; i++) {
	        if (ans[i]) {
	            System.out.print(i + " ");
	        }
	    }
	}
	 
	public static void dfs(int ca, int cb, int cc) {
	    if (visited[ca][cb]) {
	        return;
	    } 
	 
	    if (ca == 0) {
	        ans[cc] = true;
	    }
	 
	    visited[ca][cb] = true;
	 
	    // a -> b
	    if (ca + cb > b) {
	        dfs((ca + cb) - b, b, cc);
	    } else {
	        dfs(0, ca + cb, cc);
	    }
	    // b -> a
	    if (cb + ca > a) {
	        dfs(a, (cb + ca) - a, cc);
	    } else {
	        dfs(cb + ca, 0, cc);
	    }
	    // c -> a
	    if (cc + ca > a) {
	        dfs(a, cb, (cc + ca) - a);
	    } else {
	        dfs(cc + ca, cb, 0);
	    }
	    // c -> b
	    if (cc + cb > b) {
	        dfs(ca, b, (cc + cb) - b);
	    } else {
	        dfs(ca, cc + cb, 0);
	    }
	    // b -> c, a -> c
	    // a + b = c 이기 때문에, c가 넘칠 일이 없다.
	    dfs(ca, 0, cb + cc);
	    dfs(0, cb, ca + cc);
	}

}