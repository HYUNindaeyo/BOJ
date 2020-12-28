package 백준공부;
import java.util.*;
import java.io.*;
public class BOJ1300 {
	static long n;
	static long k;
	static long ret = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		k = scan.nextInt();
	
		System.out.println(binarysearch(1,k));
		
			
	}
	public static long binarysearch(long left, long right) {
		while (left<=right) {
			//System.out.println(mid+"mid 결과 출");
			long count = 0;
			long mid = (left+right)/2;
			//System.out.printf("%d	%d	%d\n",left,mid,right);

			for (int i = 1; i<=n;i++) {
				count = count + Math.min(mid/i, n);
			}
			
			
			//System.out.printf("rate :%h %h\n",Z,newZ);
 			if (k<=count ) {ret = mid; right = mid - 1; }
 			else left = mid + 1;
		}
		return ret;
		
		
	}
}

//이분탐색