package 백준공부;

import java.util.Scanner;

public class BOJ14719 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		int num[] = new int[W+1];
		int sum = 0;
		int left,right;
		//boolean block[][] = new boolean[H+1][W+1];
		
		for (int i=0;i<W;i++) {
			num[i] = scan.nextInt();
		}
		for (int i=1;i<W-1;i++) {
			left = 0;
			right = 0;
			for (int j=0;j<i;j++) {
				left = Math.max(left, num[j]);
			}
			for (int j = i + 1; j < W; j++) {
				right = Math.max(num[j], right);
			}
			if (num[i] < left && num[i] < right) {
				sum = sum+ Math.min(left, right) - num[i];
			}
		}
		System.out.println(sum);
		
	}
}
/*
		for (int i=0;i<=H;i++) {
			for (int j=0;j<=W;j++) {
				if (block[i][j]) System.out.printf("%d ",1);
				else System.out.printf("%d ",
						0);
			}
			System.out.println();
		}
*/

//1. 두번째 방법으로는 https://machine-geon.tistory.com/140 링크 참고.
// 인덱스 두개를 두고 왼쪽, 오른쪽에서 제일 큰 것을 저장. 그다음 그 사이에 있는 값들 만큼 뺴준다. 

//2. 처음 아이디어는 2중 배열에 전부 담은 다음 검정으로 시작할때 / 흰색으로 시작할때경우를 나누고
// 검 -> 흰 흰검으로 변하는 경우들을 저장하여 구하는 방법을 하려고 했음 ( 전체 탐색)
/*

		for (int i=0;i<=H;i++) {
			for (int j=0;j<=W;j++) {
				if (i==0||j==0) block[i][j] =true;
				if(num[j]>0) {
					block[i][j] = true;
					num[j]=num[j]-1;
				}
			}
		}
int count = 0;
int tmp = 0;

if (block[1][j]==true) {
if (block[i][j]!=block[i-1][j]&&count%2==1) { //w->b
	if (count!=0) sum = sum + tmp;	
	count++;

	tmp = 0;
}
else if (block[i][j]==block[i-1][j]&&count%2==0) continue; //b->b 
else if (block[i][j]==block[i-1][j]&&count%2==1) { //w->w 
	tmp++;
}
else if (block[i][j]!=block[i-1][j]&&count%2==0) { //b->w
	count--;
}
}
else {
if (block[i][j]!=block[i-1][j]&&count%2==1)count--; //b->w
else if (block[i][j]==block[i-1][j]&&count%2==0) tmp++; //w->w 
else if (block[i][j]==block[i-1][j]&&count%2==1) continue; //b->b							
else if (block[i][j]!=block[i-1][j]&&count%2==0) {//w->b
	if (count!=0) sum = sum + tmp;	
	count ++;
	tmp = 0;
}

}
result[i][j] = sum;
*/