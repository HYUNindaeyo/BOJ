package 백준공부;

import java.util.Scanner;

public class BOJ2447 {
	static char[][] arr;
	 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
 
		arr = new char[N][N];
        
		star(0, 0, N, false);
 
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
 
	static void star(int x, int y, int N, boolean blank) {
 
		// 공백칸일 경우
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
 
		// 더이상 쪼갤 수 없는 블록일 때
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
 
		/*
		   N=27 일 경우 한 블록의 사이즈는 9이고, 
		   N=9 일 경우 한 블록의 사이즈는 3이듯
		   해당 블록의 한 칸을 담을 변수를 의미 size
           
		   count는 별 출력 누적을 의미
		 */
 
		int size = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) { // 공백 칸일 경우
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
		}
	}
	
}


//재귀호출로 푸는 문제/
//내 코드도 가능하지만 더 깔끔한 코드를 위에첨부 

/*
static int N;
static char ret[][];
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int N = scan.nextInt();
ret = new char[3000][3000];
int count = 0;
for (int i=N;i>1;i=i/3) {
	count++;
}
System.out.println(count);
if(N==3) {
	N3(0,0);
	
}
else {
	Nelse(count);
	}
for (int i =0;i<N;i++) {
	for (int j=0;j<N;j++) {
		 System.out.print(ret[i][j]);
	}
	 System.out.println("");
}
}


public static void Nblank(int x,int y,int count) {

}
public static void N3(int x,int y) {
for (int i=0;i<3;i++) {
	for (int j=0;j<3;j++) {
		if(i==1&&j==1) ret[x+i][y+j] = ' ';
		else ret[x+i][y+j] = '*';
	}
}

}
public static void Nelse(int x,int y) {
if(count==0) return;
if (count==1) N3();
count--;
for (int i=0;i<3;i++) {
	for (int j=0;j<3;j++) {
		if(i==1&&j==1) Nblank(N);
		else Nelse(count,N);
	}
	System.out.println("");
}
}
*/