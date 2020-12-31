package 백준공부;

import java.util.*;

public class BOJ11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int coin[] = new int[N];
		int count = 0;
		
		
		for (int i = 0;i<N;i++) {
			coin[i] = scan.nextInt();
		}
		
		for (int i = N-1;i>=0;i--) {
			count = count + K/coin[i];
			K = K-coin[i]*(K/coin[i]);
			//System.out.println(K);
			if (K==0) break;
		}
		
		System.out.println(count);
	}

}
