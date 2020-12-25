package 백준공부;

import java.util.*;
public class  BOJ13164{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int sum = 0;
		int data1[] = new int[N];
		int data2[] = new int[N];
		for (int i = 0; i < N ; i++ ) {
			data1[i] = scan.nextInt();	
		}
		for (int i = 0; i < N-1 ; i++ ) {
			data2[i] = data1[i+1]-data1[i];
		}
		
		Arrays.sort(data2);
		
		for (int i = 0; i<N-K+1;i++) {
			sum = sum + data2[i];
		}
		
		System.out.print(sum);
	}
}