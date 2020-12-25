package 백준공부;

import java.util.Scanner;

public class BOJ1072 {
	static int X,Y,Z;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long X = scan.nextInt();
		long Y = scan.nextInt();
		int Z = (int)((Y * 100) / X);
		
		if (Z>=99) 
			System.out.println(-1);
		else
			System.out.println(binarysearch(X,Y,Z));
	}
	static long binarysearch(long X, long Y,int Z) {
		long left = 0;
		long right = 1000000000;
		
		while (left<=right) {
			long mid = (left+right)/2;
			//System.out.println(mid+"mid 결과 출");
			//System.out.printf("%d	%d	%d\n",left,mid,right);
			int newZ = (int)((100*(Y+mid))/(X+mid));
			//System.out.printf("rate :%h %h\n",Z,newZ);
 			if (newZ > Z) right = mid - 1;
 			else left = mid + 1;
		}
		return left;
	}
}

//이분탐색으로 푸는 문제