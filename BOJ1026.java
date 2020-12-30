package 백준공부;

import java.util.*;

public class BOJ1026 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int res=0;
		Integer A[] = new Integer[N];
		Integer B[] = new Integer[N];
		//int C[] = new int[N];
		
		for(int i=0;i<N;i++) {
			 A[i] = scan.nextInt();
		}
		for(int i=0;i<N;i++) {
			 B[i] = scan.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B,Collections.reverseOrder());
		
		for (int i = 0; i < N; i++) {
			res = res + A[i] * B[i];
		}
		
		System.out.println(res);
	}
}
