package 백준공부;

import java.util.*;

public class BOJ14650 {
	static int N;
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		calc(0,0);
		
		System.out.println(count);
	}
	public static void calc(int n,int sum) {
		for (int i=0;i<3;i++) {
			if (n==0&&i==0) continue;
			if (n==N) {
				if(sum%3==0) count++; return;
			}
			else {
				calc(n+1,sum+i);
			}
		}
		//System.out.println(sum);
	}
}
