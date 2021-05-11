package 백준공부;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.math.BigInteger;



public class BOJ2878 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long M = scan.nextLong();
		long N = scan.nextLong();
		long[] num = new long[(int)N];
		long sum = 0; //요구하는 사탕 
		long gap = 0; //요구와 현실의 
		long result = 0;
		for (int i=0;i<N;i++) {
			num[i] = scan.nextLong();
			sum = sum + num[i];
		}
		gap = sum - M;
		Arrays.sort(num);
		/*for (int i=0;i<N;i++) {
			System.out.println(num[i]);
		}
		*/
		
		
		//System.out.println(Math.pow(2, 64));
		
		for (int i=0;i<N;i++) {
			long tmp = gap/(N-i); //뺄 예정인 사탕 갯수..
			if (tmp > num[i]) {
				result = (long) (result%(long)Math.pow(2, 64))+(long)(num[i]*num[i]%(long)Math.pow(2, 64));
				gap = gap - num[i];
			}
			else {
				result = (long) (result%(long)Math.pow(2, 64))+(long)(tmp*tmp%(long)Math.pow(2, 64));
				gap = gap - tmp;
			}
			System.out.printf("result %d\n",result);
		}
		
		System.out.printf("%d\n",result);
	}

}
