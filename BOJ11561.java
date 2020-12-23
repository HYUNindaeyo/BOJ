package 백준공부;

import java.util.*;
public class BOJ11561 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		long num, result;
		long testcase[] = new long[test];
		for (int i = 0;i<test;i++) {
			testcase[i]= scan.nextLong();	
		}
		for(int i = 0; i <test;i++) {
			result = binarysearch(testcase[i]);
			//System.out.println(i+"번째 결과 출");
			System.out.println(result);
		}
	}
	static long binarysearch(long num) {
		long left = 0;
		long right = num;
		long result = 0;
		if (num == 1) {
			result = 1; 
			return result;
			}
		while (left<=right) {
			long mid = (left+right+1)/2;
			//System.out.println(mid+"mid 결과 출");
			long sum = (1+mid)*mid/2;
			
 			if (sum<= num)	left = mid+1; 
 			else if (sum>num) right = mid -1;
		}
		return right;
	}
}
