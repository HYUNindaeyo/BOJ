package 백준공부;

import java.io.*;
import java.util.*;

public class BOJ15810 {
	static int N;
	static int M;
	static int[] arr;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); 
		int M = scan.nextInt(); 
       
        
        arr = new int[1000000];
        long first =1, last = 100000000000l;
        
        for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
        }
        
        //binarySearch(first,last,arr,N);
        System.out.println(binarySearch(first,last,arr,N,M));
       
	}
	
    public static long binarySearch(long first,long last,int[] arr, int N,int M) { 
    	while (first <= last) {
			long answer = 0;
			long mid = (first + last) / 2;
			//System.out.println("N은 "+N);
			for(int i = 0; i < N; i++) {
				answer = answer + (mid / arr[i]);
				//System.out.println(answer);
			}
			
			if(answer >= M)
				last = mid - 1;
			
			else
				first = mid + 1;
			//System.out.println(first);
		}
    	return first;
    }
}