package 백준공부;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ9009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int Fib[] = new int[46];
		Fib[0] = 0;
		Fib[1] = 1;
		for (int i=2;i<46;i++) {
			Fib[i] = Fib[i-2]+Fib[i-1];
			//System.out.print(Fib[i] + " ");
		}
		
		for (int t=0;t<T;t++) {
			int N = scan.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=45;0<i;i--) {
				if (N==0) break;
				if(N==Fib[i]) {
					list.add(Fib[i]);
					//System.out.print(Fib[i] + " ");
					break;
				}
				else if (Fib[i-1]<=N&&N<Fib[i]) {
					list.add(Fib[i-1]);
					//System.out.print(Fib[i-1] + " ");
					N = N-Fib[i-1];
				}
				
			}
			Collections.sort(list);
			for(Integer i : list) { //for문을 통한 전체출력
			    System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
