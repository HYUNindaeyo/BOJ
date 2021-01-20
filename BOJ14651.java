package 백준공부;

import java.util.Scanner;

public class BOJ14651 {
	static long N;
	static long count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		if (N==1) System.out.println("0");
		else if (N==2) System.out.println("2");
		else {
			long result = 2;
			for(int i=2; i<N; i++){
				result = result * 3;
				result = result % 1000000009;
			}
			System.out.printf("%d",result);
		}
			
	}
	
}
//3의 배수는 각자리 합이 3의 배수가 되는 것을 이용해서 재귀로 푸는 문제... 


//였던 15650번을 이용하여 규칙을 찾아서 노가다 쓴 문제^^ 