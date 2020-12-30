package 백준공부;

import java.util.Scanner;

public class BOJ1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		int[] array = new int[N+M+1];
		for(int i=M;i<N+1;i++) {
			int index = i-M+1;
			array[index] = i;
			index++;
			//if(i==1 ||i==2||i==3) array[i] = -1;
		}
		/*for(int i=1;i<N-M+2;i++) {
			System.out.println(i+"	"+array[i]);
		}*/
		definePrime(array,M,N);
	}
	public static void definePrime(int[] num,int M,int N) {

		for (int i = 2;i<=Math.sqrt(N);i++) {
			for (int j=1;j<=N-M+1;j++) {
				if(num[j]%i==0&&i!=num[j]) num[j] = -1;
				else continue;
			}	
		}
		for(int i=1;i<N-M+2;i++) {
			if(num[i]!=1&&num[i]!=-1) {
					System.out.println(num[i]);
			}
			
		}
	}
}
