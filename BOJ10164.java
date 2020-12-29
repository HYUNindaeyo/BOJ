package 백준공부;

import java.util.Scanner;

public class BOJ10164 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		int kx = k/m;
		int ky = k%m-1;
		if (ky == -1) {kx--; ky = m-1;}
		if (k == 0) {
			kx = 0;
			ky = 0;
		}
		//System.out.printf("kx ky %d	%d\n",kx,ky);
		//System.out.printf("n m %d	%d\n",n-1,m-1);
		int ret1 = calculate(kx,ky);
		int ret2 = calculate(n-kx-1,m-ky-1);
		System.out.println(ret1*ret2);
	}
	public static int calculate(int x2, int y2) {
		int upnum = 1;
		int undernum1 = 1;
		int undernum2 = 1;
		//System.out.println("start");
		//if (x1==0&&y1 == 0) {x2++; y2++;}
		for (int i = 1; i <= x2 ;i++) {
			undernum1 = undernum1 * i;
			//System.out.println("under 1 : "+undernum1);
		}
		
		for (int i = 1; i <= y2;i++) {
			undernum2 = undernum2 * i;
			//System.out.println("under 2 : "+undernum2);
		}
		for (int i = 1; i <= x2+y2;i++) {
			upnum = upnum * i;
			//System.out.println("up : "+upnum);
		}
		//System.out.printf("up 1 2 %d %d %d\n",upnum,undernum1,undernum2);
		//System.out.println(upnum/(undernum1*undernum2));
		return upnum/(undernum1*undernum2);
	}
}
