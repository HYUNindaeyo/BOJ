package 백준공부;

import java.util.*;

public class BOJ14002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int num[] = new int[N+1];
		int DP[] = new int[N+1];
		int indexDP[] = new int[N+1];
		for (int i=0;i<N;i++) {
			num[i] =  scan.nextInt();
		}
		for (int k = 0; k < N; k++){
			DP[k] = 1;
			indexDP[k] = 0;
		    for (int i = 0; i < k; i++){
		        if(num[i] < num[k]&&DP[k]<DP[i]+1){
		            DP[k] = DP[i] + 1;
		            indexDP[k] = i;
		        }        
		    }
		}
		int max = 0;
		int index = 0;
		for (int i = 0;i<N;i++) {
			if (max<DP[i]) {
				max = DP[i];
				index = i;
			}
			//System.out.printf("%d ",DP[i]);
		}
		System.out.printf("%d ",max);
		//System.out.printf("%d ",index);
		//System.out.println();
		int result[] = new int[max+1];
		
		for (int i=0;i<max;i++) {
			result[i] = num[index];
			index = indexDP[index];
		}
/*
		for (int i=0;i<indexDP.length;i++) {
			System.out.printf("%d ",indexDP[i]);
		}
*/
		System.out.println();
		for (int i=max-1;i>=0;i--) {
			System.out.printf("%d ",result[i]);
		}
		
		
	
		
	}

}