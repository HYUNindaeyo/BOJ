package 백준공부;

import java.util.Scanner;

public class BOJ13600 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 0;
		int tmp = 0;
		tmp = N/40320;
		count = tmp + count; 
		N = N - tmp*40320;
		tmp = N/5040;
		count = tmp + count; 
		N = N - tmp*5040;
		tmp = N/720;
		count = tmp + count; 
		N = N - tmp*720;
		tmp = N/120;
		count = tmp + count; 
		N = N - tmp*120;
		tmp = N/24;
		count = tmp + count; 
		N = N - tmp*24;
		tmp = N/6;
		count = tmp + count; 
		N = N - tmp*6;
		tmp = N/2;
		count = tmp + count; 
		N = N - tmp*2;
		tmp = N/1;
		count = tmp + count; 
		N = N - tmp*1;
		System.out.println(count);
	}

}
