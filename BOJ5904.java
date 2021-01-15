package 백준공부;

import java.util.Scanner;

public class BOJ5904 {
	static int N;
	static char answer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		N = scan.nextInt();
		Moo(N);
		System.out.println(answer);

	}

	public static void Moo(int num){
		int size=3; 
		int index=0; 
		if(num==1)answer='m'; 
		else if(num<=3) answer='o'; 
		else{ 
			while(size<num){ 
			size=size*2+index+4; 
			index++; 
			}
			int front_back=(size-index-3)/2; 
			if(size-front_back+1<=num) Moo(num-size+front_back); 
			else if(num==front_back+1) answer='m'; 
			else answer='o'; 
		}
	}

}
//https://kwoncorin.tistory.com/54 여기코드 퍼왔음
//1. S(X-1)+m+o가 X+2개+S(X-1) 일 경우 => m 출력
//2. S(X-1)+m+o가 X+2개+S(X-1)에 존재할 경우 => o 출력
//3. S(X-1)+m+o가 X+2개+S(X-1)에 존재할 경우 => S(X-1) 문자열에서 N이 어디에 위치하는지 확인한다.
//기본적으로 아이디어는 같지만 재귀를 쓰는 게 중요.,, 
//1. 그냥해본 거 당연하지만 시간초과
/*
 long group[] = new long[30];
		group[0] = 3;
		group[1] = 10;
		int i = 2;
		while (true) {
			group[i] = (group[i-1]*2)+i+6;
			//System.out.println("here");
			if (group[i-1]<=N&&N<=group[i]) break;
			i++;
		}
		int num = (int) (group[i]-group[i-1]-1);
		char tmp = 'm';
		int count = 0;
		int zerocount = i+2;
		int mcount = 1;
		int printcount = 0;
		for (int a=1;a<num-2;a++) {
			if(zerocount==count&&mcount==1) {
				zerocount = zerocount-1;
				tmp = 'm';
				tmp = 'o';
				tmp = 'o';
				if (a+3<num) tmp = 'm';
				a = a+3;
				mcount = 0;
				count = 0;
			}
			else if(zerocount==count&&mcount==0) {
				tmp = 'm';
				count = 0;
				mcount = 1;
			}
			else {
				tmp = 'o';
				count++;
			}
			
		}
		for (int a=0;a<num;a++) {
			System.out.print(tmp[a]+" ");
		}
		
		System.out.println(tmp);
		System.out.println("i"+i);
		for (int j=0;j<=i;j++) {
			System.out.print(group[j]+" ");
			
		}
		
 */
//2. 이분탐색을 쓰려고 했으나 쓸데 없는 짓 같아서 접었다
/*
static long binarysearch() {
long left = 0;
long right = 1000000000;

while (left<right) {
	long mid = (left+right)/2;
	//System.out.println(mid+"mid 결과 출");
	//System.out.printf("%d	%d	%d\n",left,mid,right);
	long tmp = 1+mid+mid*mid;
	//System.out.printf("rate :%h %h\n",Z,newZ);
		if (tmp<N) left = mid + 1;
		else right = mid;
}
return left;
}
*/