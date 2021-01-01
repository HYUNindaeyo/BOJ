package 백준공부;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int num[] = new int[N];
		int DP[] = new int[N];
		//int sum = 0;
		int Max = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<N;i++) {
			num[i] = scan.nextInt();
		}
		DP[0] = num[0];
		Max = num[0];
		for (int i=1;i<N;i++) {
			int tmp = DP[i-1]+num[i];
			DP[i] = Math.max(tmp, num[i]);
			Max = Math.max(Max, DP[i]);
		}
		System.out.println(Max);
	}

}
