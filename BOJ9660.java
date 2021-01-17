package 백준공부;

import java.util.Scanner;

public class BOJ9660 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long N = Long.parseLong(scan.next()); 
		if (N%7==0||N%7==2) System.out.println("CY");
		else System.out.println("SK");
	}

}
//dp로 풀려고 하다가 써보다 보니 어차피 규칙 있길래 그냥 규칙으로 함/


/*
boolean check[] = new boolean[(int) (N+1)];
//선이면 true, 후면 false 저
check[1] = true;
check[2] = false;
check[3] = true;
check[4] = true;
check[5] = true;
for (long i = 6;i<N+1;i++) {
	if(check[(int) (i-1)]||check[(int) (i-3)]||check[(int) (i-4)]) {
		
	}
}
*/