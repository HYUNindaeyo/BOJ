package 백준공부;
import java.util.Scanner;

public class BOJ1149 {
	static int N;
	static int R;
	static int G;
	static int B;
	static int min = 0;
	static int ret = 0;
	static int price[][];
	static int DP[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		price = new int[3][1001];
		DP = new int[3][1001];
		
		for (int i = 0; i<N;i++) {
			price[0][i]= scan.nextInt();
			price[1][i] = scan.nextInt();
			price[2][i] = scan.nextInt();
			//System.out.printf("%d	%d	%d\n",price[0][i],price[1][i],price[2][i]);
		}
		
		DP[0][0] = price[0][0];
		DP[1][0] = price[1][0];
		DP[2][0] = price[2][0];
		for (int i = 1; i<N+1;i++) {
			DP[2][i] = Math.min(DP[0][i-1],DP[1][i-1])+price[2][i];
			DP[1][i] = Math.min(DP[0][i-1],DP[2][i-1])+price[1][i];
			DP[0][i] = Math.min(DP[2][i-1],DP[1][i-1])+price[0][i];
			//System.out.printf("DP : %d	%d	%d\n",DP[0][i],DP[1][i],DP[2][i]);
		}
		ret = Math.min(DP[0][N], DP[1][N]);
		ret = Math.min(ret, DP[2][N]);
		System.out.println(ret);
	}
	
}


/*
public static void DP(int R,int G,int B) {
if(color.equals("first")) {
	min = Math.min(R, G);
	min = Math.min(min, B);
	if (min == R) {
		ret = ret + R;
		color = "red";
	}
	else if (min == G) {
		ret = ret + G;
		color = "green";
	}
	else {
		ret = ret + B;
		color = "blue";
	}
}
else if (color.equals("red")) {
	min = Math.min(G, B);
	if (min == G) {
		ret = ret + G;
		color = "green";
	}
	else {
		ret = ret + B;
		color = "blue";
	}
	
}
else if (color.equals("green")) {
	min = Math.min(R, B);
	if (min == R) {
		ret = ret + R;
		color = "red";
	}
	else {
		ret = ret + B;
		color = "blue";
	}
}
else if (color.equals("blue")) {
	min = Math.min(R, G);
	if (min == R) {
		ret = ret + R;
		color = "red";
	}
	else if (min == G) {
		ret = ret + G;
		color = "green";
	}
}
}
*/