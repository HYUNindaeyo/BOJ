package 백준공부;

import java.util.Scanner;

public class BOJ1756 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int D = scan.nextInt();
		int N = scan.nextInt();
		int oven[] = new int[D+1];
		int pizza[] = new int[N+1];
		oven[0] =  scan.nextInt();
		for (int i=1;i<D;i++) {
			oven[i] =  Math.min(oven[i-1], scan.nextInt());
		}
		/*
		for (int i=0;i<D;i++) {
			System.out.print(oven[i]+" ");
		}
		*/
		for (int i=0;i<N;i++) {
			pizza[i] =  scan.nextInt();
		}
		int tmp = 0;
		int result = 0;
		for (int i=D-1;i>0;i--) {
			if (oven[i]>=pizza[tmp]) {
				//System.out.println("oven 번호 피자 번호"+i+tmp);
				tmp++;
				if (tmp==N) {
					result = i;
					break;
				}
			}
			
		}
		if (result == 0) result = result - 1;
		System.out.println(result+1);
		/*
		for (int i=0;i<N;i++) {
			System.out.print(pizza[i]+" ");
		}
		*/
	}

}
