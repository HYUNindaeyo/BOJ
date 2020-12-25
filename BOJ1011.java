package 백준공부;
import java.io.*;
import java.util.*;

public class BOJ1011 {
	static long X,Y;
	//static int count;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T =Integer.parseInt(br.readLine());
		
		for (int i=0;i<T;i++) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			long X = Long.parseLong(st.nextToken());
			long Y = Long.parseLong(st.nextToken());
			long distance = Y - X;
			int max = (int)Math.sqrt(distance);	// 소수점 버림
			 
			if(max == Math.sqrt(distance)) {
				System.out.println(2 * max - 1);
			}
			else if(distance <= max * max + max) {
				System.out.println(2 * max);
			}
			else {
				System.out.println(2 * max + 1);
			}
		
		}
		br.close();
		bw.close();
	}
		/*
	static long binarysearch(long X,long Y) {
		long left = 0;
		long right = Y;
		long mid = 0;
		
		while (left<=right) {
			mid = (left+right+1)/2;
			//System.out.println(mid+"mid 결과 출");
			long sum = mid*mid;
			//System.out.println(mid+"mid 결과 출");
			//System.out.println(sum+"sum 결과 ");
			if (Y-X-1<=sum&&sum<=Y-X+1)	break;
			if (sum<Y-X-1)	left = mid+1; 
 			else if (sum>Y-X-1) right = mid -1;
 			
		}
		return	right+1;
		
	}
	*/
}

//이분탐색으로 푸는 문제,,가 아니라 그냥 수학 문제였던걸